package com.builder;

import com.builder.Phone;
import com.builder.PhoneBuilder;

public class Main {
	
	
	public static void main(String [] args) {
		Phone p = new Phone("Ios",16);
		Phone c = new PhoneBuilder().setOs("android").setRam(8).getPhone();
		System.out.println(c);
	}
	
}
