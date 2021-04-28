package com.dependency;

import com.dependency.Customer ;
import com.dependency.Dell;
import com.dependency.LaptopService;

public class Main  {
	
	public static void main (String[] args) {
		   System.out.println("------ DEPENCECY INJECTION ----------");	
		    LaptopService lap = new Dell();
		    Customer cus = new Customer(lap);
		    cus.getReview();
		    
	}
	   
}
