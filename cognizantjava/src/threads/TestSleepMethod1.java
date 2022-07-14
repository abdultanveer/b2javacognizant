package threads;
class TestSleepMethod1 extends Thread{   
	
	
	public void run(){    
		for(int i=1;i<5;i++){   
			// the thread will sleep for the 500 milli seconds   
			try{Thread.sleep(900);}catch(InterruptedException e){System.out.println(e);}    
			System.out.println(i);    
		}    
	} 
	
	
}