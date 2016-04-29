package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import manager.ManagerImpl;

import com.takehome.billing.BillingImpl;
import com.takehome.stock.StockPrice;

import cart.CartImpl;

public class Use implements Runnable {
       
   public synchronized void run() {
	   ManagerImpl m=new ManagerImpl();
	   m.setData();
	   StockPrice s=new StockPrice();
		System.out.println("cart alloted to"
				+ Thread.currentThread().getName());
	
	   s.cartTime();
	   System.out.println("-------------------------------------------------------------------------");
	   try {
		s.checkAndBuy();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		  }
	
	public static void main(String[] args) throws InterruptedException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
       int noOfCarts=6,num = 0;
       Use u=new Use();

		System.out.println("enter the number of carts required");
	
		try {
			num =Integer.parseInt(br.readLine());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("no of customers in the cart at"+dateFormat.format(date)+num);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("the number of carts available before providing are:"+noOfCarts);
		 if (num<=noOfCarts){ 
			 System.out.println("carts alloted to "+num+"customers");
		for(int i=1;i<=num;i++){				
			Thread t=new Thread(u);
			t.start();
			t.setName("customer"+i);
		}
			noOfCarts=noOfCarts-num;
	System.out.println("remaining carts available  are"+noOfCarts);
	System.out.println("alloting cart for the remaining........");

	
	for(int i=1;i<noOfCarts;i++){
		Thread t=new Thread(u);
		t.start();
		t.setName("person"+i);
		
	}//end of for
	System.out.println("all the carts are handed over kindly wait in the waiting hall indicate you when the carts are free");
		}//end of if
		
	else if(num>=noOfCarts){
		System.out.println("carts alloted to "+noOfCarts+"customers");
		num=num-noOfCarts;
		for(int i=1;i<=num;i++){				
			Thread t=new Thread(u);
			t.start();
			t.setName("person"+i);
		
			}//end of for
		}//end of else
	
	
			System.out.println("remaining customers please wait in the waiting hall");
		
		 }
		
}