package j4t.lesson02_exercise;

public class Ex02 {

	public static void main(String[] args) {
		long tong;
		tong = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("S = 4! + 7! + 12! +18! = " + tong);

	}

	private static long factorial(int a) {
		long result = 1;
		for (int i = 1; i <= a; i++) {
			result = result * i;
		}
		return result;

	}

}
