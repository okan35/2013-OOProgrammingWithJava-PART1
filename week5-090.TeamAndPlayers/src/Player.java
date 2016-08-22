/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Player {
    
    private String playerName;
    private int amountOfGoal;
    
    public Player(String name){
        this.playerName = name;
    }
    
    public Player(String name, int amountOfGoal){
        this.playerName = name;
        this.amountOfGoal = amountOfGoal;
    }
    
    public String getName() {
        
        return this.playerName;
    }
    
    public int goals(){
        
        return this.amountOfGoal;
    }
    
    public String toString(){
        
        return getName() +"," + " goals " + goals();
    }
}
