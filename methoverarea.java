package javalab;

import java.util.Scanner;

public class methoverarea {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int breadth=sc.nextInt();
		System.out.println("Enter the radius of circle");
		float radius=sc.nextFloat();
		System.out.println("Enter the base of triangle");
        float base=sc.nextFloat();
        System.out.println("Enter the height of triangle");
        float height=sc.nextFloat();
        Shape shape=new Shape();
        shape.area(length,breadth);
        shape.area(radius);
        shape.area(base,height);
	}
}
class Shape{
	
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of rectangle is" +area);
	}
	public void area(float radius) {
		float area=3.14f*radius*radius;
		System.out.println("Area of circle is:"+area);
	}
	public void area(float base,float  height)
	{
		float area=0.5f*base*height;
		System.out.println("Area of triangle is:"+area);
	}
	
}
