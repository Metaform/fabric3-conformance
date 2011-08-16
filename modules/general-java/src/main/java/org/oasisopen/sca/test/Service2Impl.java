/*
 *
 * Copyright(C) OASIS(R) 2009, 2010. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 *   
 */
package org.oasisopen.sca.test;

import org.oasisopen.sca.annotation.*;
import org.oasisopen.sca.test.Service2;


/**
 * Simple Java component implementation for business interface Service2
 * @author MikeEdwards
 *
 */
@Service(Service2.class)
public class Service2Impl implements Service2 {
	
	@Property
	public String serviceName = "service1";

	public int operation2(int input) {
		return input+1;
	}

}
