/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chase
 */
public class TestScore {

    private int scores[];
    private int average;

    public TestScore(int[] testScore) throws IllegalArgumentException {
        average = validScore(testScore);
        scores = testScore;
    }

    private int validScore(int[] testScore) {
        int avg = 0;

        for (int i = 0; i < testScore.length; i++) {
            if (testScore[i] < 0 || testScore[i] > 100) {
                throw new IllegalArgumentException("Score for test: " + (i + 1) + " is out of range.");
                
            }
                avg += testScore[i];
        {
            
        }
   }
        return (avg / testScore.length);
  }

    public int getAverageOfTestScores() {
        return average;
    }
}
