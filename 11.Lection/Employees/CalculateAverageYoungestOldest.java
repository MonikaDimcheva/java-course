import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;


public class CalculateAverageYoungestOldest extends PeopleWindow{

	JFrame frame;
	protected JTextField salary;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateAverageYoungestOldest window = new CalculateAverageYoungestOldest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void calculateAverageSalary(JTextField salary) {
		
	}
	private void findYoungestEmployee() {
	
		
	}
	private void findOldestEmployee() {
	
		
	}

	/**
	 * Create the application.
	 */
	public CalculateAverageYoungestOldest() {
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
		
		JButton btnAverageSalaryOf = new JButton("Average salary of all employees:");
		btnAverageSalaryOf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculateAverageSalary(salary);
			}

			

		});
		btnAverageSalaryOf.setBounds(95, 32, 259, 23);
		frame.getContentPane().add(btnAverageSalaryOf);
		
		JButton btnYoungestEmployee = new JButton("Youngest employee");
		btnYoungestEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findYoungestEmployee();
			}

		
		});
		btnYoungestEmployee.setBounds(95, 104, 259, 23);
		frame.getContentPane().add(btnYoungestEmployee);
		
		JButton btnOldestEmployee = new JButton("Oldest employee");
		btnOldestEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findOldestEmployee();
			}

			
		});
		btnOldestEmployee.setBounds(95, 173, 259, 23);
		frame.getContentPane().add(btnOldestEmployee);
	}

}
