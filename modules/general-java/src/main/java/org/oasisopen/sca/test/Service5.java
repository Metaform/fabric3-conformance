/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Callback;
import org.oasisopen.sca.annotation.Remotable;

/**
 * A remotable service interface containing 1 operation
 * with a callback interface the same name
 * @author MikeEdwards
 *
 */
@Callback(Service5Callback.class)
@Remotable
public interface Service5 {
	
	/**
	 * Method 1 for invoking testcase service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public String operation1( String input );
	
} // end interface
