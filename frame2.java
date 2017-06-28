import java.awt.*;

class frame2 extends Frame
{
	
	frame2(String s)
	{
		super(s);
	}	
		
	public static void main(String args[])
	{
		frame2 obj=new frame2("Example");
		
		obj.setVisible(true);
		obj.setSize(800,800);
		obj.setLocation(100,100);
		
	}
}
