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
 * 1 reference (0..n) with interface Service1
 * all configured wires get called when service1 operation1 is invoked
 * @author MikeEdwards
 *
 */
@Service(Service1.class)
public class Service1Impl4 implements Service1 {
	
	@Property
	public String serviceName = "service1";
	// Required = false + an array -> multiplicity 0..n
	@Reference(required=false)
	public Service1[] reference1 = null;

	public String operation1(String input) {
		String result = serviceName + " operation1 invoked";
		// Call each of the references in the array, concatenating the results
		for( int i=0 ; i < reference1.length; i++ ) {
			result = result.concat(" ");
			result = result.concat( reference1[i].operation1(input) );
		} // end for
		return result;
	}

}
