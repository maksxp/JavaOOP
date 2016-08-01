
public class Circle extends Shape{
	private Point center;
	private double radius;
	
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle";
	}

	@Override
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

}
