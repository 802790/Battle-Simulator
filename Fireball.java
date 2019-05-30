package battlesimulator;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 802790
 */
public class Fireball extends Projectile {
    
    private ImageIcon ii;
    private Image img;
    public Fireball(){
        this.damage = 50;
        ii = new ImageIcon(getClass().getResource("/images/Fireball.png"));
        img = ii.getImage();
    }
    
    public void draw(Graphics g){
        
        g.drawImage(img, this.getX(), this.getY(), 50, 50, null);
        
    }
    
}
