package threads;

public class ThreadDemo {
	
	public static void main(String[] args) {
		FeeThread myFriend = new FeeThread();
		myFriend.start();
		CanteenThread cThread = new CanteenThread();
		Thread otherFriend = new Thread(cThread);
		otherFriend.start();
		
		TestSleepMethod1 ts1 = new TestSleepMethod1();
		ts1.start();
		TestSleepMethod1 ts2 = new TestSleepMethod1();
		ts2.start();
	}

}
