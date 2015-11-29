package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


import java.util.Random;



public class Legos2 extends JFrame {
	private int startX;
	private int startY;
	private int legoWidth;
    private int legoHeight;
    private int baselength;
    private int initx;
    int i,j;
    int count;
    Color[] colors;


  
    
    
    public Legos2() {
		
		super("Gundi's LEGOS");
		
		this.startX = 20;
		this.initx=20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		this.baselength =  10;
	    
		
	    //Allocate the size of the array
	    this.colors = new Color[9];

	    //Initialize the values of the array
	    colors[0] = Color.red;
	    colors[1] = Color.blue;
	    colors[2] = Color.yellow;
	    colors[3] = Color.green;
	    colors[4] = Color.pink;
	    colors[5] = Color.black;
	    colors[6] = Color.magenta;
	    colors[7] = Color.orange;
	    colors[8] = Color.cyan;
	    
		}
    

public void paint(Graphics g)
	{
		super.paint(g);
		Random rnd = new Random();
		
		
       for(j=baselength;j>=1;j--)
		   
	   {
	   for(i= 1;i<=j;i++)
		{
		int randomInt = rnd.nextInt(colors.length);
	     g.setColor(colors[randomInt]);
	  
	    
	    g.drawRect(startX,startY,legoWidth,legoHeight);
	    g.fillRoundRect(startX,startY,legoWidth,legoHeight,2, 2);
	    startX = startX + 50;
	    }
	   
	    count = count + 1;
		startY = startY - 20;
		startX = initx + count * 20;
		
		   
	}
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Legos2 app =  new Legos2();
		app.setSize(550,325);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
