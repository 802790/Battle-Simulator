/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlesimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.JPanel;
import java.util.Timer;

/**
 *
 * @author 802790
 */
public class Arena extends JPanel {
    ArrayList<Fighter> fighters = new ArrayList();
    ArrayList<Integer> attacked = new ArrayList();
    Knight[] knight = new Knight[5];
    Rogue[] rogue = new Rogue[5];
    Wizard[] mage = new Wizard[5];
    int f;
    int g;
    private final Timer timer;
    
    
    public Arena(){
        for(int i = 0; i < 5; i++){
            knight[i] = new Knight();
            rogue[i] = new Rogue();
            mage[i] = new Wizard();
            
            fighters.add(knight[i]);
            fighters.add(mage[i]);
            fighters.add(rogue[i]);
            
            knight[i].setX((int) (Math.random() * 1000));
            rogue[i].setX((int) (Math.random() * 1000));
            mage[i].setX((int) (Math.random() * 1000));
            
            knight[i].setY((int) (Math.random() * 1000));
            rogue[i].setY((int) (Math.random() * 1000));
            mage[i].setY((int) (Math.random() * 1000));
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 0, 25);
        timer.scheduleAtFixedRate(new healthRegenerate(), 0, 500);
        timer.scheduleAtFixedRate(new ShootArrow(), 0, 250);
        timer.scheduleAtFixedRate(new ShootFireball(), 0, 400);
        
    }
    
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.setBackground(Color.black);
            for(int i = 0; i < 5; i++){
                knight[i].draw(g);
                rogue[i].draw(g);
                mage[i].draw(g);
            }
            g.dispose();
    }
        
        public void fight(){
            for(f = 0; f < fighters.size(); f++){
                for(g = 0; g < fighters.size(); g++){
                        if(f != g && fighters.get(f).getX() + 10 > fighters.get(g).getX() - 10 && fighters.get(f).getX() - 10 < fighters.get(g).getX() + 10 && fighters.get(f).getY() - 10 < fighters.get(g).getY() + 10 && fighters.get(f).getY() + 10 > fighters.get(g).getY() - 10  ){
                            if(fighters.get(g).canAttack){
                            fighters.get(f).health -= 20;
                            attacked.add(g);
                            fighters.get(g).setCanAttack(false);
                            }
                            
                            
                            
                    }
                }
            }
            timer.schedule(new attackTrue(), 1000);
        }
        public class ShootArrow extends TimerTask{
            
            @Override
            public void run(){
                
            }
        }
        
        public class ShootFireball extends TimerTask{
            
            @Override
            public void run(){
                
            }
        }
                
    public class healthRegenerate extends TimerTask {

        @Override
        public void run() {
            for(int i = 0; i < fighters.size(); i++){
                fighters.get(i).healthRegen();
                
            }
        }
    }
    
    public class attackTrue extends TimerTask {
        
        public void run() {
            for(int x = 0; x < attacked.size(); x++){
                if(x == fighters.size()){
                    break;
                }
            fighters.get(attacked.get(x)).setCanAttack(true);
            }
            attacked.clear();
        }
        
    }

    public class ScheduleTask extends TimerTask  {
        int rand = 0;	    
        int x = fighters.size() - 1;
        @Override
        public void run() {
            
            
            for(int i = 0; i < fighters.size(); i++){
                
                fighters.get(i).move();
                
                fighters.get(i).changeDirection();
                
                
                
                if(fighters.get(i).getX() > 10000){
                    x--;
                    fighters.remove(i);
                }
                
                if(i == fighters.size()){
                    break;
                }
                
                if (x <= 3 && fighters.get(i).getX() < 10000 && fighters.get(i).getX() > 700){
                    fighters.get(i).dx = -3; 
                }else if(x <= 3 && fighters.get(i).getX() < 10000 && fighters.get(i).getX() < 700){
                    fighters.get(i).dx = 3;
                }
                
                if (x <= 3 && fighters.get(i).getY() < 10000 && fighters.get(i).getY() > 400){
                    fighters.get(i).dy = -3; 
                }else if(x <= 3 && fighters.get(i).getY() < 10000 && fighters.get(i).getY() < 400){
                    fighters.get(i).dy = 3;
                }
                System.out.println(x);
                
            }
            fight();
            for(int x = 0; x < fighters.size(); x++){
                    if (fighters.get(x).health <= 0){
                        fighters.get(x).setX(1000000);
                        fighters.get(x).setY(1000000);
                    }
                }
            repaint();
        }
    
    }
        
}


