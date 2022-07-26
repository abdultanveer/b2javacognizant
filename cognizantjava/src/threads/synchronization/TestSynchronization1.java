package threads.synchronization;
class TestSynchronization1{  
	public static void main(String args[]){  
		Table commonTable = new Table();//only one object  
		MyThread1 t1 = new MyThread1(commonTable,"first");  
		MyThread2 t2 = new MyThread2(commonTable,"second");  
		t2.start();  
		t1.start();  
	}  
}  