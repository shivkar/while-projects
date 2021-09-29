/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.bewarethekaren;

/**
 *
 * @author SHIVALI
 */
public class bewarethekaren {public static void main(String[] args){
    System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");
        
        int depthDeepinft = 0;// Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        
        while(depthDeepinft < 36200){
            System.out.println("So far, we've swum " + depthDeepinft + " feet");
        if(depthDeepinft >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;}
             depthDeepinft += 1000;}
             System.out.println("");
             System.out.println("We ended up swimming " +depthDeepinft + " feet down.");
        System.out.println("I bet we can do better next time!");
             
}}
