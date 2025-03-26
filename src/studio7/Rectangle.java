package studio7;

public class Rectangle {
//	Recantgle area 
//	perimeter
//	compare area
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double length, double width) {
		this.length = length; //specific rec
		this.width = width;
	}

	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return (length+width)*2;
	}

	public boolean compareArea(Rectangle X) {
		if(X.area() > this.area()) {
			return true;
		}
		return false;
	}
	
	public boolean square() {
		if(length == width) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle A = new Rectangle(2,4);
		A.perimeter();
		Rectangle B = new Rectangle(3,1);
		A.compareArea(B);
		A.square();
		System.out.println(A.compareArea(B));
		System.out.println(A.square());
	}
}
