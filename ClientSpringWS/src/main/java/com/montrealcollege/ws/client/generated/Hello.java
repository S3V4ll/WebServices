
package com.montrealcollege.ws.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://www.example.org/hello")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param helloRequest
     * @return
     *     returns com.montrealcollege.ws.client.generated.HelloResponse
     */
    @WebMethod(operationName = "Hello")
    @WebResult(name = "HelloResponse", targetNamespace = "http://www.example.org/hello", partName = "HelloResponse")
    public HelloResponse hello(
        @WebParam(name = "HelloRequest", targetNamespace = "http://www.example.org/hello", partName = "HelloRequest")
        HelloRequest helloRequest);

}
