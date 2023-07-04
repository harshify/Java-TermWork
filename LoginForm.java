package HARSH40;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class LoginForm extends Frame implements ActionListener {
	
	Label l1,l2,l3,l4;
	TextField t1,t2;
	Button b1;
	Panel p1,p2,p3;
	LoginForm( )
	{
		setTitle("Log In");
		setSize(300,200);
		setLayout(new GridLayout(2,4));
		Panel p1=new Panel();
		GridLayout g1=new GridLayout(2,2);
		p1.setLayout(g1);
		p2=new Panel( new GridLayout(1,2));
		p3=new Panel(new FlowLayout());
		l1=new Label("Username");
		t1=new TextField(30);
		l2=new Label("Password");
		t2=new TextField(30);
		t2.setEchoChar( ' ' );
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p2=new Panel(new GridLayout(1,2));
		b1=new Button("Log In");
		b1.addActionListener(this);
		l3=new Label ("                             ");
		p3.add(b1);
		p2.add(l3);
		l4=new Label("Implemented by Harsh Raj Mishra ( Section E  Roll no 40)");
		p3.add(l4);
		add(p1);
		add(p2);
		add(p3);
		setVisible(true);
		addWindowListener(new WindowAdapter()
				{
						public void windowClosing(WindowEvent e)
						{
							System.exit(0);
						}
				});
		
		
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginForm();

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				String u1,pw;
				u1=t1.getText();
				pw=t2.getText();
				if(  (u1.equals("gehu")) && (pw.equals("1234")))
						{
								l3.setText("Welcome user "+u1);
						}
				else {
					l3.setText("Either username or Password is Incorrect ");
					
				}
	}

}