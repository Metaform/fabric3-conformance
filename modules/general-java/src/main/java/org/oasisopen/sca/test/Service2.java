/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Remotable;

/**
 * A test service interface, designed to be incompatible with the Service1 interface
 * @author MikeEdwards
 *
 */
@Remotable
public interface Service2 {
	
	/**
	 * Method for invoking testcase service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public int operation2( int input );

}
