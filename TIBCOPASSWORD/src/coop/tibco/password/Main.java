package coop.tibco.password;

import com.tibco.security.AXSecurityException;
import com.tibco.security.ObfuscationEngine;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String encryptedString = "#!fsKv86lEC4Bq7XPR78derQ/P2o1HG6ixGg/a8CxzNPw=";
        String Decryptedpassword = null;
        try {
            Decryptedpassword = new String(ObfuscationEngine.decrypt(encryptedString));
           
        } catch (AXSecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

           System.out.println("Password:" + Decryptedpassword);
        }
	}
