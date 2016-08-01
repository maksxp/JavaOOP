
class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
		super();
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getPerimeter() {
		try{
		return LengthOfSide.getLength(a, b) + LengthOfSide.getLength(b, c) + LengthOfSide.getLength(c, a);
		}
		catch(NullPointerException e){
			System.out.println("Triangle is not defined properly");
		}
		return 0;
		}

	@Override
	public double getArea() {
		try{
		return Math.abs(((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) / 2);
		}
catch(NullPointerException e){
	System.out.println("Triangle is not defined properly");
}
		return 0;
	}

	@Override
	public String toString() {
		return "Triangle";
	}
	

}