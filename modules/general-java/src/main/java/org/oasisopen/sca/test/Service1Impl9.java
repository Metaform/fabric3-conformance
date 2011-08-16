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
 * 0 references
 * 1 property of type float name="serviceData1"
 */
@Service(Service1.class)
public class Service1Impl9 implements Service1 {
	
	@Property
	public String serviceName = "service1";
	@Property
	public float serviceData1;

	public String operation1(String input) {
		return serviceName + " operation1 invoked" + serviceData1;
	}

}
