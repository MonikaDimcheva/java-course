package homework2;

public class ThirtyNumbersRowsAndColumns {
	public static void main(String[] args) {
		
		int counter=30;
		int rows=5;
		int columns=6;
		
		for(int i=1; i<=rows; i++){
			
			for(int m=1; m<=columns; m++){
				System.out.print(counter+ " ");
				--counter;
			} 
			System.out.println();
		}
		
	}

}
