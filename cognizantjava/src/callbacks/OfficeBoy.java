package callbacks;

public class OfficeBoy {

	public void doGovtWork(MobilePhoneListener mobilePhone) {
		System.out.println("office boy : i am going for work");
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("office boy: im done with the work");
		mobilePhone.greenButton();
		
	}

}
