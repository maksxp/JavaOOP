
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
	
	
}