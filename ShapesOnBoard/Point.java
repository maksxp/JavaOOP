
class Point {
	double x;
	double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	@Override
	public String toString() {
		return " (x=" + x + ", y=" + y + ")";
	}
	public static double getLength(Point a, Point b) {
		return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
	}
	
	
}