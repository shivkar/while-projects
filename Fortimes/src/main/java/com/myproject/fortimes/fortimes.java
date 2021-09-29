/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.fortimes;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class fortimes {public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
   
    int value =0;
    
   
     System.out.println("Which times table shall I recite?");
     int num2 = sk.nextInt();
     for( int num1 = 1 ; num1<= 15; num1++){System.out.println(num1 + "*" + num2 + ":" + num1*num2);value++;}
}}
