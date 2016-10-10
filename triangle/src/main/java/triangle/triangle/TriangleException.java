package triangle.triangle;

public class TriangleException extends Exception {

	private Triangle badTriangle;
	public TriangleException(Triangle badTriangle){
		this.badTriangle=badTriangle;
		System.out.println("These dimensions do not make a triangle");
	}
}
