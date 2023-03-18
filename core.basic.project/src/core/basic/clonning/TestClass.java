package core.basic.clonning;

public class TestClass {
public static void main(String[] args)  {
	//object cloning
Account a1 = new Account() ;
a1.setBalance(10);

Account a2 = a1;
a2.setBalance(20);

a1.getBalance();
a2.getBalance();

System.out.println(a1.getBalance());
System.out.println(a2.getBalance());



}
}
