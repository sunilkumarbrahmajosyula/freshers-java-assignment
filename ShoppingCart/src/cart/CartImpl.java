package cart;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.takehome.stock.StockPrice;

public class CartImpl {

	public void provideCart() throws InterruptedException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("enteres the store at"+dateFormat.format(date));
		Thread.sleep(100000);
		StockPrice sb=new StockPrice();
		try {
			sb.checkAndBuy();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		}
}
