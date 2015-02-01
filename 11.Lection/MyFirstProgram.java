import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Font;

//Задача:
//Направете програма която извежда на екрана вашите имена в window.

public class MyFirstProgram {

	private JFrame frame;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstProgram window = new MyFirstProgram();
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
	public MyFirstProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtName = new JTextField();
		txtName.setForeground(new Color(0, 0, 0));
		txtName.setFont(new Font("Dialog", Font.BOLD, 16));
		txtName.setBackground(new Color(245, 222, 179));
		txtName.setText("Monika Dimcheva");
		txtName.setBounds(122, 103, 166, 50);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblName.setBounds(122, 49, 114, 43);
		frame.getContentPane().add(lblName);
	}
}
