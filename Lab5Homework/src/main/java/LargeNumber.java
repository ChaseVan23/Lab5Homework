
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chase
 */
public class LargeNumber {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       int num[] = new int[5];
       
       for(int i=0; i<num.length; i++){
       System.out.print("Enter integer "+(i+1)+": ");
       num[i] = keyboard.nextInt();
       }
       
       System.out.println("Please enter a number to compare to the array numbers: ");
       int numberInArray = keyboard.nextInt();
       
       displayLargeNumbers(num,numberInArray);

   }
   public static void displayLargeNumbers(int array[], int numberInArray){
       for(int i=0; i<array.length; i++){
           if(numberInArray < array[i]){
               System.out.print(array[i]+" ");
           }
       }
       System.out.println();
   }
}
