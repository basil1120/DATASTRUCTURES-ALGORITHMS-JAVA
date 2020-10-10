package com.basiljereh.hackerank.basic;

import java.util.regex.*;

public class ValidateIPAddress {

	public static void main(String[] args) {
		Boolean isValid = false;
		ValidateIPAddress vip = new ValidateIPAddress();
		isValid = vip.validateIpAddress("127.1110.1111110.1");
		System.out.println(vip.validateIpAddress("127.0.0.1"));
	}
	
	public Boolean validateIpAddress(String ipAddress) {
		
		String[] tokens = ipAddress.split("\\.");
		if(tokens.length != 4) {
			return false;
		}
		
		for(String str : tokens) {
			int i = Integer.parseInt(str);
			if((i < 0 )||( i> 255)) {
				return false;
			}
		}
		return true;
		//final Pattern ipAddr = Pattern.compile("b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?){3}(?:25[0-5]|2[0-4][0-9][0-9]?)b");
		//return ipAddr.matcher(ipAddress).matches();
	}
}
