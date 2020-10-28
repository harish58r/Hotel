package com.foodOrder;

import java.util.Scanner;

public class VegOrder implements Hotel {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("You selected Veg:");		
		addItem();
	}

	private void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Enter Food name-");
		Scanner sc =new Scanner(System.in );
		String str=sc.next();
		
	}

}
