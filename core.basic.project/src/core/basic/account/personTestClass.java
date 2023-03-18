package core.basic.account;

public class personTestClass {
	public static void main(String[] args) {
		
	PersonMethod p;
    p = new PersonMethod();
   
	p.setName("Sahil");

	p.setAge(24);

	p.setDob("26/11/1998");
	
	p.setAddress("Sudama Nagar Indore");

	String NameIs = p.getName();
	int AgeIs = p.getAge();
	String DobIs = p.getDob();
    String Add  = p.getAddress();
    
	
	System.out.println(" Name " +NameIs);
	System.out.println(" Age  "+AgeIs);
	System.out.println(" Dob  "+DobIs);
	System.out.println(" Add "+Add);
	
	
	}
}