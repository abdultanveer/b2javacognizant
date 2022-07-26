package callbacks;

public class MyBrother implements MobilePhoneListener {

	@Override
	public void greenButton() {
		System.out.println("mybrother: im releasing the payment");
	}

	@Override
	public void redButton() {
		// TODO Auto-generated method stub
		
	}

}
