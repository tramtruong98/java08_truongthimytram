package common;

public enum CirclePosition {
	INSIDE("Trong duong tron"), 
	ONSIDE("Tren duong tron"), 
	OUTSIDE("Ngoai duong tron");

	public String value;

	CirclePosition(String value) {
		//System.out.println("value: " + value);
		this.value = value;
	}

}
