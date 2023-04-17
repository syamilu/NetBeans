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
public class Lab3_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, temp, newnumber, size, sum=0;
        String str;
        
        System.out.print("Enter an integer number : ");
        number = input.nextInt();
        str = Integer.toString(number);
        size = str.length();
        
        for(int i=0; i<size;i++){
            temp = number % 10;
            number = number/10;
            sum += temp;
        }
        
        System.out.printf("The sum of total individual digits is %d\n", sum);
        input.close();
    }
}

       /*this is for checkin purpose :-
        System.out.println("n"+number);
        System.out.println("t"+temp);
        System.out.println("s"+sum);*/