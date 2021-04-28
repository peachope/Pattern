package com.dependency;

public class Customer {
       private LaptopService lap;
       
       public Customer(LaptopService lap) {
    	   this.lap = lap;
    	   
       }
       
       public void getReview() {
    	   lap.showInfor("in my opinion");
       }
       
       
       
       
}
