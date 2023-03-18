package core.basic.Exeception;

public class DiffExeception {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		try {
			int c = a / b;
			System.out.println("Ans - "+ c);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
		//finally method always Execute
		finally {
			System.out.println("Final call");
		}
		
		
		System.out.println("Execute");
	}
	}


