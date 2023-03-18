package core.basic.clonning;

public class Shallowtestclass {

public static void main(String[] args) throws CloneNotSupportedException{
			
	    ShallowClonning s1 = new ShallowClonning(10);
	     ShallowClonning s2 = (ShallowClonning) s1.clone();
		
	     s2.balance = 30;
	     
	     System.out.println("Before Clone");
	   System.out.println(s1.balance);
	   
	   System.out.println("After Clone");
	   System.out.println(s2.balance);
	   

}
			 
		}

	


