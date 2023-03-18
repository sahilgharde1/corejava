package core.basic.oop;

public class Circle extends Shape {
	private double radius ;
	private double area2;
public static final float PI = 3.14f;
	public void setRadius (double radius){
		this.radius = radius;
	}
	public double getRadius (){
		return radius;
	}
	
public double area(){
	area2 = PI*radius*radius;
	System.out.println("Area of circle is"+area2);
	return area2;
}
}

