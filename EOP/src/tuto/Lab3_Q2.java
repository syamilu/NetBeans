/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tuto;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author wanmu
 */
public class Lab3_Q2 {
    public static void main(String[] args) throws InterruptedException {
        int score;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter your score(-1 to end) : ");
            score = input.nextInt();
            if(score==-1){
                System.out.print("Ending Program");
                for(int i=0;i<5;i++){
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                }
                System.out.println();
            }else if(score>=60){
                System.out.println("You pass the exam.");
            }else if(score<60){
                System.out.println("You dont pass the exam.");
            }
            
        }while(score!=-1);
        input.close();
    }
}