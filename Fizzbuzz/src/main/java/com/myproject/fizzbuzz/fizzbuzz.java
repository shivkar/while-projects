/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class fizzbuzz {public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    System.out.println("How many units of fizzing and buzzing do you need in your life? "); 
    int n = sk.nextInt();
    for(int i =1;i <= n;i++){if(i%3==0&&i%5==0){System.out.println("FizzBuzz");}else if( i%3 ==0)  
            {System.out.println("Fizz");}else if (i%5==0) {System.out.println("Buzz");}else  {System.out.print(i); {System.out.println(","+" "); }       
  
} }}}  
        
  

