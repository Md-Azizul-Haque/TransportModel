public class SubCar extends Car {

	private float chargeInBettery;
	private String colorString;
	
	public SubCar(String manu, String model, String key, int cc, float fuel, float charge, String color) {
		super(manu, model, key, cc, fuel);
		chargeInBettery = charge;
		colorString = color;
	}
	 
	public SubCar(String manu, String model, String key, int year, int cc, float fuel, float charge, String color) {
		super(manu, model, key, cc, fuel, year);
		chargeInBettery = charge;
		colorString = color;
	}

	public float getChargeInBettery() {
		return chargeInBettery;
	}

	public void setChargeInBettery(float chargeInBettery) {
		this.chargeInBettery = chargeInBettery;
	}

	public String getColorString() {
		return colorString;
	}
	
	@Override
	public void printAllinfo() {
		super.printAllinfo();
		runForSeconds(30);
		System.out.println("Amount of Fuel after driving : " +presentAmountOfFuel()+"L");
		System.out.println("Charge in Bettery :" +getChargeInBettery());
		System.out.println("Color of Car : " +getColorString());
	}
}
