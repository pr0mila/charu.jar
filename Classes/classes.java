import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

class Background extends JPanel
{
	private static final Graphics Graphics = null;
	private int height,width,r,g,b;
	private Color color = new Color (255,255,255);
	public Background (int width,int height,Color color)
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

	
