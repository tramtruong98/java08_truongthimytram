package tram.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {

	public static void main(String[] args) {
		Point A = new Point(3, 4);
		Point O = new Point(0, 0);
		CirclePosition post = check(A, O, 5);
		System.out.println("Result: " + post.value);

	}

	private static CirclePosition check(Point A, Point O, int r) {
		/*
		 * if (Math.sqrt(a * a + b * b) < r) return CirclePosition.INSIDE; if
		 * (Math.sqrt(a * a + b * b) == r) return CirclePosition.ONSIDE; return
		 * CirclePosition.OUTSIDE;
		 */
		double distance = (Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2)));
		return (distance == r) ? CirclePosition.ONSIDE
				: (distance < r) ? CirclePosition.INSIDE : CirclePosition.OUTSIDE;
	}

}
