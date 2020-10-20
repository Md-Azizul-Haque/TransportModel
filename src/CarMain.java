public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car car = new Car("TOYOTA","Corolla", "xyz", 1200, 60.2f);
		
		Car anoterCar = new Car("Nissan", "Axela", "abc", 1800, 90f);
		
		SubCar subCar = new SubCar("BMW","Hybrid Series","abc123", 2500, 80f, 11, "Black");
		
		AnotherSubCar anotherSubCar = new AnotherSubCar("Uttara Motor","FX09", "121", 4000,101f, 2018);
		
		car.printAllinfo();
		anoterCar.printAllinfo();
		subCar.printAllinfo();
		anotherSubCar.printAllinfo();
		
		anotherSubCar.addAmountFuel(6f);
		System.out.println("\n Fuel(+) : " +anotherSubCar.presentAmountOfFuel());
		System.out.println("Model Name : " +anotherSubCar.getCarModelName());
		System.out.println("Year :" +anotherSubCar.getManufacturingYear());
	}

}
