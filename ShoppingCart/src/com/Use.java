package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import manager.ManagerImpl;

import com.takehome.billing.BillingImpl;
import com.takehome.stock.StockPrice;

import cart.CartImpl;

public class Use implements Runnable {
       
   public void run() {
	   ManagerImpl m=new ManagerImpl();
	   m.setData();
	   StockPrice s=new StockPrice();
		
	   s.cartTime();
	   try {
		s.checkAndBuy();
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
      	 
      	  
		
		  }
	
	public static void main(String[] args) {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
       int noOfCarts=6,num = 0;
       Use u=new Use();

		System.out.println("enter the number of carts required");
	
		try {
			num =Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the number of carts available before providing are:"+noOfCarts);
		if(num<=noOfCarts){
		for(int i=1;i<=num;i++){				
			Thread t=new Thread(u);
			t.start();
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end of catch
			}//end of for
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();	
		}//end of catch
	noOfCarts=noOfCarts-num;
	System.out.println("the number of carts available left are"+noOfCarts);
	
	for(int i=1;i<noOfCarts;i++){
		Thread t=new Thread(u);
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end of for
	System.out.println("all the carts are handed over kindly wait in the waiting hall");
		}
		
	else if (num>=noOfCarts) {
		num=num-noOfCarts;
		for(int i=1;i<=num;i++){				
			Thread t=new Thread(u);
			t.start();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end of for
		/*try {
			//Thread.sleep(100000);
		} catch (InterruptedException e) {
		e.printStackTrace();	
		}*/
		}
	
			System.out.println("no carts are available please wait in the waiting hall");
		}
		
		
	}

