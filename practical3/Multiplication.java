package com.mycompany.practical3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Multiplication {
      public static long multiply1(long firstOperand,long secondOperand){
        long product = 0;
        for(long counter = secondOperand; counter>0; counter--){
            product += firstOperand;
        }
    


        return product;
    }

    public static long multiply2(long firstOperand,long secondOperand){
        long product = 0;
        int secondOperandLength = String.valueOf(secondOperand).length();
        for(int digitPosition = 1; digitPosition <= secondOperandLength; digitPosition++){
            int digit = (int) (secondOperand - (secondOperand / 10) * 10);
            for(int counter = digit; counter > 0; counter--){
                product = product + firstOperand;
            }
            secondOperand = secondOperand / 10;
            firstOperand = 10 * firstOperand;
        }
        return product;
    }


    




}
