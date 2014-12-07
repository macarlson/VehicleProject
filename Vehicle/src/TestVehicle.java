
public class TestVehicle {

	public static void main(String args[]){
		Person PersonA = new Person();
		Car CarA = new Car();
		
		CarA.Owner = PersonA;
		CarA.NumberOfDoors = 4;
		
		Truck TruckA = new Truck();
		TruckA.Owner = PersonA;
		TruckA.NumberOfAxels = 2;
		
		Person PersonB = new Person();
		
		TruckA.transferOwnership(PersonB);
		
		Motorcycle MotorcycleA = new Motorcycle();
		MotorcycleA.hasSideCar = false;
}
}
