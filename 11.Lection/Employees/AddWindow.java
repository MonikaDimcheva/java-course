import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class AddWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWindow window = new AddWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddWindow() {
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
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPeopleWindow();
			}

			private void showPeopleWindow() {
				ArrayList<People> peoples=new ArrayList<People>(2);
				PeopleWindow window=new PeopleWindow();
				window.frame.setVisible(true);
				
				window.okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						People peopleOne = window.getPersonOne();
						peoples.add(peopleOne);
						window.frame.setVisible(false);
						
						showCalculateWindow();
					JOptionPane.showMessageDialog(null,"Person TWO\nName: " + peopleOne.getName()
							+"\nPhone: "+peopleOne.getNumber()+"\nAge: "+peopleOne.getAge()
							+"\nSalary: "+peopleOne.getSalary());
					
					}

					private void showCalculateWindow() {
						CalculateAverageYoungestOldest window=new CalculateAverageYoungestOldest();
						window.frame.setVisible(true);
						
						
					}
				});
				PeopleWindow windowTwo=new PeopleWindow();
				windowTwo.frame.setVisible(true);
				windowTwo.okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						People peopleTwo = windowTwo.getPersonTwo();
						peoples.add(peopleTwo);
						windowTwo.frame.setVisible(false);
						
					JOptionPane.showMessageDialog(null,"Person ONE\nName: " + peopleTwo.getName()
							+"\nPhone: "+peopleTwo.getNumber()+"\nAge: "+peopleTwo.getAge()
							+"\nSalary: "+peopleTwo.getSalary());
					}
				});
				
			}
		});
		btnNewButton.setBounds(134, 102, 150, 42);
		frame.getContentPane().add(btnNewButton);
	}

}
