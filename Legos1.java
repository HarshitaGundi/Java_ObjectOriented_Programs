package cs520.hw4;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Legos1 extends JFrame {
	private int startX;
	private int startY;
	private int legoWidth;
    private int legoHeight;
    private int baselength;
    private int initx;
    int i,j;
    int count;

	public Legos1() {
		
		super("Gundi's LEGOS");
		
		this.startX = 20;
		this.initx=20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		this.baselength =  10;
		
		}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
       for(j=10;j>=1;j--)
		   
	   {
	   for(i= 1;i<=j;i++)
		{
		if(i%2==0)
	    {
	    g.setColor(Color.BLUE);
	 
	    }
	    else
	    {
	     g.setColor(Color.RED);
	  
	    }
	    g.drawRect(startX,startY,legoWidth,legoHeight);
	    g.fillRoundRect(startX,startY,legoWidth,legoHeight,2, 2);
	    startX = startX + 50;
	    }
	   
	    count = count + 1;
		startY = startY - 20;
		startX = initx + count * 20;
		System.out.println(count);
		   
	}
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Legos1 app =  new Legos1();
		app.setSize(550,325);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
