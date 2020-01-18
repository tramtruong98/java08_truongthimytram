package j4t.lesson02_exercise;

public class Ex03 {

	public static void main(String[] args) {
		int a = 121;
		if (symmetricNumber(a))
			System.out.println(a + " la so doi xung");
		else
			System.out.println(a + " khong phai so doi xung");

	}

	private static boolean symmetricNumber(int a) {
		String str = String.valueOf(a);
		String rev = new StringBuffer(str).reverse().toString();
		if (str.equals(rev))
			return true;
		return false;
	}

}
