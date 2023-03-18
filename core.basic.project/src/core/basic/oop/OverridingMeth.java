package core.basic.oop;

public class OverridingMeth {
  public static void main(String[] args) {

	  Rectangle r = new Rectangle();
	   Shape s = new Shape();
	   Shape s1 = new Rectangle();
	   Rectangle r1 = (Rectangle) s1;
	  
	   r1.setLength(100);
	   r1.setWidth(50);
	    r1.area();
}
	
   
}
