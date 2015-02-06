import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PeopleWindow {

	public JFrame frame;
	protected JTextField name;
	protected JTextField number;
	protected JTextField age;
	protected JTextField salary;
	public JButton okButton;
	public JButton calculateButton;

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
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 28, 70, 17);
		frame.getContentPane().add(lblName);
		
		name = new JTextField();
		name.setBounds(79, 26, 86, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setBounds(225, 28, 103, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		number = new JTextField();
		number.setBounds(318, 25, 86, 20);
		frame.getContentPane().add(number);
		number.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 84, 70, 17);
		frame.getContentPane().add(lblAge);
		
		age = new JTextField();
		age.setBounds(79, 82, 86, 20);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(225, 84, 46, 14);
		frame.getContentPane().add(lblSalary);
		
		salary = new JTextField();
		salary.setBounds(318, 81, 86, 20);
		frame.getContentPane().add(salary);
		salary.setColumns(10);
		
		this.okButton = new JButton("\u041E\u041A");
		okButton.setBackground(new Color(222, 184, 135));
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		okButton.setBounds(155, 126, 116, 33);
		frame.getContentPane().add(okButton);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calculateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calculateSalaryAndAge();
				
			}

			private void calculateSalaryAndAge() {
			
			}
		});
		calculateButton.setForeground(new Color(0, 0, 0));
		calculateButton.setBackground(new Color(244, 164, 96));
		calculateButton.setBounds(155, 181, 116, 41);
		frame.getContentPane().add(calculateButton);
	}
}
