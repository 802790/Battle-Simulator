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
public class Arrow extends Projectile {
    
    private ImageIcon ii;
    private Image img;
    
    public Arrow(){
        this.damage = 30;
    ii = new ImageIcon(getClass().getResource("/images/Arrow.png"));
    img = ii.getImage();
    }
    public void draw(Graphics g){
        
        g.drawImage(img, this.getX(), this.getY(), 50, 50, null);
        
    }
}
