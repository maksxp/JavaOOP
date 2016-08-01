
public class TestBoard {
	static Board one = new Board(); // creating the board
	static Point pointA = new Point (0,0);
	static Point pointB = new Point (2,3);
	static Point pointC = new Point (-3,7);
	static Point pointD = new Point (10,-5);
	static Point pointE = new Point (11,11);
	static Triangle triangleA = new Triangle (pointA, pointB, pointC);
	static Triangle triangleB = new Triangle (pointA, pointB, pointD);
	static Triangle triangleC = new Triangle (pointA, pointD, pointC);
	static Quadrangle quadrangleA = Quadrangle.generetorOfQadarangle (pointA, pointB, pointC, pointD);
	//method below throws exception which is caused by crossing of quadrangle's sides
	//static Quadrangle quadrangleB = Quadrangle.generetorOfQadarangle (pointE, pointB, pointC, pointD);
	static Circle circleA = new Circle (pointA, 3);
	public static void main(String[] args) {
	
one.addShape(triangleA, 1); // put the Triangle on the place 1 of the board
one.addShape(triangleB, 2); // put the triangle on the place 2 of the board
one.addShape(quadrangleA, 3);
//one.addShape(quadrangleB, 4);
one.addShape(new Triangle(), 0); // show error if there is no such place 
one.addShape(new Triangle(), 4); // show error "Triangle is not defined properly"
one.showAllShapes();
one.addShape(quadrangleA, 2); // show error if the place is already busy
one.showAllShapes();
one.removeShape(1);
one.showAllShapes(); // shows fact of removing - previous action
one.showTotalArea();
one.showTotalPerimeter();
one.removeShape(2);
one.addShape(circleA, 2);
one.showAllShapes(); // shows fact of adding CircleA
one.showTotalArea();
one.showTotalPerimeter();
	}

}
