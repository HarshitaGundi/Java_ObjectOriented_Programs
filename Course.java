package cs520.hw2.part1;
import javax.swing.JOptionPane;

/**
 * Class used to implement the functionality in TuitionProcedural java program
 */

public class Course {
	// declaring instance variables
	public String CourseName;
	public int costPerCredit;
	public int numberofCredits;
	
	//constructor to instantiate instance variables
	public Course(String string, int i, int j) {
		this.CourseName = string;
		this.costPerCredit = i;
		this.numberofCredits = j;
		}

	//set or mutator methods change instance variables
	public void setCourseName(String x)
	{
		CourseName = x;
	}
	
	public void setcostPerCredit(int cost)
	{
		costPerCredit =  cost;
	}
	public void setnumberofCredits(int num)
	{
		numberofCredits = num;
	}
	
	//getter method is used to access instance variable values 
	
	public String getCourseName()
	{
		 return CourseName;
	}
	
	public int getcostPerCredit()
	{
		return costPerCredit;
	}
	
	public int getnumberofCredits()
	{
		return numberofCredits;
	}
	
	//This method calculates the tuition for a course
	public int getTotalTution()
	{
		return (numberofCredits * costPerCredit);
	}
	
	//This method displays tuition of a course
	public void  printTutionDetails()
	{
		JOptionPane.showMessageDialog(null,"CourseName: " + CourseName + " Tuition: " + getTotalTution());
	}
	
	// This method compares courses based on tuition
	public void compare(Course other)
	{
		int difference = 0;
		// Tuition of current object greater than other object,difference is displayed to user
		
		if (this.getTotalTution() > other.getTotalTution())
		{
			difference = this.getTotalTution() - other.getTotalTution();
			JOptionPane.showMessageDialog(null, "Tution for " + this.getCourseName() + " is greater than tuition for " + other.getCourseName() + " by " + difference + " dollars"); 
		}
		// Tuition of other object greater than current object,difference is displayed to user
		else if (this.getTotalTution() < other.getTotalTution())
		{
			difference = other.getTotalTution() - this.getTotalTution();
			JOptionPane.showMessageDialog(null, "Tution for " + other.getCourseName() + " is greater than tuition for " + this.getCourseName() + " by " + difference + " dollars"); 
		}
		// Tuition of other object greater and  current object is equal,difference  displayed as 0 to user
		else
		{
			JOptionPane.showMessageDialog(null, "Tution for " + this.getCourseName() + " is equal to tuition for " + other.getCourseName() + " and difference is " + difference + " dollars"); 
		}	
	}
}