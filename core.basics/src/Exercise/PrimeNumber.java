package Exercise;

public class PrimeNumber {
public static void main(String[] args) {
	
 int n =3;
 int c = 0;
 for (int i = 1; i <=n; i++) {
	if(n%i==0){
		c++;
	}
}
	if (c<=2){
		System.out.println(n+ " is Prime number . ");
	}else
		System.out.println(n+ " is not a Prime number . ");
	
}
}
	



