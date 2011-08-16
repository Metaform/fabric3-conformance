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
 * which is incompatible with the Service5 callback
 * @author MikeEdwards
 *
 */
@Remotable
public interface Service8Callback {
	
	/**
	 * Method for invoking callback service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public String callback2( String input );
	
} // end interface
