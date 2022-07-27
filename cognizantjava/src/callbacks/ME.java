package callbacks;

public class ME {
	
	public static void main(String[] args) {
		System.out.println("abdul is assigning work to the office boy");
		
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				OfficeBoy myBoy = new OfficeBoy();
				MobilePhoneListener mobilePhone = new MyBrother();
				myBoy.doGovtWork("get my license",mobilePhone);
			}
		}.start();
		System.out.println("abdul has left for airport");
		
	}

}
