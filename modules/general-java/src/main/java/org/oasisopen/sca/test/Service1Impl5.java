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
 * 3 properties
 * @author MikeEdwards
 *
 */
@Service(Service1.class)
public class Service1Impl5 implements Service1 {
	
	@Property
	public String serviceName = "service1";
	@Property(required=true)
	public String serviceData1;
	@Property(required=true)
	public String serviceData2;

	public String operation1(String input) {
		return serviceName + " operation1 invoked" + serviceData1 + serviceData2;
	}

}
