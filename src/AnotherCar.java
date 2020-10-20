public class AnotherCar {

	public static void main(String[] args) {
		
		Car aCar = new Car("Lexus", "007XD","lkjja", 4000, 200f, 2019);
		SubCar aSubCar = new SubCar("FORD MOTOR","SUPER CAR","ade", 2020, 3000, 112f, 30, "Yello");
		
		aCar.printAllinfo();
		aSubCar.printAllinfo();
	}

}
