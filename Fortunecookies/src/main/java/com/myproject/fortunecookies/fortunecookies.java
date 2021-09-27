/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.fortunecookies;

import java.util.Random;

/**
 *
 * @author SHIVALI
 */
public class fortunecookies {public static void main(String[] args){
    Random randomizer = new Random();
    int x = randomizer.nextInt(2);
    switch(x){case 0 : System.out.println("Your Geek Fortune: Those aren't the droids you're looking for.");
    break;
    case 1 : System.out.println("Your Geek Fortune: Never go in against a Sicilian when death is on the line!");
    break;
    case 2 : System.out.println("Your Geek Fortune: Goonies never say die.");
    break;
    case 3 : System.out.println("Your Geek Fortune:Try not. Do, or do not. There is no try.");
    }
}}
