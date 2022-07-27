package lamdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoLamdas {
	
	public static void main(String[] args) {
		MyDraw myDraw = new MyDraw();
		myDraw.draw();
		//life after lamdas 
		
		Drawable d2 = ()-> {System.out.println("drawing shape using lamda");};
		d2.draw();
		
		Wishable w1 = (personFname) -> { System.out.println("hello "+personFname);};
	
		w1.wish("abdul");
		w1.wish("ansari");
		
		Predicate<Integer> predict = (number)-> {return number%2 == 0 ? true : false;};
		System.out.println(predict.test(20));
		
		Consumer<String> consume = (someString)->{System.out.println("hello--"+someString);};
		consume.accept("cognizant associates");
	}

}
