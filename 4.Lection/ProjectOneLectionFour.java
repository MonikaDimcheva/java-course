
public class ProjectOneLectionFour {
	
	public static void main(String[] args) {
		
		
		String[][] table =new String[][]{
				new String[] {"Supi: ", "Gubena", "Pileshka", "Bob"},
				new String[] {"Osnovni: ", "Pileshki krila", "Kiufteta", "Kebapcheta", "Riba", "Shnicel", "Gubi"},
				new String[] {"Deserti: ", "Baklava", "Sladoled"},
				
				
		};
		for (int i = 0; i < table.length; i++) {
			
			for (int j = 0; j < table[i].length; j++) {
	
				System.out.printf("%s ", table[i][j]);
				if(j!=0 && j!=table[i].length-1){
					System.out.print(",");
				}
			}
			System.out.println();
		
	}

	}}
