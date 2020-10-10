package coop.bs.services;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=================================================");
        System.out.println("Hello World !!!");
       
        TCPEnginePost();
        
        //TCPEngineGet();
	}
	
	public static String TCPEnginePost() {
		String payLoad ="<ipayMsg client=\"PDSLTEST\" term=\"00800\" seqNum=\"35\" time=\"2020-01-21 10:30:46 +0300\">\r\n" + 
				"	<billPayMsg ver=\"1.7\">\r\n" + 
				"		<payReq>\r\n" + 
				"			<ref>5043160846632020</ref>\r\n" + 
				"			<providerName>KPLC Provider</providerName>\r\n" + 
				"			<custAccNum>1234567-89</custAccNum>\r\n" + 
				"			<payType>cash</payType>\r\n" + 
				"			<payment>\r\n" + 
				"				<accId>1234567-89</accId>\r\n" + 
				"				<amt cur=\"KES\">1000</amt>\r\n" + 
				"			</payment>\r\n" + 
				"			<posRef>posRef</posRef>\r\n" + 
				"			<notify notifyMethod=\"sms\">0821234567</notify>\r\n" + 
				"		</payReq>\r\n" + 
				"	</billPayMsg>\r\n" + 
				"</ipayMsg>";
		
		payLoad = payLoad.replaceAll("\\<\\?xml(.+?)\\?\\>", "").trim();
		
		Socket socket = null;
		
		try {
			socket = new Socket("40.204.194.188", 8902);
        	socket.setSoTimeout(30000);
        	if(socket.isConnected()== true){
        		System.out.println("Connected !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        		System.out.println("Request Data: " + payLoad);
        	}else {
        		System.out.println("Not Connected !!");
        	}
        	
			//WRITE-TCP			   
			byte[] myXMLStringByte = payLoad.getBytes();
			byte[] input = wrap(myXMLStringByte);  		      	    
		    DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());   
		    //WRITE-TO-TCP-SERVER
		    outToServer.write(input);   
		    //READ-FROM-TCP-SERVER
		    TimeUnit.SECONDS.sleep(1);
		    byte[] output = unWrap(socket.getInputStream());
		    String outputByteToString = new String(output);	
		    socket.close();
		    System.out.println("=================================================");
		    System.out.println("Response Data: " + outputByteToString.replaceAll("&#xA;", " "));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	public static String TCPEngineGet() {
		String payLoad = "<ipayMsg client=\"PDSLTEST\" term=\"00800\" seqNum=\"22\" time=\"2020-01-20 13:04:39 +0300\">\r\n" + 
				"<billPayMsg ver=\"1.7\">\r\n" + 
				"<billInfoReq>\r\n" + 
				"<ref>50431604399488206</ref>\r\n" + 
				"<providerName>KPLC Provider</providerName>\r\n" + 
				"<custAccNum>1234567-89</custAccNum>\r\n" + 
				"</billInfoReq>\r\n" + 
				"</billPayMsg>\r\n" + 
				"</ipayMsg>";
		
		Socket socket = null;
		
		try {
			
			socket = new Socket("40.204.194.188", 8902);
        	socket.setSoTimeout(30000);
        	if(socket.isConnected()== true){
        		System.out.println("Connected !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        		System.out.println("Request Data: " + payLoad);
        	}else {
        		System.out.println("Not Connected !!");
        	}
        	
			//WRITE-TCP			   
			byte[] myXMLStringByte = payLoad.getBytes();
			byte[] input = wrap(myXMLStringByte);  		      	    
		    DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());   
		    //WRITE-TO-TCP-SERVER
		    outToServer.write(input);   
		    //READ-FROM-TCP-SERVER
		    TimeUnit.SECONDS.sleep(1);
		    byte[] output = unWrap(socket.getInputStream());
		    String outputByteToString = new String(output);	
		    socket.close();
		    System.out.println("=================================================");
		    System.out.println("Response Data: " + outputByteToString.replaceAll("&#xA;", " "));
			//return outputByteToString.replaceAll("&#xA;", " ");
        
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "OK";
	}
	
    public static String getFormattedDate(String StarValue){
		Date now = new Date();
		try{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
			simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Africa/Nairobi"));
			String date1 = simpleDateFormat.format(now).toString();
			return date1;
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("LOGGER-ERROR: "+ ex.getStackTrace().toString());
			return "";
		}		
	}
	public static byte[] wrap(byte[] msg) throws Exception {
		int len = msg.length;
		if (len > 65535) {
			throw new IllegalArgumentException("Exceeds 65535 bytes.");
		}
		byte firstByte = (byte)(len >>> 8);
		byte secondByte = (byte)len;
		ByteArrayOutputStream baos = new ByteArrayOutputStream(len + 2);
		baos.write(firstByte);
		baos.write(secondByte);
		baos.write(msg);
		return baos.toByteArray();
    }
	public static byte[] unWrap(InputStream inputStream) throws Exception {
		int firstByte = inputStream.read();
		/*
		if (firstByte == 1)
		{
			throw new IOException("End of Stream while trying to read vli byte 1");
		}*/
		int firstByteValue = firstByte << 8;
		int secondByteValue = inputStream.read();
		/*
		if (secondByteValue == 1)
		{
			throw new IOException("End of Stream reading vli byte 2.");
		}*/
		int len = firstByteValue + secondByteValue;
		byte[] message = new byte[len];
		int requestLen;
		int readLen;
		int currentIndex = 0;
		while(true) {
			requestLen = len - currentIndex;
			readLen = inputStream.read(message, currentIndex, requestLen);
		if (readLen == requestLen) {
			break; // Message is complete.
			}
			// Either data was not yet available, or End of Stream.
			currentIndex += readLen;
			int nextByte = inputStream.read();
			if (nextByte == 1)
			{
				throw new IOException("End of Stream at " + currentIndex );
			}
				message[currentIndex++] = (byte)nextByte;
		}
		return message;
	}

}
