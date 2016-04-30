package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import manager.ManagerImpl;

import com.takehome.stock.StockPrice;

public class ShopperActivity implements Runnable {

	public synchronized void run() {
		ManagerImpl imp1 = new ManagerImpl();
		try {
			imp1.setData();
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		StockPrice s = new StockPrice();
		System.out.println(
				Thread.currentThread().getName()+"entered the cart at");
		//System.out.println("\n");
		s.cartTime();
		System.out
				.println("-------------------------------------------------------------------------");
		try {
			s.checkAndBuy();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int noOfCarts = 6, num = 0;
		ShopperActivity u = new ShopperActivity();

		System.out.println("Enter the number of carts required");

		try {
			num = Integer.parseInt(br.readLine());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println("No of shoppers are there in the store at\t"
					+ dateFormat.format(date) + num);
			System.out.println("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out
				.println("The number of carts available before providing are  :"
						+ noOfCarts);
		System.out.println("\n");
		if (num <= noOfCarts) {
			System.out.println("Carts alloted to " + num + " " + "customers");
			System.out.println("\n");
			for (int i = 1; i <= num; i++) {
				Thread t = new Thread(u);
				t.start();
				t.setName("customer" + i);
			}
			noOfCarts = noOfCarts - num;
			System.out.println("Remaining carts available  are  " + noOfCarts);
			System.out.println("\n");
			System.out.println("Alloting cart for the remaining........");
			System.out.println("\n");

			for (int i = 1; i < noOfCarts; i++) {
				Thread t = new Thread(u);
				t.start();
				t.setName("person" + i);

			}// end of for
			System.out
					.println("All the carts are handed over kindly wait in the waiting hall indicate you when the carts are free");
			System.out.println("\n");
		}// end of if

		else if (num >= noOfCarts) {
			System.out.println("Carts alloted to " + noOfCarts + "customers");
			System.out.println("\n");
			num = num - noOfCarts;
			for (int i = 1; i <= num; i++) {
				Thread t = new Thread(u);
				t.start();
				t.setName("person" + i);

			}// end of for
		}// end of else

		System.out
				.println("Remaining customers please wait in the waiting hall");

	}

}