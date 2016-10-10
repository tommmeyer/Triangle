package triangle.triangle;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(){
		this.side1=1;
		this.side2=1;
		this.side3=1;
	}
	public Triangle(double side1, double side2, double side3) throws TriangleException{
		if(side1<0 || side2<0 || side3<0){
			throw new TriangleException(this);
		}
		else if(side1+side2<=side3 || side1 +side3<=side2 || side2+side3<=side1){
			throw new TriangleException(this);
		}
		else{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		}
	public double getSide1(){
		return this.side1;
	}
	public double getSide2(){
		return this.side2;
	}
	public double getSide3(){
		return this.side3;
	}
	
	@Override
	public double getArea() {
		double herronConstant = (getPerimeter())/2;
		double areaSquared = (herronConstant - getSide1())*(herronConstant - getSide2())*(herronConstant - getSide3())*herronConstant;
		return Math.sqrt(areaSquared);
	}
	@Override
	public double getPerimeter() {
		
		return getSide1()+getSide2()+getSide3();
	}
	@Override
	public String toString(){
		return "This is a triangle with lengths " + getSide1() + " " + getSide2() + " and "+ getSide3();
	}
}

