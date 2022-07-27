package lamdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
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
		//unboxing is an overhead
		//IntPredicate -- in case of intPredicate there's no overhead of converting Integer into an int
		System.out.println(predict.test(20));
		
		Consumer<String> consume = (someString)->{System.out.println("hello--"+someString);};
		consume.accept("cognizant associates");
		
		Function<String, Integer> function = 
				(str) -> {return str.length();};
				System.out.println(function.apply("hello world"));
				
				Function<String, Integer> fun1 = MyDraw::getLength;
				
				System.out.println("length of string is--"+fun1.apply("welcome"));

	}

}
