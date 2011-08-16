/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *     
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.*;
import org.oasisopen.sca.test.Service1;


/**
 * Java component implementation with
 * 1 service with interface Service1
 * 1 reference (1..n) with interface Service1
 * all configured wires get called when service1 operation1 is invoked
 * @author MikeEdwards
 *
 */
@Service(Service1.class)
public class Service1Impl3 implements Service1 {
	
	@Property
	public String serviceName = "service1";
	// Required = true + an array -> multiplicity 1..n
	@Reference(required=true)
	public Service1[] reference1 = null;

	public String operation1(String input) {
		String result = "";
		
		// Deal with the case where the reference has no targets supplied...
		// Should this throw an exception?
		if( reference1.length == 0 ) {
			// throw new InvalidSCAConfigurationException("1..n multiplicity reference has no targets");
			return serviceName + " 1..n multiplicity reference has no targets";
		} // end if
		
		// Call each of the references in the array, concatenating the results
		for( int i=0 ; i < reference1.length; i++ ) {
			result = result.concat( reference1[i].operation1(input) );
		} // end for
		return serviceName + " operation1 invoked" + " " + result;
	}

}
