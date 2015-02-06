import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;


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
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setBackground(new Color(205, 133, 63));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPeopleWindow();
			}

			private void showPeopleWindow() {
				
				ArrayList<People> peoples=new ArrayList<People>();
				PeopleWindow window=new PeopleWindow();
				window.frame.setVisible(true);
				
				window.okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
						People peopleOne = window.getPersonOne();
						peoples.add(peopleOne);
						
						window.frame.setVisible(false);
						
						
					
//					JOptionPane.showMessageDialog(null,"Person\nName: " + peopleOne.getName()
//							+"\nPhone: "+peopleOne.getNumber()+"\nAge: "+peopleOne.getAge()
//							+"\nSalary: "+peopleOne.getSalary());
//					
					
					//System.out.println(peoples.get(0).getName());
					//System.out.println(peoples.get(0).getAge());
					System.out.println(peoples.get(1).getAge());
					System.out.println(peoples.get(1).getName());
					
					}

				
				});
				PeopleWindow windowTwo=new PeopleWindow();
				//windowTwo.frame.setVisible(true);
		
//					public void actionPerformed(ActionEvent arg0) {
//				
						People peopleTwo = windowTwo.getPersonTwo();
						peoples.add(peopleTwo);
						windowTwo.frame.setVisible(false);
						
					JOptionPane.showMessageDialog(null,"Person\nName: " + peopleTwo.getName()
							+"\nPhone: "+peopleTwo.getNumber()+"\nAge: "+peopleTwo.getAge()
							+"\nSalary: "+peopleTwo.getSalary());
					
					window.calculateButton.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent arg0) {
							
							
							
						}
					
					});
					}
				});
				
			//}
		//});
		btnNewButton.setBounds(114, 88, 194, 73);
		frame.getContentPane().add(btnNewButton);
	}

}
