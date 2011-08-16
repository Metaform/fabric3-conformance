/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import javax.jws.WebService;

import org.oasisopen.sca.annotation.*;
import org.oasisopen.sca.test.Service4;


/**
 * Java component implementation
 * 1 service with interface Service4, where the implementation method modifies the input parameter
 * 0 references
 *
 * @author MikeEdwards
 *
 */
@Service(Service4.class)
@WebService
public class Service4Impl implements Service4 {
	
	@Property
	public String serviceName = "service1";

	public String operation1(java.util.List<String> input) {
		input.set( 0, input.get(0) + "+1");
		//input.append("+1");
		return serviceName + " operation1 invoked " + input.toString();
	}

}
