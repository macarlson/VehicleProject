import static org.junit.Assert.*;

import org.junit.Test;


public class VehicleJUnit {

	@Test
	public void test() {
		
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
		
		assertEquals("Owner of CarA is PersonA", PersonA, CarA.Owner());
		assertEquals("CarA has 4 doors", 4.0, CarA.NumberOfDoors,.003);
		assertEquals("Owner of TruckA is PersonB", PersonB, TruckA.Owner());
		assertEquals("TruckA has 2 axels", 2.0, TruckA.NumberOfAxels,.003);
		assertEquals("MotorcycleA has no side car", false, MotorcycleA.hasSideCar);
		
	}

}
