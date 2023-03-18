package core.basic.interfaces;

public class Businessman implements Richman,SocialWorker{
	
	public void earnMoney() {
		System.out.println("earn money");
	}

	
	public void donation() {
		System.out.println("Giving Donation");
	}

	
	public void party() {
		System.out.println("doing party");
		
	}
	public void helpToOther() {
	System.out.println("helping other peoples");
		
	}

}
