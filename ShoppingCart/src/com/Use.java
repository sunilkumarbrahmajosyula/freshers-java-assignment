package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cart.CartImpl;

public class Use implements Runnable {
       
   public void run() {
      	  CartImpl c=new CartImpl();
		  c.provideCart();
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
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		e.printStackTrace();	
		}
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
		}
	System.out.println("all the carts are handed over kindly wait in the waiting hall");
	}
		
	
		
		else{
			System.out.println("kindly wait for the carts in the waiting hall");
			
		}
		/*Use u= new Use();

		Thread u1 = new Thread();
		Thread u2 = new Thread();
		Thread u3 = new Thread();
		Thread u4 = new Thread();
		Thread u5 = new Thread();

		
		u1.start();
		u2.start();
		u3.start();
		u4.start();
		u5.start();
*/

	}

}
