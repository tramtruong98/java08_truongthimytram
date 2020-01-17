package random;

import java.util.Random;

public class Ex02Array {
	public static void main(String[] args) {
		Random rd = new Random();
		String[] students = { "lan", "hoa", "mai", "đào", "cúc" };
		String first = students[rd.nextInt(students.length)];
		String second = students[rd.nextInt(students.length)];
		while (second.equals(first)) {
			second = students[rd.nextInt(students.length)];
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println("======================");
		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("i: " + i);
		}
		for (String student : students) {
			System.out.println(student);
		}
	}

}
