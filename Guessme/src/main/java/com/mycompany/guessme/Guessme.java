/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guessme;

/**
 *
 * @author SHIVALI 
 * date created : 27.09.2021
 */
public class Guessme {public static void main(String[] args){ int number = 44; int choice = 44;

  
    if ( choice <= number){System.out.println ( " I've chosen a number. Betcha can't guess it! ");}
    
    System.out.println(" Your guess: "+ choice);

   if(choice == number){System.out.println ( " Wow,nice guess!that was it ");}
   if (choice < number){System.out.println ( " Ha, nice try - too low! I chose 11.");}
   if (choice > number){System.out.println ( " Too bad, way too high. I chose 11");}
   
}}
