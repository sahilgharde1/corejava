package core.basic.oop;

public class TestClass {
public static void main(String[] args) {
	Shape s;
	s = new Shape();
	s.setColor("Red");
    s.setBorderWidth(3);

    int borderW = s.getBorderWidth();
    String color = s.getColor();
    
    System.out.println(borderW);
    System.out.println(color);
}
}
