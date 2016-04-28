package com.takehome.billing;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cart.CartImpl;

public class BillingImpl implements CartImpl {


	public void cartTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("enteres the store at"+dateFormat.format(date));
		
	}
    public void billing(){
    	
    }
    }


