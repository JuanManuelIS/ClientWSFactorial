
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSFactorial", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSFactorial {


    /**
     * 
     * @param number
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "factorial", targetNamespace = "http://Service/", className = "service.Factorial")
    @ResponseWrapper(localName = "factorialResponse", targetNamespace = "http://Service/", className = "service.FactorialResponse")
    @Action(input = "http://Service/WSFactorial/factorialRequest", output = "http://Service/WSFactorial/factorialResponse")
    public int factorial(
        @WebParam(name = "number", targetNamespace = "")
        int number);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Service/", className = "service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Service/", className = "service.HelloResponse")
    @Action(input = "http://Service/WSFactorial/helloRequest", output = "http://Service/WSFactorial/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
