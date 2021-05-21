package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main (String[] args) {
		hello(" world");
		hello(" user");
		hello(" Ewelina");

		Square s=new Square(5);

		System.out.println("Area of the square with side l " + s.l + " = " + s.area());

		Rectangle r= new Rectangle(4,6);

		System.out.println("Area of the rectangle with side a " + r.a + " and b " + r.b + " = " + r.area());

		Point p1=new Point(5,6);
		Point p2=new Point(3,7);

		System.out.println("The distance between point A:( " + p1.x + "," + p1.y + " ) " + " and point B: ( " + p2.x + "," + p2.y + " ) is " + p1.distance(p2));

	}

/*	public static double distance (Point p1, Point p2){
		double dx = p2.x - p1.x;
		double dy = p2.y - p1.y;
		return Math.sqrt((dx * dx) + (dy * dy));


	}
*/
	public static void hello(String somebody){

    System.out.println("Hello" + somebody + "!");
  }



}