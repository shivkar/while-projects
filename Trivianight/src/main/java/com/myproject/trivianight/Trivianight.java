/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.trivianight;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class Trivianight {public static void main(String[] args){
    
  int answer = 4 ;String stringanswer ="";int answer1= 2;String stringanswer1 =""; int sum = 2 ;
 
  Scanner sk = new Scanner(System.in);
  System.out.println(" It's TRIVIA NIGHT! Are you ready?!");
  System.out.println("FIRST QUESTION!");
  System.out.println("What is the Lowest Level Programming Language?");

 {System.out.println(" 1) Source Code");}
 {System.out.println(" 2) Assemble Language");}
 {System.out.println(" 3) C#");}
 {System.out.println(" 4) Machine Code");}
   stringanswer = sk.nextLine();
   if (answer <= 4){System.out.println("Your Answer = " + answer);}
  else {System.out.println("wrong answer");}
     
  System.out.println("SECOND  QUESTION!");
  System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
 {System.out.println(" 1)Grace Hopper");}
 {System.out.println(" 2)Alan Turing");}
 {System.out.println(" 3)Charles Babbage");}
 {System.out.println(" 4) Larry Page");}
   stringanswer1 = sk.nextLine();
   if (answer1 <= 2){System.out.println("Your Answer = " + answer1);}
  else {System.out.println("wrong answer");}  
   
 {System.out.println("Nice job- you got " + sum + " correct");}  
}}
