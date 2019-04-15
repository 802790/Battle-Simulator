/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlesimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 802790
 */
public class Wizard extends Fighter{
    private ImageIcon ii;
    private Image img;
    
    public Wizard(){
        this.health = 150;
        this.dx = 1.5;
        this.dy = 1.5;
        ii = new ImageIcon(getClass().getResource("/images/Wizard.png"));
        img = ii.getImage();
    }
    
    public void shootFireball(){
        Fireball fire = new Fireball();
    }
    
    public void draw(Graphics g){
        //g.setColor(Color.blue);
        //g.fillRect(x - 12, y - 12, 25, 25);
        g.drawImage(img, this.getX(), this.getY(), 50, 50, null);
        
    }
    
    
}
