public class AnotherSubCar extends Car implements CarInterface {

	public  AnotherSubCar(String manu, String model, String key, int engineCC, float fuel) {
		super(manu, model, key, engineCC, fuel);
	}
	
	public AnotherSubCar(String manu, String model, String key, int engineCC, float fuel, int year) {
		super(manu, model, key, engineCC, fuel, year);
	}

	@Override
	public void driveCar(int drivedTimeInSecond) {
		// TODO Auto-generated method stub
		runForSeconds(drivedTimeInSecond);
	}

	@Override
	public void addAmountFuel(float fuel) {
		// TODO Auto-generated method stub
		addFual(fuel);
	}

	@Override
	public int getManufacturingYear() {
		// TODO Auto-generated method stub
		return manufacturingYear;
	}

	@Override
	public String getCarModelName() {
		// TODO Auto-generated method stub
		return getModelName();
	}
}
