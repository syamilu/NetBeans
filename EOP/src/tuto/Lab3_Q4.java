/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tuto;

import java.util.Scanner;

/**
 *
 * @author wanmu
 */
public class Lab3_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mean, deviation, number = 0, total1 = 0, total2 = 0;
        int numbercount = 10;
        
        System.out.print("Enter 10 numbers : ");
        for(int i = 0; i<numbercount;i++){
            number = input.nextDouble();
            total1 += number;
            total2 = total2 + Math.pow(number,2);
        }
        mean = total1 / numbercount;
        deviation = Math.sqrt( (total2 - (Math.pow(total1,2)/numbercount)) / (numbercount - 1));
        
        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f\n", deviation);
        input.close();
    }
}
