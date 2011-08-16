/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.Remotable;

/**
 * A remotable service interface containing 1 operation with a (Java) mutable parameter
 * @author MikeEdwards
 *
 */
@Remotable
public interface Service4 {
	
	/**
	 * Method 1 for invoking testcase service
	 * @param input - input parameter as a list of Strings
	 * @return - output data as a String
	 */
	public String operation1( java.util.List<String> input );
	
}
