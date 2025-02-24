/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab_Act2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the 1st number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Input the 2nd number: ");
            int num2 = scanner.nextInt();
            
            System.out.print("Input the 3rd number: ");
            int num3 = scanner.nextInt();
            
            
            int greatest;
            if (num1 >= num2 && num1 >= num3) {
                greatest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
            
            
            System.out.println("The greatest number is: " + greatest);
        }
    }
}
