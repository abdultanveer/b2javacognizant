package abstraction;

public class HavellsAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("Havells light is on");		
	}

	@Override
	public void switchTwo() {
		System.out.println("Havells AC is on");		
		
	}

	@Override
	public void switchThree() {
		System.out.println("Havells fan is on");		
		
	}

	@Override
	public void switchFour() {
		System.out.println("Havells heater is on");		
		
	}

}
