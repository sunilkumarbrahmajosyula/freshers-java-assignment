package com.takehome.stock;

import inventory.InventoryImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import manager.ManagerImpl;


// check the prices if necessary and buy


public class StockPrice{
InventoryImpl impl=new InventoryImpl(); 
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void checkAndBuy() throws NumberFormatException, IOException{
// to know the prices of the items
	Hashtable<String, Integer>ht=new Hashtable<String,Integer>();
ht.put("apples",100);
ht.put("pears",50);
ht.put("tropicana",40);
ht.put("redlabel",50);
ht.put("maggi",35);
ht.put("yippie",36);
ht.put("beans",48);
ht.put("leafyvegetables",85);
ht.put("chicken",200);
ht.put("mutton",350);
ht.put("jeans",1500);
ht.put("tshirt",600);
	

System.out.println("The list of items are:");
Enumeration<String> e=ht.keys();
while(e.hasMoreElements())
System.out.println(e.nextElement());
boolean select=true;
System.out.println("Do u want to know the prices of the item(true or false): ");
select=Boolean.parseBoolean(br.readLine());
while(select){
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
	}// end of if
		else{
			System.out.println("item not found");
		}	
	System.out.println("Do u want to get the price of more Items(true or false): ");
	choice=Boolean.parseBoolean(br.readLine());
		}//end of while(choice)

}//end of while(select)

//select Items and purchase


System.out.println("select items to add to the  cart");
    System.out.println("1.Fruits");
    System.out.println("2.Beverges");
    System.out.println("Instant Noodles");
    System.out.println("Vegetables");
    System.out.println("Non-Vegetables");
    System.out.println("clothing");
    int i=Integer.parseInt(br.readLine());
