/**
 *
 */
package com.sagioto.sandbox;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * @author Sagi Bernstein
 *
 */
public class Main {
	static Logger log = Logger.getLogger(Main.class.getName());
	
    /**
     * @param args the arguments to the app
     */
    public static void main(String[] args) {
    	PropertyConfigurator.configure("src/main/resources/log4j.configuration");
    	int ssn = 3;//readEntry("Enter a SSN: ");
    	try {
    		#sql{select FNAME< LNAME, ADDRESS, SALARY
    		into :fname, :lname, :address, :salary
    		from EMPLOYEE where SSN = :ssn};
    	}
    	catch (SQLException se) {
    		System.out.println("SSN does not exist: ",+ssn);
    		return;
    	}
    	System.out.println(fname + " " + lname );

    }


}
