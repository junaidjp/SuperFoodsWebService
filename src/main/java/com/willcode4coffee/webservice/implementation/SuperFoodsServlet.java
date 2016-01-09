package com.willcode4coffee.webservice.implementation;

import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

/**
 * 
 * @author junaidpasha
 *
 */
public class SuperFoodsServlet extends CXFNonSpringServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void loadBus(ServletConfig servletConfig) {
	super.loadBus(servletConfig);
	BusFactory.setDefaultBus(getBus());
	Object implementor = new SuperFoodsServiceSOAPImpl();
	Endpoint.publish("/p1", implementor);
	
	
	}
	
	

}
