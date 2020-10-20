public class Car {

	public String manufacturerName;
	int engineCC;
	protected int manufacturingYear;
	private String modelName;
	private String carKeyValue;
	private float fuelAmount;
	final private float amountOfFuelConsumedPerSecond = 0.66f;
	
	public Car(String manu, String model, String key, int engineCC, float fuel) {
		manufacturerName = manu;
		modelName = model;
		carKeyValue = key;
		this.engineCC = engineCC;
		fuelAmount = fuel;
		manufacturingYear = 0;
	}
	
	public Car(String manu, String model, String key, int engineCC, float fuel, int year) {
		this(manu, model, key, engineCC, fuel);
		manufacturingYear = year;
	}
	
	public float presentAmountOfFuel() {  
		return fuelAmount;	
	}

	public String getModelName() {
		return modelName;
	}
	
	public boolean matchPassword(String userInput) {
		return userInput.equals(carKeyValue);
	}
	
	public void addFual(float fualadd) {
		fuelAmount += fualadd;
	}
	
	public void runForSeconds(int timeInSecond) {
		float usedFuel = timeInSecond*amountOfFuelConsumedPerSecond;
		fuelAmount -= usedFuel;
	}
	
	public void printAllinfo() {
		System.out.println("\n");
		System.out.println("Manufacturer : " +manufacturerName);
		System.out.println("Model NAme : " +getModelName());
		System.out.println("Password Match : " +matchPassword("abc"));
		System.out.println("Engine CC : " +engineCC);
		System.out.println("Amount of Fuel : " +presentAmountOfFuel() +"L");
		addFual(50);
		System.out.println("Amount of Fuel after adding : " +presentAmountOfFuel() +"L");
		runForSeconds(40);
		System.out.println("Amount of Fuel after driving : " +presentAmountOfFuel()+"L");
   }
}