import java.awt.*;
import java.awt.event.*;

class calc extends Frame implements ActionListener
	{
		TextField t1;
		double num1;
		double num2;
		double result;
		String op;
		int c=0;
		
		
		calc(String s)
		{
			super(s);
			setLayout(new BorderLayout());
			
			t1=new TextField();
			add(t1,BorderLayout.NORTH);
			
			//PANEL FIRST
			
			Panel p1 = new Panel();
			p1.setLayout(new GridLayout(4,1));
			
			Button b1 = new Button("+");
			Button b2 = new Button("-");
			Button b3 = new Button("*");
			Button b4 = new Button("/");
			p1.add(b1);
			b1.addActionListener(this);
			
			p1.add(b2);
			b2.addActionListener(this);
			
			p1.add(b3);
			b3.addActionListener(this);
			
			p1.add(b4);
			b4.addActionListener(this);
			
			add(p1,BorderLayout.EAST);
			
			//PANEL SECOND
			
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(4,1));
			
			Button b5 = new Button("OFF");
			Button b6 = new Button("SQRT");
			Button b7 = new Button("CE");
			Button b8 = new Button("00");
			p2.add(b5);
			b5.addActionListener(this);
			
			p2.add(b6);
			b6.addActionListener(this);
			
			p2.add(b7);
			b7.addActionListener(this);
			
			p2.add(b8);
			b8.addActionListener(this);
			
			add(p2,BorderLayout.WEST);
			
			//PANEL THIRD
			
			Panel p3 = new Panel();
			p3.setLayout(new GridLayout(3,3));
			for(int i=1;i<=9;i++)
			{
				Button b = new Button(""+i);
				p3.add(b);
				b.addActionListener(this);
			}
			
			add(p3,BorderLayout.CENTER);
			
			//PANEL FOURTH
			
			Panel p4 = new Panel();
			p4.setLayout(new GridLayout(1,3));
			
			Button b9 = new Button("0");
			Button b10 = new Button(".");
			Button b11 = new Button("=");
			
			p4.add(b9);
			b9.addActionListener(this);
			
			p4.add(b10);
			b10.addActionListener(this);
			
			p4.add(b11);
			b11.addActionListener(this);
			
			add(p4,BorderLayout.SOUTH);
			
			
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			String msg = ae.getActionCommand();
		   
			
			if(msg.equals("OFF"))
			{
				System.exit(0);
			}
			
			else if(msg.equals("0")||msg.equals("00")||msg.equals("1")||msg.equals("2")||msg.equals("3")||msg.equals("4")||msg.equals("5")||msg.equals("6")||msg.equals("7")||msg.equals("8")||msg.equals("9"))
			{
				t1.setText(t1.getText()+msg);
			}
			
			else if(msg.equals("CE"))
			{
				t1.setText("");
			}
			
			 else if(msg.equals(".")&&c==0)
			{
				c=1;
				t1.setText(t1.getText()+".");
				
			}
			
			else if(msg.equals("+") || msg.equals("-") || msg.equals("*") || msg.equals("/") )
			{
				
				
				num1=Double.parseDouble(t1.getText());
				op=ae.getActionCommand();
				t1.setText("");
				c=0;
			}
				
			else if(msg.equals("="))
			{
				num2=Double.parseDouble(t1.getText());
				t1.setText("");
				if(op=="+")
				{
					result = num1+num2;
				}
				else if(op=="-")
				{
					result=num1-num2;
				}
				else if(op=="*")
				{
					result=num1*num2;
				}
				else if(op=="/")
				{
					result=num1/num2;
				}
				
				t1.setText(""+result);
				t1.setEditable(false);
				
			}
			
		}
		
		public static void main(String args[])
		{
			calc f1= new calc("CALCULATOR");
			f1.setVisible(true);
			f1.setSize(400,400);
			f1.setLocation(100,100);
		}

	}
