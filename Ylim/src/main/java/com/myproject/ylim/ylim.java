/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.ylim;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class ylim { 

  
public static void main(String[] args){ 
    
 String name;  name= "Shivali";
int year = 1980;

if (year <= 1980 ) 

{System.out.println( " Hey, let's play a game! What's your name? " + name);
 System.out.println("Ok, Shivali , when were you born " + year );
 System.out.println(" Well, Did you know that Pixar's 'Up' came out over a decade ago?" );
   
if( year < 1995){System.out.println("And that the first Harry Potter came out over 15 years ago!");}
if( year < 1985){System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");}
if( year < 1975){System.out.println("The MASH TV series has been around for almost half a century!");}

} }}
