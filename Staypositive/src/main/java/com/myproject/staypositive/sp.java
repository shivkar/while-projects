/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.staypositive;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class sp {public static void main(String[] args) {
      int i = 59; String number;Scanner sk = new Scanner(System.in);
      System.out.println("What number should I count down from?" );
      number = sk.nextLine();
     while (i > 0) {
     System.out.println(i);
      i--;}
     System.out.println("Blast off");
}}
