
// this class uses to calculate the length of shape's sides
public class LengthOfSide {
   // private Point a;
	//private Point b;

	public static double getLength(Point a, Point b) {
		return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
	}
}