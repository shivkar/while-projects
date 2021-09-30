/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.barleycontrolledchaos;


import java.util.stream.IntStream;

/**
 *
 * @author SHIVALI
 */
public class barley {
    public static void main(String[] args) {

        String color = "magenta"; // call color method here
       String animal = "mammoth"; // call animal method again here
        String colorAgain = "periwinkle"; // call color method again here
         int weight = 80; // call number method,
        
        IntStream distance = IntStream.range(10,20); 
         // call number method,
            // with a range between 10 - 20
       IntStream number =  IntStream.range(10000,20000); // call number method,
            // with a range beetween 10000 - 20000
         IntStream time = IntStream.range(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???

    
}

