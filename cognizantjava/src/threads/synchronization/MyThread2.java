package threads.synchronization;
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t, String threadName){  
		super(threadName);
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  