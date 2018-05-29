import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;


class Checkbox extends JPanel
{
	private int x=100,y=100,side=20;
	private String string="Title";
	private Color outercolor = new Color (11, 83, 69);
	private Color innercolor = new Color (255, 255, 255);
	public Checkbox (int x,int y, int side,Color innercolor,
			Color outercolor)
	{
		this.x= x;
		this.y= y;
		this.side= side;
		this.innercolor=innercolor;
		this.outercolor=outercolor;
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			private void setColor(Color outercolor) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
	protected void fillRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
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
		g.fillRect(x,y, side, side);
		g.setColor(innercolor);
		g.fillRect(x+2,y+2, side-4, side-4);
		g.setColor(outercolor);
		g.fillRect(x+4,y+4, side-8, side-8);
		
	}
	
	 private void setColor(Color outercolor2) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {}  
	    public void mouseExited(MouseEvent e) {}  
	    public void mousePressed(MouseEvent e) {}  
	    public void mouseReleased(MouseEvent e) {}  

	
}
