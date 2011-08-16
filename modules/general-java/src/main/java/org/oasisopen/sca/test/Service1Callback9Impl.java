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
 * 1 service with interface Service1,
 * 1 reference (1..1) with interface Service5 which has a Callback
 * interface which is implemented by this class
 * reference gets called when service1 operation1 is invoked
 * @author MikeEdwards
 *
 */
@Service(Service1.class)
public class Service1Callback9Impl implements Service1, Service9Callback {
	
	@Property
	public String serviceName = "service1";
	// Reference with an implied multiplicity of (1..1) since required=true is the default
	@Reference
	public Service9 reference1 = null;

	public String operation1(String input) {
		String result = reference1.operation1(input);
		return serviceName + " operation1 invoked" + " " + result;
	}
	
	public String callback1( String input ) {
		String output = serviceName + " callback1 invoked";
		return output;
	} // end 

}
