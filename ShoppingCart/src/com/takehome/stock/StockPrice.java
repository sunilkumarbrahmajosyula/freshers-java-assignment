package com.takehome.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class StockPrice{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void buy() throws NumberFormatException, IOException{
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
Enumeration e=ht.keys();
while(e.hasMoreElements())
System.out.println(e.nextElement());
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
		}	System.out.println("Do u want to selct more fruits-menu(true or false): ");
		choice=Boolean.parseBoolean(br.readLine());
		}
}
public void buyProducts(){
	ArrayList<String> arl=new ArrayList<String>();
	System.out.println("select Item to add");
	
}
	
public static void main(String[] args)  { 
	StockPrice sb=new StockPrice();
	try {
		sb.buy();
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


