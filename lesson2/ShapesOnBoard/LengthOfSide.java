
class LengthOfSide {// this class uses to calculate the length of shape's sides
	Point a;
	Point b;

	public LengthOfSide() {
		super();
	}

	public LengthOfSide(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public static double getLength(Point a, Point b) {
		return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
	}
}