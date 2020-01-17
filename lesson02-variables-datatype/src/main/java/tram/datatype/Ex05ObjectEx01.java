package tram.datatype;

public class Ex05ObjectEx01 {

	public static void main(String[] args) {
		// co bao nhieu cach tao doi tuong trong java
		Int a = new Int(88);
		Int b = new Int(44);
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

	@SuppressWarnings("unused")
	private static int swap(int a, int b) {
		return a;
	}

	private static void swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}

}

class Int {
	public int value;

	public Int(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
