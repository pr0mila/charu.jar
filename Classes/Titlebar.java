import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;

//for creating two layered title bar, axis,width,height,colors can be customized by 

class Titlebar extends JPanel  
{
	private static final Graphics Graphics = null;
	private int x=0,y=0,height=60,width=320;
	private String string="Title";
	private Color upperbarcolor = new Color (11, 83, 69);
	private Color barcolor = new Color (14, 102, 85);
	public Titlebar (int x,int y,int width,int height,Color upperbarcolor,Color 
			barcolor)/*for calling New class Titlebar(int x,int y,int width,int height,Color upperbarcolor,Color 
	barcolor)*/
	{
		
		this.x= x;
		this.y= y;
		this.height= height;
		this.width=width;
		this.upperbarcolor=upperbarcolor;
		this.barcolor=barcolor;
		
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public Color setUpperbarcolor()
	{
		return upperbarcolor;
	}
	public Color setBarcolor()
	{
		return barcolor;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(barcolor);
		g.fillRect(x,y, width, height);
		g.setColor(upperbarcolor);
		g.fillRect(x,y, width, height/4);
	}
}
