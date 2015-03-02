package edu.saintjoe.cs.brianc.point;

/* PointDriver class to test Point 
 * Brian Capouch 
 * Moved to Eclipse/github 1 March 2015
 */
public class PointDriver {

	public static void main(String[] args ) {
	
	// Create three points
	Point lowerLeft = new Point();
	Point upperRight = new Point();
	Point middlePoint = new Point();

	// Give them some values
	lowerLeft.x = 0.0;
	lowerLeft.y = 0.0;

	upperRight.x = 1280.0;
	upperRight.y = 1024.0;

	middlePoint.x = 640.0;
	middlePoint.y = 512.0;

	// Print one of the points
	System.out.print("Value of upperRight: ");
	upperRight.printPoint();
	upperRight.setPoint(15.0, 15.0);
	System.out.print("Value of upperRight: ");
	upperRight.printPoint();
	System.out.print("Value of middlePoint: ");
	middlePoint.printPoint();
	System.out.println("The distance between your points is " + upperRight.distance(middlePoint));
	}
}
