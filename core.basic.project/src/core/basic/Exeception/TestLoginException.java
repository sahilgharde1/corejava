package core.basic.Exeception;

public class TestLoginException {

	public static void main(String[] args) {
			String LoginId = "Admin";
			
		if (LoginId.equals("Admin")) {
				System.out.println("User is Valid");
				}
			else {
				try {throw new LoginException ();
					
				} catch (LoginException e) {
					System.out.println(e.getMessage());
					// TODO: handle exception
				}
			}
			
		}
}

