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
public class Knight extends Fighter {
    private ImageIcon ii;
    private Image img;
    
    public Knight(){
        this.health = 200;
        this.dx = 2;
        this.dy = 2;
        ii = new ImageIcon(getClass().getResource("/images/Knight.png"));
        img = ii.getImage();
    }

    
    
    public void draw(Graphics g){
        //g.setColor(Color.lightGray);
        //g.fillRect(x - 12, y - 12, 25, 25);
        g.drawImage(img, this.getX(), this.getY(), 50, 50, null);
        
    }
    
    
}
