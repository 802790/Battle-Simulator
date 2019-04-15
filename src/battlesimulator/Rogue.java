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
public class Rogue extends Fighter{
    private ImageIcon ii;
    private Image img;
    
    public Rogue(){
        this.health = 200;
        this.dx = 2.5;
        this.dy = 2.5;
        ii = new ImageIcon(getClass().getResource("/images/Rogue.png"));
        img = ii.getImage();
    }
    
    public void shootArrow(){
        Arrow arrow = new Arrow();
        arrow.setX(this.x);
        arrow.setY(this.y);
    }
    
    
    
    public void draw(Graphics g){
        //g.setColor(Color.ORANGE);
        //g.fillRect(x - 12, y - 12, 25, 25);
        g.drawImage(img, this.getX(), this.getY(), 50, 50, null);
    }
}
