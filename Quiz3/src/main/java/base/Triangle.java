package base;

/* Triangle class
 * @author Amjed Hallak
 */

public class Triangle extends GeometricObject{

	//Defining side length variables
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	/*
	 * This method is a no-arg constructor for a Triangle object.
	 */
	public Triangle(){
	}
	/*
	 * This method is a constructor for a Triangle object, in which
	 * the user may define their own side lengths.
	 */
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Getters for side lengths
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	/*
	 * This method calculates the area of the triangle using its side lengths, and rounds to two decimal places
	 */
	public double getArea() {
		double halfPerimeter = (side1+side2+side3);
		halfPerimeter /= 2;
		double p = halfPerimeter;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		area *= 100;
		area = Math.round(area);
		area /= 100;
		return area;
	}
	/*
	 * This method calculates the perimeter of the triangle by adding the three side lengths
	 */
	public double getPerimeter() {
		double perimeter = (side1+side2+side3);
		return perimeter;
	}
	/*
	 * This method returns a string description of the triangle that specifies the side lengths.
	 */
	public String toString() {
	        return "Triangle, Side length 1: " + side1 + ", Side length 2: " + side2 + ", Side length 3: " + side3;                 
	    } 

}
