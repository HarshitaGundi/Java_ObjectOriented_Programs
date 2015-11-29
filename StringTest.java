package cs520.hw3.part1;

import javax.swing.JOptionPane;

/**
 * Class to prompt user for course id, course name and tuition and
 * perform string operations on the entered string.
 * Throws appropriate exceptions
 */
public class StringTest {

	public static void main(String[] args) {
		//declarations
		String input=null;
		String result = null;
		String result1 = null;
		String result2 = null;
		int tuition = -1, pos =-1, pos1=-1;
		double discount_tuition = 0;

		try
		{
			input = JOptionPane.showInputDialog("Please enter data using format CourseId,CourseName,Tuition"); 
		    //removing white spaces
			input = input.trim();
		} catch(NullPointerException e)
		{
			System.out.println("No string value entered");
			System.exit(1);
		}
		
		try {
			//Finding index of first comma
			pos =  input.indexOf(',');
			//Extracting Course Id using substring
			result = input.substring(0, pos);
		}
		//Handling missing CourseId
		catch(IndexOutOfBoundsException  e)
		{	
	    	System.out.println("Invalid String entered. Missing or Bad CourseID");
	    	System.exit(1);
		} 
		try{	
			//Finding index of second comma
			pos1 =  input.indexOf(',',pos+1);
			//Extracting Course name using substring
			result1 =  input.substring(pos+1,pos1);
		}
		//handling missing Course Name
		catch(IndexOutOfBoundsException  e)
		{	
	    	System.out.println("Invalid String entered. Missing or Bad CourseName");
	    	System.exit(1);
		}
		//calculating tuition and discount tuition
		try{
			result2 =  input.substring(pos1+1,input.length());
			tuition = Integer.parseInt(result2);
			discount_tuition  = (tuition - tuition * 0.25);
		}
		//handling missing Tuition
		catch(IndexOutOfBoundsException  e)
		{	
	    	System.out.println("Invalid String entered. Missing or Bad Tuition");
	    	System.exit(1);
		}
		//checking tuition value is valid integer
		catch (NumberFormatException e)
		{
			System.out.println("Bad input value for tuition entered");
			System.exit(1);
		}		
		//printing to console
			System.out.println(input);
			System.out.println("First Comma Position:" + pos + ","+"Course Id:" + result +"," +"Length:" + result.length());
			System.out.println("Second Comma Position:" + pos1 + ","+"Course Name:" + result1 +","+"Length:" + result1.length());
			System.out.println("Regular Tuition:$" + tuition + ","+"Discount Tuition:$" + discount_tuition);
		}
		
		
	    
	}