/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Service;
import org.oasisopen.sca.annotation.Reference;
import org.oasisopen.sca.annotation.Property;
import org.oasisopen.sca.test.Service1;
import org.oasisopen.sca.test.TestException;
import org.oasisopen.sca.test.TestInvocation;


import java.util.List;

/**
 * Basic test initiation class
 * @author MikeEdwards
 *
 */
@Service(TestInvocation.class)
public class ASM_0003_Client implements org.oasisopen.sca.test.TestInvocation {
	
	@Property
	public String testName = "ASM_xxxx";
	
	@Reference
	public List<Service1> reference1;
	
	/**
	 * This method is offered as a service and is 
	 * invoked by the test client to run the test
	 */
	public String invokeTest( String input ) throws TestException {
		String response = null;
		
		response = runTest( input );
		
		return response;
	} // end method invokeTest
	
	/**
	 * This method actually runs the test - and is subclassed by classes that run other tests.
	 * @param input - an input string
	 * @return - a response string = "ASM_0001 inputString invoked ok";
	 * 
	 */
	public String runTest( String input ){
		String response = "";
		
		for( Service1 reference : reference1 ) {
			response += reference.operation1(input);
		}  // end for
		
		response = testName + " " + input + " " + response;
		
		return response;
	} // end method runTest
	
	/**
	 * Sets the name of the test
	 * @param name - the test name
	 */
	protected void setTestName( String name ) {
		testName = name;
	}

} // 
