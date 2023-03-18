package core.basic.oop;

public class Triangle extends Shape{

	private int base = 0;
	private int height = 0;
	private int area1;
	
	public void setBase (int base){
		this.base = base;
	}
	public int getBase (){
		return base;
	}
	public void setHeight (int height){
		this.height = height;
	}
    public int getHeight (){
    	return height;
    }
public double area(){
	area1 = base*height;
	System.out.println("Triangle area is" + area1);
	return area1;
	
}

}
