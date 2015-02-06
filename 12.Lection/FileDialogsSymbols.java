import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//Задача:
//Направете SWING приложение, което прочита текстов файл  
//и записва информацията от прочетения файл в друг файл
//като премахва всички препинателни знаци.
//Използвайте файлови диалози

public class FileDialogsSymbols {

	private JFrame frame;
	private List<String> fileContent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileDialogsSymbols window = new FileDialogsSymbols();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void chooseFile() {
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showDialog(null, "Choose file");
			File file = fileChooser.getSelectedFile();
			this.fileContent = Files.readAllLines(file.toPath());
			readFile(file);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void readFile(File file) {
		try {
			String filePath = "C:\\Program Files (x86)\\java-course2222\\java-course"
					+ "\\examples\\12.working-with-files\\output\\writeInThisFile.txt";
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileStream = new FileWriter(filePath);
			BufferedWriter writer = new BufferedWriter(fileStream);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				String[] text = line.split("!|,");
				System.out.println(line);
				writer.write(text[0]);
				writer.newLine();
			}

			bufferedReader.close();
			writer.close();

		} catch (Exception e) {
			System.out.println("Error while reading file!");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Create the application.
	 */
	public FileDialogsSymbols() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(244, 164, 96));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Choose file ");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chooseFile();
			}

		});
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(73, 100, 280, 56);
		frame.getContentPane().add(btnNewButton);
	}
}
