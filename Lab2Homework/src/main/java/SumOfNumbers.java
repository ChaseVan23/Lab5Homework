
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
public class SumOfNumbers {
    public static void main(String[] args) {
        
        //Ask user for input
        Scanner keyboard = new Scanner(System.in);
        
        int userNumber = 0;
        int sum = 0;
        int i;
        
        //Retrieve user number
        System.out.println("Please enter a non-zero, positive integer: ");
        userNumber = keyboard.nextInt();
       
        
        //Start the loop to calculate the sum
        for (i = 1; i <= userNumber; i++) {
            sum = sum + i; 
        }
        
        //Display the sum
        System.out.println("The sum of the number is equal to: " + sum);
        
    }
}
