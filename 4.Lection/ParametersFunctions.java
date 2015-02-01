package LectionFour;

//Задача:
//Дефинирайте фунцкия която приема 3 параметъра -
//цели числа и ги умножава едно с друго. 
//Извикайте функцията 20 пъти с рандом генерирани параметри.
//Изведете резултата на екрана

import java.util.Random;

public class ParametersFunctions {
	public static void main(String[] args) {

		for (int m = 1; m <= 20; m++) {

			Random rand = new Random();
			int randOne = rand.nextInt();
			int randTwo = rand.nextInt();
			int randThree = rand.nextInt();

			multiply(randOne, randTwo, randThree);

		}
	}

	public static void multiply(int randOne, int randTwo, int randThree) {

		int multiplyRandoms = randOne * randTwo * randThree;
		System.out.println(randOne + "*" + randTwo + "*" + randThree + "="
				+ multiplyRandoms);

	}
}
