package basics;

public class Demo {
	
	public static void main(String[] args) {
		Bike b;
		b = new Splendor();
		b.run();
		
		float pi = 3.14f; //8 bytes
		int py = (int) pi; //4bytes
		System.out.println("py ="+py);
		int pye = 3;
		float pie = pye;
		System.out.println("pie="+pie);
		
	}

}
