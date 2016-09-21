import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WONSEOB
 */
public class BirdInfo {
    
    private ArrayList<Bird> Birds;

    public BirdInfo() {
        this.Birds = new ArrayList<Bird>();
    }
    
    public void addBird (String name, String latinName) {
        this.Birds.add(new Bird(name, latinName));
    }
    
    public ArrayList<Bird> birds() {
        return this.Birds;
    }
    
    public void statistics() {
        for (Bird b : Birds) {
            System.out.println(b);
        }
    }
}