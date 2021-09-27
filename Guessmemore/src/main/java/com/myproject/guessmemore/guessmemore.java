/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.guessmemore;

import java.util.Random;

/**
 *
 * @author SHIVALI
 */
public class guessmemore {public static void main(String[] args) {
    Random randomizer = new Random();
   int x = randomizer.nextInt(100);
    System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
    System.out.println("Your guess:" + randomizer.nextInt(50));
    System.out.println("Ha, nice try - too low! Try again!");
    System.out.println("Your guess:" + randomizer.nextInt(100));
    System.out.println("Wow, nice guess! That was it!");
}}
