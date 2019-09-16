
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
public class BankingCharges {
    public static void main(String args[]) {
    
    //Get input from user
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter the number of checks: ");
    
    int numberOfChecks = scanner.nextInt();
    
    double fee = 10;
    
    if(numberOfChecks < 20){
      fee += 0.10*numberOfChecks;
    }
    else if(numberOfChecks >= 20 && numberOfChecks <= 39 ){
      fee += 0.08*numberOfChecks;
    }
    else if(numberOfChecks >= 40 && numberOfChecks <= 59){
      fee += 0.06*numberOfChecks;
    }
    else{
      fee += 0.04*numberOfChecks;
    }
    System.out.println("Total fee: $"+ fee);
  }
}

