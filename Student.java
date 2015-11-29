package cs520.hw3.part2;

/**
 * This class sets name and homework marks of student and 
 * calculates average of all homework grades
 */
public class Student{

	//Instance variables are declared
	private  String name;
	private int homework1, homework2, homework3, homework4, homework5,homework6;

	
	//Constructor with name
	public  Student(String name)
	{
		this.name = name;
	}
	
	//This method sets marks of  homeowork1 
	public  void sethomework1(int homework1)
	{
		this.homework1 = homework1;
	}
	
	//This method sets marks of  homeowork2
	public  void sethomework2(int homework2)
	{
		this.homework2 = homework2;
	}
	
	//This method sets marks of  homeowork3
	public  void sethomework3(int homework3)
	{
		this.homework3 = homework3;
	}
	
	//This method sets marks of  homeowork4
	public  void sethomework4(int homework4)
	{
		this.homework4 = homework4;
	}
	
	//This method sets marks of  homeowork5
	public  void sethomework5(int homework5)
	{
		this.homework5 = homework5;
	}
	
	//This method sets marks of  homeowork6
	public void sethomework6(int homework6)
	{
		this.homework6 = homework6;
	}
	
	//This method computes average of homework1 to homework6 and returns average as a double
	public double computeAverage()
	{
		return (double)(homework1 +	homework2 + homework3 + homework4 + homework5+ homework6)/6;
	}
	
	//To string method is overridden to print student name and average
	public String toString()
	{
		return( this.name + "'s average grade is " +  String.format("%.2f",computeAverage())); 
	}
}