import java.awt.event.*;
import java.awt.*;

class frame3 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	
	frame3(String s)
	{
		super(s);
		l1 = new Label("First Number");
		l2 = new Label("Second Number");
		l3 = new Label("Result");
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		
		b1 = new Button("SUM");
		b2 = new Button("MUL");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			int n1 = Integer.parseInt(t1.getText());
			int n2 = Integer.parseInt(t2.getText());
			
			if(ae.getSource()==b1)
			{
				int sum=n1+n2;
				t3.setText(""+sum);
			}
			else
			{
				int mul=n1*n2;
				t3.setText(""+mul);
			}
				
				t3.setEditable(false);
		}
		
		public static void main(String args[])
		
		{
			frame3 f1= new frame3("Application");
			
			f1.setLocation(100,100);
			f1.setSize(300,300);
			f1.setVisible(true);
		}
}