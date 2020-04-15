package com.mark.driver;
import com.mark.bean.FavVacationSpot;

public class Driver2 {
public static void main(String[] args) {

		
		FavVacationSpot newSpot = new FavVacationSpot();

		newSpot.setSpot("Azerbaijan");

		
		// Print out details instead of mem ref, using overriding toString method
		System.out.println(newSpot);

	}

}
