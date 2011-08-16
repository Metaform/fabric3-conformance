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
 * 1 reference (0..1) with interface Service1
 * configured wire gets called when service1 operation1 is invoked, if present
 * @author MikeEdwards
 *
 */
@Service(Service1.class)
public class Service1Impl6 implements Service1 {
	
	@Property
	public String serviceName = "service1";
	// Required = false -> multiplicity 0..1
	@Reference(required=false)
	public Service1 reference1 = null;

	public String operation1(String input) {
		String result = serviceName + " operation1 invoked";
		// Call the reference if present
		if( reference1 != null ) result = result.concat(" " + reference1.operation1( input ));
		return result;
	}

}
