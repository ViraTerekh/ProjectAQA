package test;

import java.util.Scanner;

public class SimpleCalculator {
    public static class Calculator {
         static int sum(int a, int b) {
            return a + b;
         }

         static int substract(int a, int b) {
            return a - b;
         }

         static int multiply(int a, int b) {
            return a * b;
         }

        static int divide(int a, int b) {
            return a / b;
        }
        public static void main(String[] args) {
            Scanner myInput = new Scanner( System.in );
            int a;
            int b;

            System.out.print( "Enter first integer: " );
            a = myInput.nextInt();

            System.out.print( "Enter second integer: " );
            b = myInput.nextInt();

            System.out.printf( "Sum = %d\n", sum(a, b) );
            System.out.printf( "Substract = %d\n", substract(a, b) );
            System.out.printf( "Multiply = %d\n", multiply(a, b) );
            System.out.printf( "Divide = %d\n", divide(a, b) );
        }
    }
}
