class Quadrangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	private static final String ERROR_MSG_START = "Sides of your quadarangle with points ";
	private static final String ERROR_MSG_END = " cross each other";
	
//will use fabric pattern
	private Quadrangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
					}

	@Override
	public double getPerimeter() {
		return Point.getLength(a, b) + Point.getLength(b, c) + Point.getLength(c, d)
				+ Point.getLength(c, a);
	}

	@Override
	public double getArea() {
		return Math.abs((a.x * b.y - a.y * b.x) + (b.x * c.y - b.y * c.x) + (c.x * d.y - c.y * d.x)
				+ (d.x * a.y - d.y * a.x) / 2);
	}

	@Override
	public String toString() {
		return "Quadrangle";
	}
	
	//method checks if sides crossing
	public void checkCrossSides (Point a, Point b, Point c, Point d) {
		double v1=Vector.vectorMultiply(new Vector(c,d), new Vector(c,a));
		double v2=Vector.vectorMultiply(new Vector(c,d), new Vector(c,b));
		double v3=Vector.vectorMultiply(new Vector(a,b), new Vector(a,c));
		double v4=Vector.vectorMultiply(new Vector(a,b), new Vector(a,d));
		if (!((v1*v2<0) && (v3*v4)<0))
	    throw new IllegalArgumentException(ERROR_MSG_START +a+b+c+d+ ERROR_MSG_END);
			}
	//use such option instead of simple constructor to make sure of 
	//sides of new quadrangle do not cross each other
	public static Quadrangle generetorOfQadarangle (Point a, Point b, Point c, Point d){
			Quadrangle qd = new Quadrangle(a,b,c,d);
		qd.checkCrossSides(a,b,c,d);
      		return qd;
      		}


}