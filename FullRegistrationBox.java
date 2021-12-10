package SmallProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationFrame extends JFrame implements ActionListener
{
	private Container c;
	JLabel heading;
	JLabel name,mobile,gender,dob,address;
	JTextField uname,umobile;
	JRadioButton male,female,others;
	JComboBox date,month,year;
	JTextArea adrs;
	JCheckBox accept;
	JButton submit;
	JTextArea result;
	JLabel alert;
	
	Font font = new Font("Arial",Font.PLAIN,20);
	
	RegistrationFrame()
	{
		//Frame Settings
		setTitle("Registration Form");
		setBounds(100,70,1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		//Frame Body for Content
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(255,190,100));
		
		//Main Heading Of The Form
		heading = new JLabel("Registration Form");
		heading.setBounds(150, 20, 400, 60);
		heading.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,35));
		c.add(heading);
		
		//All Sub-Heading In the Left 
		//Name Of Person
		name = new JLabel("Name");
		name.setBounds(60,90,200,50);
		name.setFont(font);
		c.add(name);
		
		//Mobile Number Of Person
		mobile = new JLabel("Mobile Number");
		mobile.setBounds(60,140,200,50);
		mobile.setFont(font);
		c.add(mobile);
		
		//Gender Of Person
		gender = new JLabel("Gender");
		gender.setBounds(60,190,200,50);
		gender.setFont(font);
		c.add(gender);
		
		//Date Of Birth
		dob = new JLabel("Date Of Birth");
		dob.setBounds(60,240,200,50);
		dob.setFont(font);
		c.add(dob);
		
		//Address Of Person
		address = new JLabel("Address");
		address.setBounds(60,290,200,50);
		address.setFont(font);
		c.add(address);
		
		
		
		//Text FIelds For Entering Details
		
		//Name Text Field
		uname = new JTextField();
		uname.setBounds(280,100,250,35);
		c.add(uname);
		
		
		//Mobile Text Field
		umobile = new JTextField();
		umobile.setBounds(280,150,250,35);
		c.add(umobile);
		
		//Radio Buttons For Gender
		male = new JRadioButton();
		male.setBounds(280,200,80,35);
		male.setText("Male");
		male.setFont(new Font("Arial",Font.PLAIN,17 ));
		c.add(male);
		
		female = new JRadioButton();
		female.setBounds(355,200,90,35);
		female.setText("Female");
		female.setFont(new Font("Arial",Font.PLAIN,17));
		c.add(female);
		
		others = new JRadioButton();
		others.setBounds(450,200,100,35);
		others.setText("Others");
		others.setFont(new Font("Arial",Font.PLAIN,17));
		c.add(others);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		gender.add(others);
		
		//ComboBox For date Of Birth
		//Array for Dates
		String[] dates = new String[31];
		String[] months= {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		String[] years = new String[20];
		//Initialising value of Days
		for(int i=0;i<31;i++)
		{
			dates[i]= String.valueOf(i+1);
		}
		//Initialising value of Years
		for(int i=0;i<20;i++)
		{
			years[i]= String.valueOf(i+2000);
		}
		//Date
		date=new JComboBox(dates);
		date.setBounds(280,250,70,35);
		c.add(date);
		//Month
		month = new JComboBox(months);
		month.setBounds(350,250,80,35);
		c.add(month);
		//Year
		year = new JComboBox(years);
		year.setBounds(430,250,100,35);
		c.add(year);
		
		//TextArea For Address
		adrs = new JTextArea();
		adrs.setBounds(280,300,250,70);
		adrs.setLineWrap(true);
		c.add(adrs);
		
		
		//Accepting Terms And COnditions
		accept = new JCheckBox();
		accept.setBounds(120,390,430,30);
		accept.setText("Please Accept Terms and Conditions");
		accept.setFont(new Font("Arial",Font.BOLD,17));
		accept.setForeground(Color.red);
		c.add(accept);
		
		
		//Submit Button
		submit = new JButton("Submit");
		submit.setBounds(220,450,100,35);
		submit.setFont(new Font("Arial",Font.BOLD,17));
		c.add(submit);
		
		submit.addActionListener(this);
		//Alert If Any 
		alert = new JLabel();
		alert.setBounds(220,500,400,35);
		alert.setFont(new Font("Arial",Font.BOLD,17));
		c.add(alert);
		
		//Printing All Details
		result = new JTextArea();
		result.setBounds(600, 100, 350, 350);
		result.setLineWrap(true);
		c.add(result);
		result.setFont(new Font("New Times Roman",Font.PLAIN,16));
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(accept.isSelected())
		{
			alert.setText("Registration Successfull");
			String username=uname.getText();
			String usermobile=umobile.getText();
			String ugender="Male";
			if(female.isSelected())
			{
				ugender="Female";
			}
			else if(others.isSelected())
			{
				ugender="Others";
			}
			String dob=date.getSelectedItem() + "-" +month.getSelectedItem( )+ "-" + year.getSelectedItem();
			String uaddress = adrs.getText();
			result.setText(" Name                    : "+ username + 
					"\n Mobile Number     : "+usermobile + 
					"\n Gender                  : "+ugender+ 
					"\n Date Of Birth         : "+dob + 
					"\n Address                 : "+uaddress);
			
		}
		else
		{
			alert.setText("");
			result.setText("Please Accept Terms and Conditions...");
		}
	}
}
public class FullRegistrationBox {
	public static void main(String[] args) {
		RegistrationFrame frame = new RegistrationFrame();
	}

}
