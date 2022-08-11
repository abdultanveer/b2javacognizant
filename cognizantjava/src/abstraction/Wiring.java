package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl;
		sbl = //new HavellsAppliances(); //wiring
				new GEAppliances();
		
		sbl.switchOne(); //clicking of switches
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
	}

}
