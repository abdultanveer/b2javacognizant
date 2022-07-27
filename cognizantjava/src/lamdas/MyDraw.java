package lamdas;

public class MyDraw implements Drawable{

	@Override
	public void draw() {
		System.out.println("drawing some shape");
	}
	
	public static int getLength(String str) {
		return str.length();
	}

}
