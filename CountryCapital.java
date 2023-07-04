package HARSH40;
import java.awt.*;
import java.awt.event.*;

public class CountryCapital extends Frame implements ActionListener {
	Choice country,capital;
	String a[]= {"New Delhi","Islamabad","Tokyo","Beijing","Kathmandu"};
	Button cmp;
	Label lbl,lbl1,lbl2,l3;
	Panel p1,p2;
	CountryCapital(){
		
		setLayout(new FlowLayout());
		p1=new Panel(new GridLayout(2,2));
		p2=new Panel(new FlowLayout());
		lbl1=new Label("Choose Country");
		lbl2=new Label("Choose Capital");
		p1.add(lbl1);
		p1.add(lbl2);
		
		country=new Choice();
		country.add("India");
		country.add("Pakistan");
		country.add("Japan");
		country.add("China");
		country.add("Nepal");
		
		capital =new Choice();
		capital.add("Islamabad");
		capital.add("Tokyo");
		capital.add("Beijing");
		capital.add("Kathmandu");
		capital.add("New Delhi");
			
		p1.add(country);
		p1.add(capital);
		l3=new Label("**Implemented By Suyash Dabral Class Roll No. 73 CSE4(E)**");
		p2.add(l3);
		add(p1);
		add(p2);
		cmp=new Button("Compare");
		add(cmp);
		cmp.addActionListener(this);
		lbl=new Label("					",Label.CENTER);
		add(lbl);
		
		setSize(350,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountryCapital();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((country.getSelectedItem()=="India")&&(capital.getSelectedItem()=="New Delhi")) {
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="Pakistan")&&(capital.getSelectedItem()=="Islamabad")) {
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="Japan")&&(capital.getSelectedItem()=="Tokyo")) {
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="China")&&(capital.getSelectedItem()=="Beijing")) {
			lbl.setText("Correct Answer");
		}
		else if((country.getSelectedItem()=="Nepal")&&(capital.getSelectedItem()=="Kathmandu")) {
			lbl.setText("Correct Answer");
		}
		else {
			lbl.setText("Wrong Answer Correct Answer is " +a[country.getSelectedIndex()] );
		}
		
	}

}