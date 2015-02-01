import java.util.Random;

//Задача:
//С помощта на функции в JAVA направете програма,
//която пресмята лицето на триъгълник по зададена страна и височина към нея. (S=a.ha/2). 
//На случаен принцип генерирайте 10 различни страни и съответно 
//височини към тях и изведете лицето на образувания от тях триъгълник на екрана
//Дефинирайте функция за пресмятането на лицето
//Дефинирайте функция за извеждането на страната, височината и лицето

public class ProjectTwoLectionFour {
	public static void main(String[] args) {

		Random rand = new Random();

		for (int i = 0; i <= 10; i++) {

			float side = rand.nextFloat();
			float height = rand.nextFloat();

			float area = calculateTriangleArea(side, height);
			print(area, height, side);
		}

	}

	public static float calculateTriangleArea(float side, float height) {
		float area = (side * height) / 2;
		return area;
	}

	public static void print(float area, float height, float side) {
		System.out.printf("Side %f Height %f = Area %f", side, height, area);
		System.out.println();
	}

}
