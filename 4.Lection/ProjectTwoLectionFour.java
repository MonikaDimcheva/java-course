import java.util.Random;


public class ProjectTwoLectionFour {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		for(int i=0; i<=10; i++){
			
			float side=rand.nextFloat();
			float height=rand.nextFloat();
			
		    float area=calculateTriangleArea(side, height);
			print(area,height, side);
		}
		
		
	}
	public static float calculateTriangleArea(float side, float height){
		float area=(side*height)/2;
		return area;
	}
	
	public static void print(float area, float height, float side){
		System.out.printf("Side %f Height %f = Area %f", side, height, area);
		System.out.println();
	}

}
