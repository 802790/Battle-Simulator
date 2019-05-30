/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlesimulator;

import java.util.ArrayList;

/**
 *
 * @author 802790
 */
public class Fighter{
    //Fields
    int x;
    int y;
    double dx;
    double dy;
    int damage;
    int speed;
    int health;
    boolean canAttack;
    ArrayList<Fighter> fighterList;
    //Constructors
    public Fighter(){
        
        
        canAttack = true;
        }
    
    //Getters
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public double getDX(){
        return dx;
    }
    
    public double getDY(){
        return dy;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public boolean getCanAttack(){
    return this.canAttack;
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
    
    public void setCanAttack(boolean canAttack){
        this.canAttack = canAttack;
    }
    
    //Methods
    
    public void attack(){
        if(this.canAttack){
        this.health -= 50;
        
        }
        
    }
    
    public void move(){
        x += dx;
        y += dy;
    }
    
    public void healthRegen(){
        if(this.health < 150)
        this.health += 1;
    }
    
    public void update() {
        move();
    }
    
    public void changeDirection(){
        
        
        if((this.x < 50 && this.dx < 0) || (this.x > 1350 && this.dx > 0)){
            this.dx *= -1;
        }
        
        if((this.y < 50 && this.dy < 0) || (this.y > 750 && this.dy > 0)){
            this.dy *= -1;
        }
    }
    
    
    
}
