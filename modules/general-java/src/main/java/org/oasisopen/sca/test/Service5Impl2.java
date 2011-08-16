/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.*;


/**
 * Java component implementation
 * 1 service with interface Service5, which has a callback
 * 0 references
 *
 * @author MikeEdwards
 *
 */
@Service(Service5.class)
public class Service5Impl2 implements Service5 {
	static private final int repeatCount = 3; 
	
	@Property
	public String serviceName = "service1";
	@Callback
	public Service5Callback callback;

	/**
	 * Service operation which also invokes an operation on the callback
	 */
	public String operation1(String input) {
		String callbackResult = "";
		// Invoke the operation on the callback multiple times in sequence
		for( int i=0; i < repeatCount; i++ ) {
			callbackResult = callbackResult + " " + callback.callback1("callback");
		} // end for
		return serviceName + " operation1 invoked" + callbackResult;
	}

} // end class
