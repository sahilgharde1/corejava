package core.basic.constructor;

public class Person {
   
	//using this to call constructor
	String firstName; 
   String lastName;
   String address;

public Person(){
	System.out.println("This person is Default");
}
public Person (String fn,String ln){
	 this.firstName = fn;
	this.lastName = ln;
System.out.println("Second parameter  constructor is called ");	
}
public Person (String fn , String ln , String address){
    this(fn,ln);
	this.address =address;
System.out.println("Third parameter constructor is called ");

}
}
