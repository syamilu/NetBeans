/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tuto;

/**
 *
 * @author wanmu
 */
public class Lab3_Q1 {
    public static void main(String[] args) {
        int rows = 10, cols = 10, count=0;
        
        do{
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    count++;
                    if( count%3==0 && count%5==0 ){
                        System.out.print("fizzbuzz\t");
                    }
                    else if(count%3==0){
                        System.out.print("fizz\t\t");
                    }
                    else if(count%5==0){
                        System.out.print("buzz\t\t");
                    }
                    else{
                        System.out.print(count + "\t\t");
                    }
                }
                System.out.println();
            }
        }while(count!=100);
    }
}
