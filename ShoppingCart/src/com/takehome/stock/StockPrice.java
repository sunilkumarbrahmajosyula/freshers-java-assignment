package com.takehome.stock;

import inventory.InventoryImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import manager.ManagerImpl;

import com.takehome.billing.BillingImpl;

import cart.CartImpl;

// check the prices if necessary and buy

public class StockPrice implements CartImpl, BillingImpl {
	ManagerImpl imp = new ManagerImpl();

	public void cartTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Enteres the store at" + dateFormat.format(date));

	}

	InventoryImpl impl = new InventoryImpl();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int bill;
	private HashMap<String, Integer> hm;

	public void checkAndBuy() throws NumberFormatException, IOException {
		// to know the prices of the items
		long ftot = 0;
		HashMap<String, Integer> ht = new HashMap<String, Integer>();
		ht.put("apples", 100);
		ht.put("pears", 50);
		ht.put("tropicana", 40);
		ht.put("redlabel", 50);
		ht.put("maggi", 35);
		ht.put("yippie", 36);
		ht.put("beans", 48);
		ht.put("leafyvegetables", 85);
		ht.put("chicken", 200);
		ht.put("mutton", 350);
		ht.put("jeans", 1500);
		ht.put("tshirt", 600);

		System.out.println("The list of items are:");
		Set<String> set = new HashSet<String>();
		set = ht.keySet();
		System.out.println(set);
		boolean choice = true;
		System.out
				.println("Do u want to know the prices of the items(true or false)");
		choice = Boolean.parseBoolean(br.readLine());
		while (choice) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter item name to get item price");

			String name = br.readLine();
			name = name.trim();
			Integer price = ht.get(name);

			if (price != null) {
				int pr = price.intValue();
				System.out.println(name + "price:" + pr);
			}
			// end of if
			else {
				System.out.println("item not found");
			}
			System.out
					.println("Do u want to get the price of more Items(true or false): ");
			choice = Boolean.parseBoolean(br.readLine());
		}// end of while(choice)

		// end of while(select)

		// select Items and purchase
		hm = new HashMap<String, Integer>();
		boolean want = true;
		System.out.println("Do you want to continueshopping (true or false) ");
		want = Boolean.parseBoolean(br.readLine());
		while (want) {
			System.out.println("Select items to add to the  cart");
			System.out.println("1.Fruits");
			System.out.println("2.Beverges");
			System.out.println("3.Instant Noodles");
			System.out.println("4.Vegetables");
			System.out.println("5.Non-Vegetables");
			System.out.println("6.clothing");
			int i = Integer.parseInt(br.readLine());
			switch (i) {
			case 1:
				System.out.println("Select fruits to add to the  cart");
				System.out.println("1.apples");
				System.out.println("2.pears");
				int f = Integer.parseInt(br.readLine());
				switch (f) {
				case 1:
					String name = "apples";

					Integer price = ht.get(name);
					if (price != null) {
						int p = price.intValue();
						System.out.println(name + "price:" + p);
					} else
						System.out.println("not found");
					hm.put(name, price);
					System.out
							.println("How many apples u wish to add to cart:");
					int qty = Integer.parseInt(br.readLine());
					long tot = qty * price;
					System.out.println("Total price:" + tot);
					if (impl.getTotapples() == 0) {
						imp.resetapples();
					} else {
						impl.setTotapples((impl.getTotapples()) - qty);
						System.out
								.println("The state of inventory for the item apples:"
										+ impl.getTotapples());
					}
					ftot = ftot + tot;
					break;

				case 2:
					String name1 = "pears";
					Integer price1 = ht.get(name1);
					if (price1 != null) {
						int p1 = price1.intValue();
						System.out.println(name1 + "price1:" + p1);
					} else
						System.out.println("not found");
					hm.put(name1, price1);
					System.out.println("How many pears u wish to add to cart:");
					int qty1 = Integer.parseInt(br.readLine());
					int tot1 = qty1 * price1;
					System.out.println("total price:" + tot1);
					if (impl.getTotpears() == 0) {
						imp.resetpears();
					} else {
						impl.setTotpears((impl.getTotpears()) - qty1);
						System.out
								.println("The state of inventory for the item pear:"
										+ impl.getTotpears());
					}
					DateFormat dateFormat = new SimpleDateFormat(
							"yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					System.out.println("Items in the cart  at"
							+ dateFormat.format(date));
					Set<String> data13 = new HashSet<String>();
					data13 = hm.keySet();
					System.out.println("The state of shopper's cart is"
							+ data13);

					break;

				default:
					System.out.println("invalid option");

				}// end of inner switch
				break;// break of case1

			case 2:
				System.out.println("Select beverges to add to the  cart");
				System.out.println("1.tropicana");
				System.out.println("2.redlabel");
				int b = Integer.parseInt(br.readLine());
				switch (b) {

				case 1:
					String name2 = "tropicana";

					Integer price2 = ht.get(name2);
					if (price2 != null) {
						int p2 = price2.intValue();
						System.out.println(name2 + "price2:" + p2);
					} else
						System.out.println("not found");
					hm.put(name2, price2);
					System.out
							.println("How many tropicana u wish to add to cart:");
					int qty2 = Integer.parseInt(br.readLine());
					int tot2 = qty2 * price2;
					System.out.println("Total price:" + tot2);
					if (impl.getTottropicana() == 0) {
						imp.resettropicana();
					} else {
						impl.setTottropicana((impl.getTottropicana()) - qty2);
						System.out
								.println("The state of inventory for the item tropicana"
										+ impl.getTottropicana());
					}
					break;

				case 2:

					String name3 = "redlabel";

					Integer price3 = ht.get(name3);
					if (price3 != null) {
						int p3 = price3.intValue();
						System.out.println(name3 + "price3:" + p3);
					} else
						System.out.println("not found");
					hm.put(name3, price3);
					System.out
							.println("How many tropicana u wish to add to cart:");
					int qty3 = Integer.parseInt(br.readLine());
					int tot3 = qty3 * price3;
					System.out.println("total price:" + tot3);
					if (impl.getTotredlabel() == 0) {
						imp.resetredlabel();
					} else {
						impl.setTotapples((impl.getTotredlabel()) - qty3);
						System.out
								.println("The state of inventory for the item redlabel"
										+ impl.getTotredlabel());
					}
					break;

				default:
					System.out.println("invalid option");

				}// end of inner switch
				Set<String> data = new HashSet<String>();
				data = hm.keySet();
				System.out.println(data);
				break;

			case 3:
				System.out
						.println("Select instant noodles to add to the  cart");
				System.out.println("1.maggie");
				System.out.println("2.yippie");
				int n = Integer.parseInt(br.readLine());
				switch (n) {
				case 1:
					String name4 = "maggie";

					Integer price4 = ht.get(name4);
					if (price4 != null) {
						int p4 = price4.intValue();
						System.out.println(name4 + "price4:" + p4);
					} else
						System.out.println("not found");
					hm.put(name4, price4);
					System.out
							.println("How many maggie u wish to add to cart:");
					int qty4 = Integer.parseInt(br.readLine());
					int tot4 = qty4 * price4;
					System.out.println("total price:" + tot4);
					if (impl.getTotmaggie() == 0) {
						imp.resetmaggie();
					} else {
						impl.setTotmaggie((impl.getTotmaggie()) - qty4);
						System.out
								.println("The state of inventory for the item maggie"
										+ impl.getTotmaggie());
					}

					break;
				case 2:

					String name5 = "yippie";

					Integer price5 = ht.get(name5);
					if (price5 != null) {
						int p5 = price5.intValue();
						System.out.println(name5 + "price5:" + p5);
					} else
						System.out.println("not found");
					hm.put(name5, price5);
					System.out
							.println("How many yippie u wish to add to cart:");
					int qty5 = Integer.parseInt(br.readLine());
					int tot5 = qty5 * price5;
					System.out.println("Total price:" + tot5);
					if (impl.getTotyippie() == 0) {
						imp.resetyippie();
					} else {
						impl.setTotyippie((impl.getTotyippie()) - qty5);
						System.out
								.println("The state of inventory for the item yippie"
										+ impl.getTotyippie());
					}
					impl.setTotyippie((impl.getTotyippie() - qty5));
					System.out.println("Remaining totyippie:"
							+ impl.getTotyippie());

					break;
				default:
					System.out.println("invalid option");

				}
				break;
			case 4:
				System.out.println("Select vegetables to add to the  cart");
				System.out.println("1.beans");
				System.out.println("3.leafyvegetables");
				int v = Integer.parseInt(br.readLine());
				switch (v) {
				case 1:

					String name6 = "beans";

					Integer price6 = ht.get(name6);
					if (price6 != null) {
						int p6 = price6.intValue();
						System.out.println(name6 + "price6:" + p6);
					} else
						System.out.println("not found");
					hm.put(name6, price6);
					System.out
							.println("How many kgs of beans u wish to add to cart:");
					int qty6 = Integer.parseInt(br.readLine());
					int tot6 = qty6 * price6;
					System.out.println("total price:" + tot6);
					if (impl.getTotbeans() == 0) {
						imp.resetbeans();
					} else {
						impl.setTotbeans((impl.getTotbeans()) - qty6);
						System.out
								.println("The state of inventory for the item beans"
										+ impl.getTotbeans());
					}
					break;
				case 2:
					String name7 = "leafyvegetables";

					Integer price7 = ht.get(name7);
					if (price7 != null) {
						int p7 = price7.intValue();
						System.out.println(name7 + "price7:" + p7);
					} else
						System.out.println("not found");
					hm.put(name7, price7);
					System.out
							.println("How many leafyvegetables u wish to add to cart:");
					int qty7 = Integer.parseInt(br.readLine());
					int tot7 = qty7 * price7;
					System.out.println("Total price:" + tot7);
					if (impl.getTotleafyvegetables() == 0) {
						imp.resetleafyvegetables();
					} else {
						impl.setTotleafyvegetables((impl
								.getTotleafyvegetables()) - qty7);
						System.out
								.println("The state of inventory for the item leafy vegetables:"
										+ impl.getTotleafyvegetables());
					}
					Set<String> data7 = new HashSet<String>();
					data7 = hm.keySet();
					System.out.println(data7);
					break;
				default:
					System.out.println("invalid option");

				}
				break;
			case 5:
				System.out.println("Select non vegetables to add to the  cart");
				System.out.println("1.chicken");
				System.out.println("2.mutton");
				int nv = Integer.parseInt(br.readLine());
				switch (nv) {
				case 1:

					String name8 = "chicken";

					Integer price8 = ht.get(name8);
					if (price8 != null) {
						int p8 = price8.intValue();
						System.out.println(name8 + "price8:" + p8);
					} else
						System.out.println("not found");
					hm.put(name8, price8);
					System.out
							.println("How many kgs of chicken u wish to add to cart:");
					int qty8 = Integer.parseInt(br.readLine());
					int tot8 = qty8 * price8;
					System.out.println("total price:" + tot8);
					if (impl.getTotchicken() == 0) {
						imp.resetchicken();
					} else {
						impl.setTotchicken((impl.getTotchicken()) - qty8);
						System.out
								.println("The state of inventory for the item chicken"
										+ impl.getTotchicken());
					}
					break;
				case 2:

					String name9 = "mutton";

					Integer price9 = ht.get(name9);
					if (price9 != null) {
						int p9 = price9.intValue();
						System.out.println(name9 + "price9:" + p9);
					} else
						System.out.println("not found");
					hm.put(name9, price9);
					System.out
							.println("How many mutton u wish to add to cart:");
					int qty9 = Integer.parseInt(br.readLine());
					int tot9 = qty9 * price9;
					System.out.println("total price:" + tot9);
					if (impl.getTotmutton() == 0) {
						imp.resetmutton();
					} else {
						impl.setTotmutton((impl.getTotmutton()) - qty9);
						System.out
								.println("The state of inventory for the item mutton"
										+ impl.getTotmutton());
					}
					break;
				default:
					System.out.println("invalid option");

				}// end of inner switch
				Set<String> data11 = new HashSet<String>();
				data11 = hm.keySet();
				System.out.println(data11);
				break;
			case 6:
				System.out.println("select clothes to add to the  cart");
				System.out.println("1.jeans");
				System.out.println("2.tshirt");
				int c = Integer.parseInt(br.readLine());
				switch (c) {
				case 1:

					String name10 = "jeans";

					Integer price10 = ht.get(name10);
					if (price10 != null) {
						int p10 = price10.intValue();
						System.out.println(name10 + "price10:" + p10);
					} else
						System.out.println("not found");
					hm.put(name10, price10);
					System.out.println("How many jeans u wish to add to cart:");
					int qty10 = Integer.parseInt(br.readLine());
					int tot10 = qty10 * price10;
					System.out.println("Total price:" + tot10);
					if (impl.getTotjeans() == 0) {
						imp.resetjeans();
					} else {
						impl.setTotjeans((impl.getTotjeans()) - qty10);
						System.out
								.println("The state of inventory for the item jeans"
										+ impl.getTotjeans());
					}
					break;
				case 2:

					String name11 = "tshirt";

					Integer price11 = ht.get(name11);
					if (price11 != null) {
						int p11 = price11.intValue();
						System.out.println(name11 + "price11:" + p11);
					} else
						System.out.println("not found");
					hm.put(name11, price11);
					System.out
							.println("How many tshirts u wish to add to cart:");
					int qty11 = Integer.parseInt(br.readLine());
					int tot11 = qty11 * price11;
					System.out.println("Total price:" + tot11);
					if (impl.getTottshirt() == 0) {
						imp.resettshirt();
					} else {
						impl.setTottshirt((impl.getTottshirt()) - qty11);
						System.out
								.println("The state of inventory for the item tshirt"
										+ impl.getTottshirt());
					}
					DateFormat dateFormat = new SimpleDateFormat(
							"yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					System.out.println("Items in the cart  at"
							+ dateFormat.format(date));
					Set<String> data13 = new HashSet<String>();
					data13 = hm.keySet();
					System.out.println("The state of shopper's cart is"
							+ data13);
					break;
				default:
					System.out.println("Invalid option");

				}// end of inner switch
			}// end of outer switch

			System.out
					.println("Do you want to selct more items(true or false): ");
			want = Boolean.parseBoolean(br.readLine());
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Items in the cart at" + dateFormat.format(date));
		Set<String> data = new HashSet<String>();
		data = hm.keySet();
		System.out.println("The state of shoppper's cart is" + data);
		int c = (int) ftot;
		billing(c);
		System.out.println("-----------------------------------------------");

	}

	public void billing(int totBill) {
		this.bill = totBill;
		System.out.println("The total cost of all the items in th cart is "
				+ this.bill);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("The customer leaves the store at"
				+ dateFormat.format(date));

	}

}
