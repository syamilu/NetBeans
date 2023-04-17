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
public class Lab3_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines, i, j;
        
        System.out.print("Enter number of lines(+ve integer only) : ");
        lines = input.nextInt();
        
        while(lines<=0){
            System.out.print("Wrong input, POSITIVE integer only : ");
        }
        
        //pattern A
        System.out.println("Pattern A :-");
        for(i=0;i<lines;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //pattern B
        System.out.println("Pattern B :-");
        for(i=0;i<lines;i++){
            for(j=0;j<lines;j++){
                if(j==i||j>=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        
        //pattern C
        System.out.println("Pattern C :-");
        for(i=1;i<=lines;i++){
            for(j=1;j<lines*2;j++){
                if(j<=lines-i||j>=lines+i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
