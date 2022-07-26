package threads.synchronization;
class Table{  
	void printTable(int n){//method not synchronized 
		System.out.println(Thread.currentThread().getName()+ "has entered");
		synchronized (this) {
			for(int i=1;i<=5;i++){  
				System.out.println(n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  

		}  
	}
}