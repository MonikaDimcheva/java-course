import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PeopleWindow {

	public JFrame frame;
	protected JTextField name;
	protected JTextField number;
	protected JTextField age;
	protected JTextField salary;
	public JButton okButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PeopleWindow window = new PeopleWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public People getPersonOne() {
		People personOne = new People(this.name.getText(),this.number.getText(), this.age.getText(),this.salary.getText());
		return personOne;
	}

	public People getPersonTwo() {
		People personTwo = new People(this.name.getText(),this.number.getText(), this.age.getText(),this.salary.getText());
		return personTwo;

	}

	/**
	 * Create the application.
	 */
	public PeopleWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(34, 38, 46, 14);
		frame.getContentPane().add(lblName);
		
		name = new JTextField();
		name.setBounds(144, 35, 86, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setBounds(34, 86, 103, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		number = new JTextField();
		number.setBounds(144, 83, 86, 20);
		frame.getContentPane().add(number);
		number.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(34, 148, 46, 14);
		frame.getContentPane().add(lblAge);
		
		age = new JTextField();
		age.setBounds(144, 145, 86, 20);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(34, 210, 46, 14);
		frame.getContentPane().add(lblSalary);
		
		salary = new JTextField();
		salary.setBounds(144, 207, 86, 20);
		frame.getContentPane().add(salary);
		salary.setColumns(10);
		
		this.okButton = new JButton("\u041E\u041A");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		okButton.setBounds(306, 114, 89, 23);
		frame.getContentPane().add(okButton);
	}

}
