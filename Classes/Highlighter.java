
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JFrame;

//for making highlighted text

class Highlighter extends JPanel
{
	private static final Graphics Graphics = null;
	private int height,width,x,y,x2,y2;
	private Font myfont = new Font("serif", Font.BOLD, 30);
	private String string = "title";
	private Color color = new Color (255,255,255);
	private Color fontcolor = new Color (255,255,255);
	

	public Highlighter (int x,int y,int width,int height,Color color, String string,int x2,int y2,Font myfont,Color fontcolor) /*for calling New class 
	Highlighter(int x,int y,int width,int height,Color color, String string,int x2,int y2,Font myfont,Color fontcolor)*/
	{
		
		this.height= height;
		this.width=width;
		this.x=x;
		this.y=y;
		this.x2=x2;
		this.y2=y2;
		this.string=string;
		this.myfont=myfont;
		this.color=color;
		this.fontcolor=fontcolor;
		
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getX2()
	{
		return x2;
	}
	public int getY2()
	{
		return y2;
	}
	public int getWidth()
	{
		return width;
	}
	public String getString()
	{
		return string;
	}
	public Color setColor()
	{
		return color;
	}
	public Color setFontcolor()
	{
		return fontcolor;
	}
	public Font setFont()
	{
		return myfont;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(0,0, width, height);
		g.setColor(fontcolor);
		g.setFont(myfont);
		g.drawString(string, x2, y2);
	}
}
