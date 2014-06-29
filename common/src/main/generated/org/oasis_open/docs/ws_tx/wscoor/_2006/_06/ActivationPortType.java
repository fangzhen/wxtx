
package org.oasis_open.docs.ws_tx.wscoor._2006._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ActivationPortType", targetNamespace = "http://docs.oasis-open.org/ws-tx/wscoor/2006/06")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.oasis_open.docs.ws_tx.wscoor._2006._06.ObjectFactory.class,
    org.apache.cxf.ws.addressing.ObjectFactory.class
})
public interface ActivationPortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns org.oasis_open.docs.ws_tx.wscoor._2006._06.CreateCoordinationContextResponseType
     */
    @WebMethod(operationName = "CreateCoordinationContextOperation", action = "http://docs.oasis-open.org/ws-tx/wscoor/2006/06/CreateCoordinationContext")
    @WebResult(name = "CreateCoordinationContextResponse", targetNamespace = "http://docs.oasis-open.org/ws-tx/wscoor/2006/06", partName = "parameters")
    public CreateCoordinationContextResponseType createCoordinationContextOperation(
        @WebParam(name = "CreateCoordinationContext", targetNamespace = "http://docs.oasis-open.org/ws-tx/wscoor/2006/06", partName = "parameters")
        CreateCoordinationContextType parameters);

}
