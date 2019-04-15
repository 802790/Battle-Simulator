/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlesimulator;

/**
 *
 * @author 802790
 */
public class Projectile {
    int x;
    int y;
    int dx;
    int dy;
    int damage;
    int speed;
    
    public Projectile(){
        
    }
    
    //Getters
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getDX(){
        return dx;
    }
    
    public int getDY(){
        return dy;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    //Setters
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setDX(int dx){
        this.dx = dx;
    }
    
    public void setDY(int dy){
        this.dy = dy;
    }
    
    //Methods
    public void move(){
        x += dx;
        y += dy;
    }
}
