
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chase
 */
public class GetArrays {
    public static void main(String[] args) {
        int testArray[] = {10, 50, 20, 70, 100};
        
        System.out.println(Arrays.toString(testArray));
        
        System.out.println("The total value in the array in the array is: " + getTotal(testArray));
        System.out.println("The average value in the array in the array is: " + getAverage(testArray));
        System.out.println("The highest value in the array in the array is: " + getHighest(testArray));
        System.out.println("The lowest value in the array in the array is: " + getLowest(testArray));
        
    }
    
    public static int getTotal(int[] testArray) {
        int sumOfNumbers = 0;
        
        for(int i = 0; i < testArray.length; i++) {
            sumOfNumbers += testArray[i];
        }
        return sumOfNumbers;
    }
            
    public static double getAverage(int[] testArray) {
        double averageOfNumbers;
        
        averageOfNumbers = (getTotal(testArray) / (double) testArray.length);                
        return averageOfNumbers;
    }
    
    public static int getHighest(int[] testArray) {
        int highestOfNumbers = testArray[0];
        
        for(int i = 1; i < testArray.length; i++) {
            if (testArray[i] > highestOfNumbers) {
                highestOfNumbers = testArray[i];       
                }
            
            }
             return highestOfNumbers;  
    }
    public static int getLowest(int[] testArray) {
        int lowestOfNumbers = testArray[0];
        
        for(int i = 1; i < testArray.length; i++) {
            if (testArray[i] < lowestOfNumbers) {
                lowestOfNumbers = testArray[i];       
                }
            
            }
             return lowestOfNumbers; 
    }
}

