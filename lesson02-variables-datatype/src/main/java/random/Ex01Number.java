package random;

import java.util.Random;

public class Ex01Number {

	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		int number = 0;
		while (true) {
			//from 22 to 56
			number = 22 + rd.nextInt(56 - 22 +1);
			System.out.println(number);
			sleep(1);

		}

	}

	public static void sleep(long seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
}