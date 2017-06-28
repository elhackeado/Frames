import java.awt.*;
import java.awt.event.*;

class frame5 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1;
	List ls1,ls2;
	String s;
	
	public frame5(String s)
	{
		super(s);
		
		setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		p2.setLayout(new GridLayout(4,1));
		p3.setLayout(new GridLayout(2,1));
		p4.setLayout(new GridLayout(2,1));
		
		l1=new Label("Enter Name");
		l2=new Label("AVAILABLE");
		l3=new Label("SELECTED");
		
		t1=new TextField(10);
		Button b1=new Button("INSERT");
		Button b2=new Button(">");
		Button b3=new Button("<");
		Button b4=new Button("ALL");
		
		ls1=new List(20,true);
		ls2=new List(20,true);
		p1.add(l1);
		p1.add(t1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p3.add(l2);
		p3.add(ls1);
		p4.add(l3);
		p4.add(ls2);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.WEST);
		add(p4,BorderLayout.EAST);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getActionCommand()=="INSERT")
			{
			ls1.add(t1.getText());
			t1.setText("");
			}
			if(ae.getActionCommand()==">")
			{
				int ar[]=ls1.getSelectedIndexes();
				for(int i=0; i<ar.length;i++)
				{
					s=ls1.getItem(ar[i]);
					ls2.add(s);
					ls1.remove(i);
					
					
					
				}
				
				
			}
			if(ae.getActionCommand()=="<")
			{
				
			}
			if(ae.getActionCommand()=="ALL")
			{
				
			}
	}
	
	public static void main(String args[])
	{
		frame5 f1 = new frame5("Frame5");
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setLocation(200,200);
	}
}