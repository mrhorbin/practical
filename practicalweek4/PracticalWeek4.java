/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicalweek4;

import java.util.*;
import utilility.StringToolkit;

public class PracticalWeek4 {

    public static void main(String[] args) {
        System.out.println("Enter a String:  ");
        Scanner scanner = new Scanner(System.in);
        String aString = scanner.nextLine();
        System.out.println("\nThe reverse string is: "+ StringToolkit.reverse(aString));
        
    }
}
