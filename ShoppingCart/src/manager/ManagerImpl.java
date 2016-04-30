package manager;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import inventory.InventoryImpl;

public class ManagerImpl extends InventoryImpl  {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 InventoryImpl impl=new InventoryImpl();
 public void setData() throws NumberFormatException, IOException{
	
     impl.setTotapples(10);
	 impl.setTotpears(10);
	 impl.setTotbeans(10);
	 impl.setTotjeans(10);
	 impl.setTotleafyvegetables(10);
	 impl.setTotmaggie(10);
	 impl.setTotredlabel(10);
	 impl.setTottropicana(10);
	 impl.setTottshirt(10);
	 impl.setTotyippie(10);
	 impl.setTotmutton(10);

		
 }
 public void resetapples() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotapples(add);
	
 }

 public void resetpears() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotpears(add);
	
 }
 public void resetbeans() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotbeans(add);
	
 }
 public void resetjeans() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotjeans(add);
	
 }
 public void resetleafyvegetables() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotleafyvegetables(add);
	
 }
 public void resetmaggie() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotmaggie(add);
	
 }
 public void resetredlabel() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotredlabel(add);
	
 }
 public void resettropicana() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTottropicana(add);
	
 }

 public void resettshirt() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTottshirt(add);
	
 }
 public void resetyippie() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotyippie(add);
	
 }
 public void resetmutton() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotmutton(add);
	
 }
 public void resetchicken() throws NumberFormatException, IOException {
	 System.out.println("manager:how many to add");
		 int add=Integer.parseInt(br.readLine());
		 impl.setTotchicken(add);
	
 }





}
