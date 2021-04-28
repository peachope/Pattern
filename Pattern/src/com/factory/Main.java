package com.factory;

import com.factory.Color;
import com.factory.ColorFactory;

public class Main {

	public static void main(String[] args) {
		  System.out.println("------ FACTORY-----------");	
		    
		    ColorFactory colorFactory = new ColorFactory();
		    Color color  = colorFactory.getInstance("Sky");
		    color.show();

	}

}
