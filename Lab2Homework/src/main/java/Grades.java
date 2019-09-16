
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chase
 */
public class Grades {
    public static void main(String[] args) {
       
        //Variables
        float firstTestScore;
        float secondTestScore;
        float thirdTestScore;
        float averageOfScores;
        String inputFromUser;
        DecimalFormat format = new DecimalFormat("##.00");
        
        
        //Get first test score
        inputFromUser = JOptionPane.showInputDialog("Please enter the first test score: ");
                firstTestScore = Integer.parseInt(inputFromUser);
        
         //Get second test score
        inputFromUser = JOptionPane.showInputDialog("Please enter the second test score: ");
                secondTestScore = Integer.parseInt(inputFromUser);
                
         //Get third test score
        inputFromUser = JOptionPane.showInputDialog("Please enter the third test score: ");
                thirdTestScore = Integer.parseInt(inputFromUser);
                
        //Calculate the average of the three scores
        averageOfScores = (float) ((firstTestScore + secondTestScore + thirdTestScore) / 3);
        
        //check for condition of grade A
        if (averageOfScores >= 90 && averageOfScores <= 100) 
            JOptionPane.showMessageDialog(null, "Average of the score is: " + format.format(averageOfScores)
                                                    + "\nThe grade is: A!");
        //check condition of grade B
        else if (averageOfScores >= 80 && averageOfScores <= 89)
            JOptionPane.showMessageDialog(null, "Average of test score is: " + format.format(averageOfScores) 
                                                    + "\nThe grade is: B!");
        //check condition of grade C
        else if (averageOfScores >= 70 && averageOfScores <= 79)
            JOptionPane.showMessageDialog(null, "Average of test score is: " + format.format(averageOfScores) 
                                                    + "\nThe grade is: C!");
        //check condition of grade D
        else if (averageOfScores >= 60 && averageOfScores <= 69)
            JOptionPane.showMessageDialog(null, "Average of test score is: " + format.format(averageOfScores) 
                                                    + "\nThe grade is: D!");
        //check condition of grade F
        else 
            JOptionPane.showMessageDialog(null, "Average of test score is: " + format.format(averageOfScores) 
                                                    + "\nThe grade is: F!");
        
        
    }
}
