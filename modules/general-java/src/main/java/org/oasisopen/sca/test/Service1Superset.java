/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

/**
 * A superset of the basic test service interface
 * @author MikeEdwards
 *
 */
import org.oasisopen.sca.annotation.Remotable;

@Remotable
public interface Service1Superset {
	
	/**
	 * Method for invoking testcase service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public String operation1( String input );
	
	/**
	 * A second method for invoking a testcase service
	 * @param input - input parameter(s) as a String
	 * @return - output data as a String
	 */
	public String operation2( String input );

}
