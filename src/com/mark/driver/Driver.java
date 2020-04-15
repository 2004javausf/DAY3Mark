package com.mark.driver;
import com.mark.bean.Car;

public class Driver {
public static void main(String[] args) {

		
		Car newCar = new Car();

		newCar.setBrand("Mercedes");
		newCar.setModel("E class");
		newCar.setColor("Grey");
		
		// Print out details instead of mem ref, using overriding toString method
		System.out.println(newCar);
		System.out.println();
		
		
		System.out.println(newCar.getBrand());
		System.out.println(newCar.getModel());
		System.out.println(newCar.getColor());	
	}

}
