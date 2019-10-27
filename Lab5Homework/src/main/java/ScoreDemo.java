
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
public class ScoreDemo {
    public static void main(String[] args) {
        int[] testSc = getArray(readInput("How many test scores would you like to enter?"));

        try {
                TestScore ts = new TestScore(testSc);
                System.out.println("\nAverage of the test scores is: " + ts.getAverageOfTestScores());
            }
        catch(IllegalArgumentException e) 
            {
                System.out.println("You entered an invalid test score.\n" + e.getMessage());
            }

        }
    
    /**
     *
     * @param intln
     * @return
     */
    public static int[] getArray(int intln) {
        int[] scores = new int[intln];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = readInput("Enter score for test: " + (i + 1) + " ");
        }
        return scores;
    }

    public static int readInput(String stringln) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringln);
        return keyboard.nextInt();
    }
}
