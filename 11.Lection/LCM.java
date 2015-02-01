import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Задача:
//Направете програма с графичен интерфейс която приема две числа и намира най-малкото им общо кратно.

public class LCM {

	private JFrame frame;
	private JTextField firstNumber;
	private JTextField secondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LCM window = new LCM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void findLCM(JTextField firstNumber2, JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int multiply = firstNumber * secondNumber;
			int squared = (int) Math.sqrt(multiply);

			for (int a = squared; a < multiply; a++) {
				if (a % firstNumber == 0 && a % secondNumber == 0) {
					JOptionPane.showMessageDialog(null, "NOK: " + a);
					break;
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}

	}

	/**
	 * Create the application.
	 */

	public LCM() {
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

		JButton nok = new JButton("NOK");
		nok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				findLCM(firstNumber, secondNumber);

			}
		});

		nok.setBounds(134, 146, 151, 62);
		frame.getContentPane().add(nok);

		firstNumber = new JTextField();
		firstNumber.setBounds(61, 66, 86, 20);
		frame.getContentPane().add(firstNumber);
		firstNumber.setColumns(10);

		secondNumber = new JTextField();
		secondNumber.setBounds(279, 66, 86, 20);
		frame.getContentPane().add(secondNumber);
		secondNumber.setColumns(10);

		JLabel lblFirstNumber = new JLabel("First number:");
		lblFirstNumber.setBounds(59, 36, 100, 14);
		frame.getContentPane().add(lblFirstNumber);

		JLabel lblSecondNumber = new JLabel("Second number:");
		lblSecondNumber.setBounds(279, 36, 100, 14);
		frame.getContentPane().add(lblSecondNumber);
	}

}
