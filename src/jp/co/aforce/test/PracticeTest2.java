package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 28;
		double z = 3.14;

		System.out.println(x*y);
		System.out.println(y/x);
		System.out.println(y%x);

		double caluclation = (y*z);
			System.out.println(caluclation);

			System.out.println(++caluclation);

		int age = 22;
		Random random = new Random();
		int randomNumber = random.nextInt(101);
			if (age>randomNumber) {
				System.out.println("私のほうが年上です r=" + randomNumber);
			}else if (age<randomNumber) {
				System.out.println("私のほうが年下です r=" + randomNumber);
			}else {
				System.out.println("私と同い年です r=" + randomNumber);
			}
	}
}
