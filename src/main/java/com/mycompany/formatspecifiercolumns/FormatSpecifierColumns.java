/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formatspecifiercolumns;

/**
 *
 * @author MKAY
 */
public class FormatSpecifierColumns {

    public static void main(String[] args) {
        //Variable declaration region below
        String topLeft = "Group-A";
        String topRight = "Group-B";
        
        String member1Right = "Jack";
        String member2Right = "John";
        String member3Right = "Jacob";
        String member4Right = "Nigel";
        String member5Right = "Angela";
        String member6Right = "Kates";
        
        String member1Left = "Linus";
        String member2Left = "Jason";
        String member3Left = "Janet";
        String member4Left = "Sean";
        String member5Left = "Bob";
        String member6Left = "Katie";
        //Variable declaration region above
        
        System.out.printf("%-10s %-10s\n", topLeft, topRight);
        System.out.printf("%-10s %-10s\n", member1Right, member1Left);
        System.out.printf("%-10s %-10s\n", member2Right, member2Left);
        System.out.printf("%-10s %-10s\n", member3Right, member3Left);
        System.out.printf("%-10s %-10s\n", member4Right, member4Left);
        System.out.printf("%-10s %-10s\n", member5Right, member5Left);
        System.out.printf("%-10s %-10s\n", member6Right, member6Left);
       
        
        
    }
}