switch(i){
case 1:
	System.out.println("select fruits to add to the  cart");
    System.out.println("1.apples");
    System.out.println("2.pears");
      int f=Integer.parseInt(br.readLine());
    switch(f){
    case 1:
    	String name="apples";
        
    	Integer price=ht.get(name);
        if(price!=null){
        	int p=price.intValue();
        	System.out.println(name+"price:"+p);
        }
        else
        	System.out.println("not found");
           System.out.println("how many apples u wish to add to cart:");
           int qty=Integer.parseInt(br.readLine());
           int tot=qty*price;
           System.out.println("total price:"+tot);
         impl.setTotapples((impl.getTotapples()-qty));
         System.out.println("remaining totapples:"+impl.getTotapples());
           
           break;
    case 2:
         String name1="pears";
         
     	Integer price1=ht.get(name1);
         if(price1!=null){
         	int p1=price1.intValue();
         	System.out.println(name1+"price1:"+p1);
         }
         else
         	System.out.println("not found");
            System.out.println("how many pears u wish to add to cart:");
            int qty1=Integer.parseInt(br.readLine());
            int tot1=qty1*price1;
            System.out.println("total price:"+tot1);
          impl.setTotpears((impl.getTotpears()-qty1));
         
         break;
     default:
    	 System.out.println("invalid option");
     
    }//end of inner switch
    break;//break of case1
case 2:
	System.out.println("select beverges to add to the  cart");
    System.out.println("1.tropicana");
    System.out.println("2.redlabel");
    int b=Integer.parseInt(br.readLine());
    switch(b){
    case 1:
        String name2="tropicana";
        
     	Integer price2=ht.get(name2);
         if(price2!=null){
         	int p2=price2.intValue();
         	System.out.println(name2+"price2:"+p2);
         }
         else
         	System.out.println("not found");
            System.out.println("how many tropicana u wish to add to cart:");
            int qty2=Integer.parseInt(br.readLine());
            int tot2=qty2*price2;
            System.out.println("total price:"+tot2);
          impl.setTotpears((impl.getTotpears()-qty2));
        

    break;
   case 2:
   
	   String name3="redlabel";
       
    	Integer price3=ht.get(name3);
        if(price3!=null){
        	int p3=price3.intValue();
        	System.out.println(name3+"price3:"+p3);
        }
        else
        	System.out.println("not found");
           System.out.println("how many tropicana u wish to add to cart:");
           int qty3=Integer.parseInt(br.readLine());
           int tot3=qty3*price3;
           System.out.println("total price:"+tot3);
         impl.setTotpears((impl.getTotpears()-qty3));
           break;
    default:
   	 System.out.println("invalid option");
    
   }//end of inner switch
   break;
    
case 3:
	System.out.println("select instant noodles to add to the  cart");
    System.out.println("1.maggie");
    System.out.println("2.yippie");
    int n=Integer.parseInt(br.readLine());
    switch(n){
    case 1:
String name4="maggie";
        
     	Integer price4=ht.get(name4);
         if(price4!=null){
         	int p4=price4.intValue();
         	System.out.println(name4+"price4:"+p4);
         }
         else
         	System.out.println("not found");
            System.out.println("how many tropicana u wish to add to cart:");
            int qty4=Integer.parseInt(br.readLine());
            int tot4=qty4*price4;
            System.out.println("total price:"+tot4);
          impl.setTotpears((impl.getTotpears()-qty4));
       
    break;
   case 2:
   
	   String name5="yippie";
       
    	Integer price5=ht.get(name5);
        if(price5!=null){
        	int p5=price5.intValue();
        	System.out.println(name5+"price5:"+p5);
        }
        else
        	System.out.println("not found");
           System.out.println("how many tropicana u wish to add to cart:");
           int qty5=Integer.parseInt(br.readLine());
           int tot5=qty5*price5;
           System.out.println("total price:"+tot5);
         impl.setTotpears((impl.getTotpears()-qty5));
       
    break;
    default:
   	 System.out.println("invalid option");
    
   }//end of inner switch
   break;
case 4:
	System.out.println("select vegetables to add to the  cart");
    System.out.println("1.beans");
    System.out.println("3.leafyvegetables");
    int v=Integer.parseInt(br.readLine());
    switch(v){
    case 1:
    	
String name6="beans";
        
     	Integer price6=ht.get(name6);
         if(price6!=null){
         	int p6=price6.intValue();
         	System.out.println(name6+"price6:"+p6);
         }
         else
         	System.out.println("not found");
            System.out.println("how many kgs of beans u wish to add to cart:");
            int qty6=Integer.parseInt(br.readLine());
            int tot6=qty6*price6;
            System.out.println("total price:"+tot6);
          impl.setTotpears((impl.getTotpears()-qty6));
            break;
   case 2:
	   String name7="leafyvegetables";
       
    	Integer price7=ht.get(name7);
        if(price7!=null){
        	int p7=price7.intValue();
        	System.out.println(name7+"price7:"+p7);
        }
        else
        	System.out.println("not found");
           System.out.println("how many tropicana u wish to add to cart:");
           int qty7=Integer.parseInt(br.readLine());
           int tot7=qty7*price7;
           System.out.println("total price:"+tot7);
         impl.setTotpears((impl.getTotpears()-qty7));
       
    break;
    default:
   	 System.out.println("invalid option");
    
   }//end of inner switch
   break;	
case 5:
	System.out.println("select non vegetables to add to the  cart");
    System.out.println("1.chicken");
    System.out.println("2.mutton");
    int nv=Integer.parseInt(br.readLine());
    switch(nv){
    case 1:
    	
String name8="chicken";
        
     	Integer price8=ht.get(name8);
         if(price8!=null){
         	int p8=price8.intValue();
         	System.out.println(name8+"price8:"+p8);
         }
         else
         	System.out.println("not found");
            System.out.println("how many tropicana u wish to add to cart:");
            int qty8=Integer.parseInt(br.readLine());
            int tot8=qty8*price8;
            System.out.println("total price:"+tot8);
          impl.setTotpears((impl.getTotpears()-qty8));
        
    break;
   case 2:
   
	   String name9="mutton";
       
    	Integer price9=ht.get(name9);
        if(price9!=null){
        	int p9=price9.intValue();
        	System.out.println(name9+"price9:"+p9);
        }
        else
        	System.out.println("not found");
           System.out.println("how many tropicana u wish to add to cart:");
           int qty9=Integer.parseInt(br.readLine());
           int tot9=qty9*price9;
           System.out.println("total price:"+tot9);
         impl.setTotpears((impl.getTotpears()-qty9));
       
    break;
    default:
   	 System.out.println("invalid option");
    
   }//end of inner switch
   break;
case 6: 
	System.out.println("select clothes to add to the  cart");
    System.out.println("1.jeans");
    System.out.println("2.tshirt");
    int c=Integer.parseInt(br.readLine());
    switch(c){
    case 1:
    	
String name10="jeans";
        
     	Integer price10=ht.get(name10);
         if(price10!=null){
         	int p10=price10.intValue();
         	System.out.println(name10+"price10:"+p10);
         }
         else
         	System.out.println("not found");
            System.out.println("how many tropicana u wish to add to cart:");
            int qty10=Integer.parseInt(br.readLine());
            int tot10=qty10*price10;
            System.out.println("total price:"+tot10);
          impl.setTotpears((impl.getTotpears()-qty10));
        
    break;
   case 2:
   
	   String name11="tshirt";
       
    	Integer price11=ht.get(name11);
        if(price11!=null){
        	int p11=price11.intValue();
        	System.out.println(name11+"price11:"+p11);
        }
        else
        	System.out.println("not found");
           System.out.println("how many tropicana u wish to add to cart:");
           int qty11=Integer.parseInt(br.readLine());
           int tot11=qty11*price11;
           System.out.println("total price:"+tot11);
         impl.setTotpears((impl.getTotpears()-qty11));
       
    break;
    default:
   	 System.out.println("invalid option");
    
   }//end of inner switch
   break;	

    }// end of major while
}// end of method
	
public static void main(String[] args)  { 
	ManagerImpl mimpl=new ManagerImpl();
	mimpl.setData();
	StockPrice sb=new StockPrice();
	try {
		sb.checkAndBuy();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}// end of main method
}// end of class

