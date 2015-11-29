package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		String inputFileName = "data.txt";
		FileReader fileReader = null;

		//creating file reader object
		try{
			fileReader  =  new FileReader(inputFileName);
		}
		//handling file not found exception
		catch(FileNotFoundException e){
				e.printStackTrace();
		}
		
       //Using BufferedReader class to read the data.txt file		
		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		
		try{
				input = reader.readLine();
			
				//  Reading contents of text file line by line using while loop
				while (input!=null)
				{
					processInputData(input);
					input = reader.readLine();
				}
				//handling null pointer exception
			} catch (IOException e){
					e.printStackTrace();
			}
		//closing input
		try{
				fileReader.close();
			}catch (IOException e){
				e.printStackTrace();
			}
	}
	
	private static void processInputData(String data){
		  
		  // The string argument is tokenized using StringTokenizer class using comma as delimiter
		  StringTokenizer st = new StringTokenizer(data,",");
		  String name = st.nextToken();
		  
		  //Reading homework1 to homework6 one token at a time
		  String homework1 =  st.nextToken();
		  String homework2 =  st.nextToken();
		  String homework3 =  st.nextToken();
		  String homework4 =  st.nextToken();
		  String homework5 =  st.nextToken();
		  String homework6 =  st.nextToken();
		  
		  //Initializing object currentStudent with name
		  Student currentStudent= new Student(name);
		  
		  //sets all homework instance variables for currentStudent
		 currentStudent.sethomework1(Integer.parseInt(homework1));
		 currentStudent.sethomework2(Integer.parseInt(homework2));
		 currentStudent.sethomework3(Integer.parseInt(homework3));
		 currentStudent.sethomework4(Integer.parseInt(homework4));
		 currentStudent.sethomework5(Integer.parseInt(homework5));
		 currentStudent.sethomework6(Integer.parseInt(homework6));
		 
		 // Print the string representation using the overridden toString method
		 System.out.println(currentStudent.toString());
	}
}