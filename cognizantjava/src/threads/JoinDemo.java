package threads;

public class JoinDemo {

	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin("first");
		ThreadJoin tj2 = new ThreadJoin("second");
		ThreadJoin tj3 = new ThreadJoin("third");
		
		tj1.start();
		
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		tj2.start();
		tj3.start();

	}

}
