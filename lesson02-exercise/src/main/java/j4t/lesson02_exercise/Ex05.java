package j4t.lesson02_exercise;

public class Ex05 {

	public static void main(String[] args) {
		int n = 2;
		System.out.print(n + " chuyển sang cơ số 2 là: ");
		convert(n);

	}

	public static void convert(int n) {
		int[] binary = new int[100];
		int i = 0;
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
	}

}
