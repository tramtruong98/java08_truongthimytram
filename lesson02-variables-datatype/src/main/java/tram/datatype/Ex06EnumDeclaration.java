package tram.datatype;

import common.Operator;

public class Ex06EnumDeclaration {

	public static void main(String[] args) {
		Operator[] operators = Operator.values();
		for (int i = 0; i < operators.length; i++) {
			System.out.println(i + ": " + operators[i].ordinal());
			System.out.println("result: " + operate(10, 5, operators[i]));

		}
	}

	private static int operate(int a, int b, Operator operator) {
		switch (operator) {
		case SUM:
			return a + b;
		case SUB:
			return a - b;
		case MUL:
			return a * b;
		case DIV:
			return a / b;
		case MOD:
			return a % b;
		}
		return 0;
	}

}
