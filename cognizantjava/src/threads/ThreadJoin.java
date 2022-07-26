package threads;

public class ThreadJoin extends Thread {
	
	public ThreadJoin(String string) {
		super(string);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<3 ;i++) {
			
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
