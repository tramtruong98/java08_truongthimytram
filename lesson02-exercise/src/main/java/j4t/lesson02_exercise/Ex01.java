package j4t.lesson02_exercise;

public class Ex01 {

	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		int c = 8;
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		System.out.println(a + " " + b + " " + c);

	}

}
