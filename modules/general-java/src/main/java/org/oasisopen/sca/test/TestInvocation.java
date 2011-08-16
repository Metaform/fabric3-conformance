/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import javax.jws.WebService;
import javax.jws.WebMethod;
import org.oasisopen.sca.annotation.Remotable;
import org.oasisopen.sca.test.TestException;


/**
 * Basic interface to invoke testcases
 * @author MikeEdwards
 *
 */
@Remotable
public interface TestInvocation {
	
	/**
	 * Method for invoking testcase
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 * @throws - a TestException is thrown in cases where the test service fails internally
	 */
	@WebMethod
	public String invokeTest( String input ) throws TestException ;

}
