package com.foodOrder;

import java.util.Random;
import java.util.Scanner;

public class HotelAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Order food:\nChoose-\nVeg\nNonVeg ");
		Scanner sc=new Scanner(System.in);
		Random rd=new Random(100000000);
		int OrderId=(int) Math.random();
		chooseType();
		
	}

	private static void chooseType() {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		String choose=sc.next();
		Hotel hotel=null;
		
		if(choose.equalsIgnoreCase("veg")) {
			hotel=new VegOrder();
			hotel.order();			
		}else if(choose.equalsIgnoreCase("NonVeg")) {
			hotel=new NonVegOrder();
			hotel.order();			
		}else {
			System.out.println("You must select veg or nonveg");
			chooseType();
		}
	}
}
