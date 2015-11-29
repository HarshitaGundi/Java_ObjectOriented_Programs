package cs520.hw4;

//importing the various libraries used
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 * This class creates a swing GUI application and 
 *  displays the graphic of lego blocks with different colors
 * where no color is repeated in consecutive blocks of the same row
 */
public class Legos3 extends JFrame {
	private int startX; // x value of top-left coordinate of first red block in bottom row
	private int startY; // y value of top-left coordinate of first red block in bottom row
	private int legoWidth; // Width of each block
	private int legoHeight; // Height of each block
	private int baseLength; // Max Number of blocks in a row
	
	//Initialization of variables using constructor
	public Legos3(){
		super("Harshita's LEGO3 GUI application"); //Window title
		this.startX = 20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		this.baseLength = 10;
	}
	
   // drawings in the graphic
	public void paint(Graphics g){
		super.paint(g); // calling super class's constructor
		int x,y; // x,y values to use in fillRoundRect
		int counter; 
		int selectedColorIndex; // Variable to store the index of color which will be used to fill current block
		int prevColorIndex; // Variable to store the index of color used to fill previous block
		
		//declaring an array of Color objects with various colors
		Color [] mycolors = {Color.red, Color.blue, Color.yellow,
				Color.green, Color.pink,Color.black, Color.magenta,
				Color.orange, Color.cyan};
		
		//Creating an instance of Random object
		Random randColor = new Random();
		
		//Calculating the color to fill for each row and filling it
		for(int n=this.baseLength; n>0;n--){
			// Update the x,y values of top left corner of each block. This is done once per row
			x = this.startX + (10 - n)*(this.legoWidth/2);
			y = this.startY - (10 - n)*(this.legoHeight);
			
			counter=0; //set the counter to 0 for each row
			selectedColorIndex = prevColorIndex = -1; // initialize index of current and previous colors to -1
			
			// below loop runs for each block in a given row
			while(counter<n){
				//generate an index at random, compare it with previous index and if they are equal
				// keep generating random index, till current and previous are different
				// This ensures that no adjacent blocks have same color
				selectedColorIndex = randColor.nextInt(mycolors.length);
				while(prevColorIndex == selectedColorIndex){
					selectedColorIndex = randColor.nextInt(mycolors.length);
				}
				//Set the color to the color at index calculated and fill the rectangle with this color
				g.setColor(mycolors[selectedColorIndex]);
				g.fillRoundRect(x, y, this.legoWidth, this.legoHeight, 2, 2);
				
				x = x + this.legoWidth; //Update x position of top left coordinate of each block
				counter++; // Update the counter
				prevColorIndex = selectedColorIndex; //set previous index of color to current index  
			}
		}
	}
	public static void main(String[] args) {
		Legos3 app = new Legos3(); // create an instance of Legos3 
		app.setSize(550, 325); 		//set size of the application window
		app.setVisible(true); //making window visible
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing the application on exit
	}

}
