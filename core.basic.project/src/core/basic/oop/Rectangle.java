package core.basic.oop;

public class Rectangle extends Shape {
private int Length = 0;
private int Width = 0;


public void setLength (int Length){
	this.Length = Length;
}
public int getLength(){
	return Length;
}
public void setWidth (int Width){
	this.Width = Width;
}
public int getWidth(){
	return Width;
}
public double area(){
	double rArea = Length*Width;
	System.out.println("Rectangle area is "+ rArea);
	return rArea;
	
}

}
