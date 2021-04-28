package com.prototype;

import com.prototype.BookShop;

public class Main  {
	public static void main( String [] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();		
		bs.setShopName("Peach");		
		bs.loadData();
		
		BookShop bs1 = (BookShop)bs.clone();		
		bs1.setShopName("Hope");
		bs1.loadData();
	}
}
