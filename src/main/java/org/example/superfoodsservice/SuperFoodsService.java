package org.example.superfoodsservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2016-01-09T13:10:32.462-06:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://www.example.org/SuperFoodsService/", name = "SuperFoodsService")
@XmlSeeAlso({ObjectFactory.class})
public interface SuperFoodsService {

    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "getSuperFoodList", targetNamespace = "http://www.example.org/SuperFoodsService/", className = "org.example.superfoodsservice.GetSuperFoodList")
    @WebMethod(action = "http://www.example.org/SuperFoodsService/getSuperFoodList")
    @ResponseWrapper(localName = "getSuperFoodListResponse", targetNamespace = "http://www.example.org/SuperFoodsService/", className = "org.example.superfoodsservice.GetSuperFoodListResponse")
    public java.lang.String getSuperFoodList(
        @WebParam(name = "in", targetNamespace = "")
        java.lang.String in
    );
}
