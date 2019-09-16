
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
public class BarChart 
{
    public static void main(String[] args) 
    {
        
        //Input from user
        Scanner keyboard = new Scanner(System.in);
        
        //variables for user inout
        int store1;
        int store2;
        int store3;
        int store4;
        int store5;
        
        //final answer variables 
        int store1Final;
        int store2Final;
        int store3Final;
        int store4Final;
        int store5Final;
        
        //Get store sales for today
        System.out.println("Enter today's sales for store 1: ");
            store1 = keyboard.nextInt();
            
        System.out.println("Enter today's sales for store 2: ");
            store2 = keyboard.nextInt();
            
        System.out.println("Enter today's sales for store 3: ");
            store3 = keyboard.nextInt();
            
        System.out.println("Enter today's sales for store 4: ");
            store4 = keyboard.nextInt();
       
        System.out.println("Enter today's sales for store 5: ");
            store5 = keyboard.nextInt();
            
        System.out.print("SALES BAR CHART\n");
        
        //displays bar chart with *
        store1Final = store1 / 100;
        System.out.print("Store 1: ");
        for(int i = 0; i <= store1Final; i++)
            System.out.print("*");
        
        store2Final = store2 / 100;
        System.out.print("\nStore 2: ");
        for(int i = 0; i <= store2Final; i++)
            System.out.print("*");
        
        store3Final = store3 / 100;
        System.out.print("\nStore 3: ");
        for(int i = 0; i <= store3Final; i++)
            System.out.print("*");
        
        store4Final = store4 / 100;
        System.out.print("\nStore 4: ");
        for(int i = 0; i <= store4Final; i++)
            System.out.print("*");
        
        store5Final = store5 / 100;
        System.out.print("\nStore 5: ");
        for(int i = 0; i <= store5Final; i++)
            System.out.print("*");
    } 
}
