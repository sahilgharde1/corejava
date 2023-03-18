package core.basic.Exeception;

public class TestException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
		int c = a / b;
			System.out.println("Ans - "+ c);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
		finally {
			System.out.println("Final call");
		}
		}
	}
	
