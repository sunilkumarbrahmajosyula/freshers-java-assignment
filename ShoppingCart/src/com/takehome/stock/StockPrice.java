package com.takehome.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class StockPrice{
	private static final Integer I1001 = null;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void checkPrice() throws NumberFormatException, IOException{
Hashtable<String, Integer>ht=new Hashtable<String,Integer>();
ht.put("apples",100);
ht.put("pears",50);
ht.put("reaches",120);
ht.put("guava",80);
ht.put("berries",60);
ht.put("banana",40);
ht.put("orange",60);
ht.put("tropicana",40);
ht.put("redlabel",50);
ht.put("horlics",65);
ht.put("tajmahal",45);
ht.put("cadburry",25);
ht.put("maggi",35);
ht.put("yippie",36);
ht.put("aha",40);
ht.put("knoor",20);
ht.put("topramen",35);
ht.put("beans",48);
ht.put("capsicum",50);
ht.put("leafyvegetables",85);
ht.put("chicken",200);
ht.put("mutton",350);

	

System.out.println("The list of items are:");
Enumeration<String> e=ht.keys();
while(e.hasMoreElements())
System.out.println(e.nextElement());
boolean select=true;
while(select){
	System.out.println("Do u want to know the prices of the item(true or false): ");
	select=Boolean.parseBoolean(br.readLine());
boolean choice=true;
while(choice){
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter item name to get item price");
	String name=br.readLine();
	name=name.trim();
	Integer price=ht.get(name);
	if(price!=null){
		int pr=price.intValue();
		System.out.println(name+"price:"+pr);
	}
		else{
			System.out.println("item not found");
		}	System.out.println("Do u want to get the price of more Items(true or false): ");
		choice=Boolean.parseBoolean(br.readLine());
		}

}}
public void buyProducts() throws IOException{
	/*ArrayList<String> arl=new ArrayList<String>();
	System.out.println("enter how many items you wish to add");
	int num=Integer.parseInt(br.readLine());
	System.out.println("enter the item names to add");
	for(int i=0;i<num;i++){
		String s=br.readLine();
		arl.add(s);
	}
	System.out.println("the items in the list are");
	Iterator it=arl.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}*/

	System.out.println("select items to add to the  cart");
	System.out.println();
	
	
}
	
public static void main(String[] args)  { 
	StockPrice sb=new StockPrice();
	try {
		sb.checkPrice();
		sb.buyProducts();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}


