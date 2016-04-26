package cart;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CartImpl {

	public void provideCart() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("cart provided at"+dateFormat.format(date));
		
			
		}
}
