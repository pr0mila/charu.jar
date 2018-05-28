import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

class Background extends JPanel //for changing backgound class
{
	private static final Graphics Graphics = null;
	private int height,width,r,g,b;
	private Color color;
	public Background (int width,int height,Color color) //for calling New class Background(width,height,Color.blue)
	{
		
		this.height= height;
		this.width=width;
		this.color=color;	
		
	}

	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public Color setColor()
	{
		return color;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(0,0, width, height);
	}
}

	
