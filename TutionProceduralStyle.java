package cs520.hw2.part1;
import javax.swing.JOptionPane;

/**
 * Prompts user for course name, number of credits and cost per credit for 2 courses.
 * Calculate the tuition for courses and compare the tuition to tell user.
 */
public class TutionProceduralStyle {

	public static void main(String[] args) {
       //declarations
		int  firstcostpercredit,secondcostpercredit,firstcoursetution,secondcoursetution,num_credit1,num_credit2,difference;
		
		//Prompting user for first course name, number of credits and cost per credit 
		String course1 = JOptionPane.showInputDialog("Please enter first course name: "); 
		String credit1 =  JOptionPane.showInputDialog("Please enter number of credits for first course: "); 
		String firstcredit = JOptionPane.showInputDialog("Please enter cost per credit for first course: "); 

		//converting input from string to integer
		num_credit1 = Integer.parseInt(credit1); 		
		firstcostpercredit = Integer.parseInt(firstcredit); 
		firstcoursetution = num_credit1 * firstcostpercredit;
		
		//displaying First course name and its tuition
		JOptionPane.showMessageDialog(null, "First Course Name: " + course1 + " First Course Tuition: " + firstcoursetution);
		
		//Prompting user for second course name, number of credits and cost per credit 
		String course2 = JOptionPane.showInputDialog("Please enter second course name: "); 
		String credit2 =  JOptionPane.showInputDialog("Please enter number of credits for second course: "); 
		String secondcredit= JOptionPane.showInputDialog("Please enter cost per credit for second course: "); 

		//converting input from string to integer
		num_credit2 = Integer.parseInt(credit2); 		
		secondcostpercredit = Integer.parseInt(secondcredit); 
		secondcoursetution = num_credit2 * secondcostpercredit;
		
		//displaying second course name and its tuition
		JOptionPane.showMessageDialog(null, "Second Course Name: " + course2 + " Second Course Tuition: " + secondcoursetution);
		
		
		//comparing tuitions of first and second courses
		
		// when first course tuition is greater than second course tuition,the difference is displayed  in dialog box
		if(firstcoursetution > secondcoursetution)
		{
			difference = firstcoursetution - secondcoursetution;
			JOptionPane.showMessageDialog(null, "Tution for " + course1 + " is greater than tuition for " + course2 + " by " + difference + " dollars"); 
			
		}
		// when second course tuition is greater than first course tuition,the difference is displayed in dialog box
		else if (firstcoursetution < secondcoursetution)
		{
			difference = secondcoursetution - firstcoursetution;
			JOptionPane.showMessageDialog(null, "Tution for " + course2 + " is greater than tuition for " + course1 + " by " + difference + " dollars"); 
		}
		//when tuition of first course and second course is equal,difference displayed as 0 in dialog box
		else
		{
			difference = firstcoursetution - secondcoursetution;
			JOptionPane.showMessageDialog(null, "Tution for " + course1 + " is equal to tuition for " + course2 + " and difference is " + difference  + " dollars"); 
		}
	}
}