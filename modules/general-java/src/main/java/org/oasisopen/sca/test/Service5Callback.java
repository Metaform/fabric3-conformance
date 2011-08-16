/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Remotable;

/**
 * A remotable service interface used for a Callback
 * from Service5
 * @author MikeEdwards
 *
 */
@Remotable
public interface Service5Callback {
	
	/**
	 * Method 1 for invoking callback service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public String callback1( String input );
	
} // end interface
