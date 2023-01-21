
package proxy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ReleveWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReleveWS {


    /**
     * 
     * @return
     *     returns proxy.Releve
     * @throws JAXBException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReleve", targetNamespace = "http://ws/", className = "proxy.GetReleve")
    @ResponseWrapper(localName = "getReleveResponse", targetNamespace = "http://ws/", className = "proxy.GetReleveResponse")
    @Action(input = "http://ws/ReleveWS/getReleveRequest", output = "http://ws/ReleveWS/getReleveResponse", fault = {
        @FaultAction(className = JAXBException_Exception.class, value = "http://ws/ReleveWS/getReleve/Fault/JAXBException")
    })
    public Releve getReleve()
        throws JAXBException_Exception
    ;

}