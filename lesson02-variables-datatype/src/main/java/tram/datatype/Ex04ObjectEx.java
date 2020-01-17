package tram.datatype;

public class Ex04ObjectEx {

	public static void main(String[] args) {
		
		/*
		 * char c = 5; System.out.println("isDigit " + IsDigit(c));
		 * System.out.println("isDigit " + Character.isDigit(c));
		 */
		 
		//Ex
		Integer a = new Integer(10);
		System.out.println("a hashcode: " + System.identityHashCode(a));
		System.out.println("a :" + a);
		modified(a);
		System.out.println("a hashcode: " + System.identityHashCode(a));
		System.out.println("a :" + a);
		System.out.println("------------------");
		Integer x = new Integer(17);
		Integer y = new Integer(22);
		Swap(x,y);
		System.out.println("x :" + x);
		System.out.println("y :" + y);

	
	}

	
	  @SuppressWarnings("unused")
	private static boolean IsDigit(char c) { return (c>='0' && c<='9');
	  
	  }
	 
	private static void modified(Integer x) {
		x = 20;
	}
	private static void Swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

}
