package inheritance;

//Hierarchical Inheritance
//Shape system
//Parent - shape
//Child - circle,rectangle

class Shape{
	void draw() {
		System.out.println("Drawing shape");
	}
}
class Circle extends Shape{
	void area() {
		System.out.println("Area of Circle");
	}
}
class Rectangle extends Shape{
	void area() {
		System.out.println("Area of rectangle");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.area();
		
		Rectangle r = new Rectangle();
		r.draw();
		r.area();
	}

}
