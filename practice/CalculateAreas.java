import java.util.Scanner;


abstract class Shape{
	protected float area;
	public Shape() {
	
	}
	public abstract void calculateArea( );
	
	public final float getArea() {
		return this.area;
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void calculateArea( ) {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape{
	private float radius;
	
	public Circle() {
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void calculateArea( ) {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
}

class Triangle extends Shape{
	private float base;
	private float height;
	
	public Triangle() {
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void calculateArea( ) {
		this.area = 0.5f * this.base * this.height;
	}
}

class ShapeFactory{
	public static Shape getInstance( int choice ) {
		Shape shape = null;
		switch( choice ) {
		case 1:
			shape = new Rectangle();	//Upcaste
			break;
		case 2:
			shape = new Circle();	//Upcasting
			break;
		case 3:
			shape = new Triangle();
			break;
		}
		return shape;
	}
}

class ShapeTest{
	private static Scanner sc = new Scanner(System.in);
	private Shape shape;
    
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void acceptRecord() {
		if( this.shape != null ) {
			if( shape instanceof Rectangle ) {
				Rectangle rect = (Rectangle) shape;	//Downcasting
				System.out.print("Enter Length	:	");
				rect.setLength(sc.nextFloat());
				
				System.out.print("Enter Breadth	:	");
				rect.setBreadth(sc.nextFloat());
			
			}else if( shape instanceof Circle ) {
				Circle c = (Circle) shape;	//Downcasting
				
				System.out.print("Enter Radius	:	");
				c.setRadius(sc.nextFloat());
			}else {
				Triangle t = (Triangle) shape;	//Downcasting
				
				System.out.print("Enter Base	:	");
				t.setBase(sc.nextFloat());
				System.out.print("Enter Height	:	");
				t.setHeight(sc.nextFloat());
			}
			this.shape.calculateArea();
		}
		
	}

	public void printRecord() {
		if( this.shape != null )
			System.out.println("Area	:	"+shape.getArea());
	}
	
	
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Rectangle.");
		System.out.println("2.Circle.");
		System.out.println("3.Triangle.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}

class CalculateAreas {
	public static void main(String[] args) {
		int choice;
		ShapeTest test = new ShapeTest();
		
		while( ( choice = ShapeTest.menuList( ) ) != 0 ) {
			
			Shape shape = ShapeFactory.getInstance(choice);
			test.setShape(shape);
			
			if( shape != null ) {
				test.acceptRecord();
				test.printRecord();
			}
		}
	}
}