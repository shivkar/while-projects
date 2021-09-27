/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.fieldday;



/**
 *
 * @author SHIVALI
 */
public class fieldday {public static void main(String[] args) {
    String name = "Shivali"; String team = "Black Holes";
   int Shivali = 3;
    int Baggins = 8;
    int Dresden = 5;
    int Howl = 4;
    int Vimes= 2;
    
    System.out.println("What's your last name?" + name);
    if (Shivali > Baggins ){System.out.println("Red Dragons");}
    else if ( Shivali > Dresden && Shivali < Howl){System.out.println("Dark Wizards");}
    else if (Shivali > Howl && Shivali < Vimes){System.out.println("Night Guards");}
    else if (Shivali > Vimes){System.out.println("Aha! You're on the team " + team + " ! ");}
    else{System.out.println("wrong team");} 
   {System.out.println("Good luck in the games!");
}
}
    
}
