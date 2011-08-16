/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.*;
import org.oasisopen.sca.test.Service1Superset;


/**
 * Simple Java component implementation for business interface Service1Superset
 * @author MikeEdwards
 *
 */
@Service(Service1Superset.class)
public class Service1SupersetImpl implements Service1Superset {
	
	@Property
	public String serviceName = "service1";

	public String operation1(String input) {
		return serviceName + " operation1 invoked";
	}

	public String operation2(String input) {
		return serviceName + " operation2 invoked";
	}

}
