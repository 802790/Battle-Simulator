/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlesimulator;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author 802790
 */
public class BattleSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame map = new JFrame("Graphics");
        map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        map.setSize(1400, 800);
        Arena c = new Arena();
        map.add(c);
        map.setBackground(Color.black);
        map.setVisible(true);
        map.setLocationRelativeTo(null);
        //map.addKeyListener(new KeyAdapter() {
        //@Override
        //public void keyPressed(KeyEvent e) {
       /*c.keyPressed (e);
        
        
    }
        	            @Override
            public void keyReleased(KeyEvent e) {
              c.keyReleased(e);
            }
});*/
    //}
    
    }
}