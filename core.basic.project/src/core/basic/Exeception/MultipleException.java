package core.basic.Exeception;

public class MultipleException {
public static void main(String[] args) {
	
	String name = "Arjun";    //if value is null then it will return Null pointer Exeception 
 try {
	 System.out.println(" Length "+ name.length());
		System.out.println("Character  "+ name.charAt(6));
		
} catch (StringIndexOutOfBoundsException e) {
	//System.out.println(e.getMessage());
e.printStackTrace();	
}	
 catch (NullPointerException e) {
	e.printStackTrace();
}
	
}
}