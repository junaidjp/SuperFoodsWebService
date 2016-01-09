package com.willcode4coffee.webservice.implementation;

import org.example.superfoodsservice.SuperFoodsService;

public class SuperFoodsServiceSOAPImpl implements SuperFoodsService {

	/**
	 * 
	 */
	public String getSuperFoodList(String healthQuery) {
		
		if(healthQuery.equalsIgnoreCase("BloodPressure")){ 
			return "GrapeSeed Extract,Hawthorn Extract";
		}
		else if(healthQuery.equalsIgnoreCase("liverailments")){
			 return "Milk Thistle,Alpha Lipoic Acid";
		}
		else if(healthQuery.equalsIgnoreCase("kidneys")) { 
			 return "Aloe Vera Juice, Uva Ursi,Chlorella";
		}
		else if(healthQuery.equalsIgnoreCase("immunesystem")){ 
			return "Turmeric,Vitamin D3";
		}
		return "Currently this Info is not available";
	}

}
