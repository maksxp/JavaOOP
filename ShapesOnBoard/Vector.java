
//this class uses to check crossing of quadrangle's sides 
public class Vector {
private double x;
private double y;
public Vector(Point start, Point end) {
	super();
	x = end.x-start.x;
	y = end.y-start.y;
}
//inner class below uses to check if sides of quadrangle cross each other

public static double vectorMultiply (Vector a, Vector b){
	return a.x*b.y-b.x*a.y;
}
}

