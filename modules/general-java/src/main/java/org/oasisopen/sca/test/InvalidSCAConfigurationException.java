/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *     
 */
package org.oasisopen.sca.test;

/**
 * An exception thrown by the Java SCA test classes when they discover that the 
 * SCA configuration does not match their expectations (eg reference multiplicity
 * is incorrect)
 */
public class InvalidSCAConfigurationException extends Exception {

	/**
	 * UID for exception
	 */
	private static final long serialVersionUID = -6080533311170743579L;

	public InvalidSCAConfigurationException() { super(); };
	
	public InvalidSCAConfigurationException( String msg ) { super( msg ); };

} // end class InvalidSCAConfigurationException

