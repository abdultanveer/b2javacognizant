package callbacks;

public class MyBrother implements MobilePhoneListener {

	@Override
	public void greenButton() {
		System.out.println("mybrother: im releasing the payment");
		//greenbutton method will pause until resumewith method completes
		resumeWith();
	}

	@Override
	public void redButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resumeWith() {
		System.out.println("resuming the work from where i had stopped");
		
	}

}
