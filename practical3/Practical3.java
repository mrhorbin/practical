package com.mycompany.practical3;



public class Practical3 {

    public static void main(String[] args) {
        long firstOperand = 123;
        long secondOperand = 1000000000;
        System.out.println("firstOperand = " + firstOperand + "secondOperand");
        
        System.out.println("\nAlgorithm 1");
        System.out.println("==========");
        long startTime1 = System.currentTimeMillis();
        long product = Multiplication.multiply1(firstOperand, secondOperand);
        System.out.println("Result: " + firstOperand + " * " + secondOperand + " = " + product);
        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Execution time for Algorithm 1: " + elapsedTime1 + "ms\n\n");
        
        System.out.println("\nAlgorithm 2");
        System.out.println("==========");
        long startTime2 = System.currentTimeMillis();
        product = Multiplication.multiply2(firstOperand, secondOperand);
        System.out.println("Result: " + firstOperand + " * " + secondOperand + " = " + product);
        long endTime2 = System.currentTimeMillis();
        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Execution time for Algorithm 2: " + elapsedTime2 + "ms\n\n");
        
    }
}
