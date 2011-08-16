/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import java.util.ArrayList;
import java.util.List;

import org.oasisopen.sca.annotation.*;
import org.oasisopen.sca.test.Service1;
import org.oasisopen.sca.test.Service4;


/**
 * Java component implementation with
 * 1 service with interface Service1,
 * 1 reference (1..1) with interface Service4
 * - reference gets called when service1 operation1 is invoked
 * - implementation test whether the mutable parameter of Service4 operation1 gets modified by the target service
 *
 */
@Service(Service1.class)
public class Service1Impl7 implements Service1 {
	
	@Property
	public String serviceName = "service1";
	// Reference with an implied multiplicity of (1..1) since required=true is the default
	@Reference
	public Service4 reference1 = null;

	public String operation1(String input) {
		// StringBuffer parameter = new StringBuffer( input );
		List<String> parameter = new ArrayList<String>( 2 );
		parameter.add( input );
		parameter.add( "Second" );
		String result = reference1.operation1(parameter);
		// Check whether the input parameter to reference1 operation1 was modified during
		// operation execution...
		if( !input.equals(parameter.get( 0 )) ) {
			return serviceName + "input parameter modified!!";
		}
		return serviceName + " operation1 invoked" + " " + result;
	}

}
