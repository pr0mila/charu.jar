import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;

//RadioButton
class Radiobutton extends JPanel
{
	private int x=500,y=500,side=20;
	private String string="Title";
	private Color outercolor = new Color (11, 83, 69);
	private Color innercolor = new Color (255, 255, 255);
	public Radiobutton (int x,int y, int side,Color innercolor,
			Color outercolor)
	{
		this.x= x;
		this.y= y;
		this.side= side;
		this.innercolor=innercolor;
		this.outercolor=outercolor;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getSide()
	{
		return side;
	}
	public Color Innercolor()
	{
		return innercolor;
	}
	public Color setOutercolor()
	{
		return outercolor;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(outercolor);
		g.fillOval(x,y, side, side);
		g.setColor(innercolor);
		g.fillOval(x+2,y+2, side-4, side-4);
		g.setColor(outercolor);
		g.fillOval(x+4,y+4, side-8, side-8);
		
	}
}
