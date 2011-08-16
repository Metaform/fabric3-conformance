/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Confidentiality;
import org.oasisopen.sca.annotation.Remotable;

/**
 * A service interface which is Service1 interface with an added "Confidentiality" intent
 * @author MikeEdwards
 *
 */
@Confidentiality
@Remotable
public interface Service1_Intent {
	
	/**
	 * Method for invoking testcase service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public String operation1( String input );

}
