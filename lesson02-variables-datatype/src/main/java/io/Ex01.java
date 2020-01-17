package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fullname: ");
		String fullname = sc.nextLine();
		System.out.print("Enter age: ");
		int age = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		System.out.print("Enter hobby: ");
		String hobby = sc.nextLine();
		System.out.print("Enter math grade: ");
		float m = Float.parseFloat(sc.nextLine());
		System.out.println("fullname: " + fullname);
		System.out.println("age: " + age);
		System.out.println("math: " + m);
		System.out.println("hobby: " + hobby);

	}

}
