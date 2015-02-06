import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Задача:
//Направете SWING приложение, което прочита текстов файл    
//и записва всеки четен ред в един файл,
//а всеки нечене ред в друг файл.
//Използвайте файлови диалози

public class FileOddAndEvenLines {

	private JFrame frame;
	private List<String> fileContent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileOddAndEvenLines window = new FileOddAndEvenLines();
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
			String filePathEven = "C:\\Program Files (x86)\\java-course2222\\java-course"
					+ "\\examples\\12.working-with-files\\output\\evenLines.txt";
			String filePathOdd = "C:\\Program Files (x86)\\java-course2222\\java-course"
					+ "\\examples\\12.working-with-files\\output\\oddLines.txt";

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			FileWriter fileStream = new FileWriter(filePathEven);
			BufferedWriter writer = new BufferedWriter(fileStream);
			FileWriter fileStreamTwo = new FileWriter(filePathOdd);
			BufferedWriter writerTwo = new BufferedWriter(fileStreamTwo);

			int count = 0;
			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				count++;
				if (count % 2 == 0) {
					writer.write(line);
					writer.newLine();
				} else if (count % 2 == 1) {
					writerTwo.write(line);
					writerTwo.newLine();
				}

			}
			writer.close();
			writerTwo.close();

		} catch (Exception e) {
			System.out.println("Error while reading file!");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Create the application.
	 */
	public FileOddAndEvenLines() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Choose file");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chooseFile();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(125, 93, 186, 58);
		frame.getContentPane().add(btnNewButton);
	}

}
