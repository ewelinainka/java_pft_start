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
	}

	public static void hello(String somebody){

    System.out.println("Hello" + somebody + "!");
  }



}