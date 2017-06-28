import java.awt.*;
import java.awt.event.*;

class frame4 extends Frame implements ActionListener
{
	Label l1;
	TextField t1;
	List ls;
	
	public frame4(String s)
	{
		super(s);
		
		setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		
		p1.setLayout(new GridLayout(1,2));
		
		
		l1=new Label("Enter Name");
		t1=new TextField(10);
		Button b1=new Button("INSERT");
		ls=new List(20);
		
		p1.add(l1);
		p1.add(t1);
		
		
		add(p1,BorderLayout.NORTH);
		add(b1,BorderLayout.CENTER);
		add(ls,BorderLayout.WEST);
		b1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			ls.add(t1.getText());
			t1.setText("");
	}
	
	public static void main(String args[])
	{
		frame4 f1 = new frame4("Frame4");
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setLocation(200,200);
	}
}