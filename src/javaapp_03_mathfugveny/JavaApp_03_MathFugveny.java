/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_03_mathfugveny;

import java.util.Scanner;

/**
 *
 * @author grabe
 */
public class JavaApp_03_MathFugveny {

    
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        
        double valosPozitivSzam;
        do {
            System.out.println("Kérem adjon meg egy pozitív valós számot: ");
            valosPozitivSzam = sr.nextDouble();
        } while (valosPozitivSzam<0);
        
        System.out.println(
        String.format("A megadot szam %d és a %d számok között van, és ezek közül a %d számhoz van közelebb. \n"+
                "A szám egész része: %d \n"+
                "A szám törtrésze: %f*\n",
                (int)Math.floor(valosPozitivSzam),
                (int)Math.ceil(valosPozitivSzam),
                (int)Math.round(valosPozitivSzam),
                (int)Math.floor(valosPozitivSzam),
                valosPozitivSzam-Math.floor(valosPozitivSzam)
                )
        );
        
        
    }
    
}
