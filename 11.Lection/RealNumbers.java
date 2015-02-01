import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Задача:
//Направете програма с графичен интерфейс, която има 2 полета за реални числа.
//Направете 4 бутона съответвно събиране, изваждане, умножение и делене.
//При натискане на съответния бутон програмата трябва да извежда прозорец с резултат от съответната операция

public class RealNumbers {

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
					RealNumbers window = new RealNumbers();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void calculatePlus(JTextField firstNumber2, JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber + secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}
	}

	private void calculateMinus(JTextField firstNumber2,
			JTextField secondNumber2) {
		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber - secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}
	}

	private void calculateDel(JTextField firstNumber2, JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber / secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!\nCannot devide by 0!",
					"Внимание", 2);
		}

	}

	private void calculateUmnojenie(JTextField firstNumber2,
			JTextField secondNumber2) {

		try {
			String firstNumberText = this.firstNumber.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.secondNumber.getText();
			int secondNumber = Integer.parseInt(secondNumberText);

			int result = firstNumber * secondNumber;

			JOptionPane.showMessageDialog(null, "The result is: " + result);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Mistake during the calculation!", "Внимание", 2);
		}

	}

	/**
	 * Create the application.
	 */
	public RealNumbers() {
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

		JLabel lblNumberOne = new JLabel("Number one: ");
		lblNumberOne.setBounds(49, 51, 94, 14);
		frame.getContentPane().add(lblNumberOne);

		JLabel lblNumberTwo = new JLabel("Number two:");
		lblNumberTwo.setBounds(273, 51, 100, 14);
		frame.getContentPane().add(lblNumberTwo);

		firstNumber = new JTextField();
		firstNumber.setBounds(46, 87, 86, 20);
		frame.getContentPane().add(firstNumber);
		firstNumber.setColumns(10);

		secondNumber = new JTextField();
		secondNumber.setBounds(271, 87, 86, 20);
		frame.getContentPane().add(secondNumber);
		secondNumber.setColumns(10);

		JButton buttonPlus = new JButton("+");
		buttonPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calculatePlus(firstNumber, secondNumber);
			}
		});
		buttonPlus.setBounds(43, 137, 89, 23);
		frame.getContentPane().add(buttonPlus);

		JButton buttonMinus = new JButton("-");
		buttonMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculateMinus(firstNumber, secondNumber);
			}
		});
		buttonMinus.setBounds(273, 137, 89, 23);
		frame.getContentPane().add(buttonMinus);

		JButton buttonDel = new JButton("/");
		buttonDel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculateDel(firstNumber, secondNumber);

			}
		});
		buttonDel.setBounds(43, 198, 89, 23);
		frame.getContentPane().add(buttonDel);

		JButton buttonUmn = new JButton("*");
		buttonUmn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculateUmnojenie(firstNumber, secondNumber);
			}
		});
		buttonUmn.setBounds(273, 198, 89, 23);
		frame.getContentPane().add(buttonUmn);
	}

}
