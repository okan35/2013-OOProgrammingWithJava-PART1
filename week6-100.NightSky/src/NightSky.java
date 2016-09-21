/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

//    public NightSky(double density) {
//
//        this(density, 20, 10);
//    }
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {

        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0;
    }

    public void printLine() {

        Random rnd = new Random();
        double dbl = 0.0;
        for (int i = 0; i < this.width; i++) {
            dbl = rnd.nextDouble();
            if (dbl < density) {
               
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {

        
        
         int stars = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return stars;

    }

}
