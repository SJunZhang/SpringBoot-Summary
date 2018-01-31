
package com.fiberhome.mock;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AgentServiceImplService", targetNamespace = "http://mock.fiberhome.com/", wsdlLocation = "http://localhost:8088/agent/RmsAgent?wsdl")
public class AgentServiceImplService
    extends Service
{

    private final static URL AGENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AGENTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName AGENTSERVICEIMPLSERVICE_QNAME = new QName("http://mock.fiberhome.com/", "AgentServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8088/agent/RmsAgent?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AGENTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        AGENTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public AgentServiceImplService() {
        super(__getWsdlLocation(), AGENTSERVICEIMPLSERVICE_QNAME);
    }

    public AgentServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AGENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public AgentServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, AGENTSERVICEIMPLSERVICE_QNAME);
    }

    public AgentServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AGENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public AgentServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AgentServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AgentService
     */
    @WebEndpoint(name = "AgentServiceImplPort")
    public AgentService getAgentServiceImplPort() {
        return super.getPort(new QName("http://mock.fiberhome.com/", "AgentServiceImplPort"), AgentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AgentService
     */
    @WebEndpoint(name = "AgentServiceImplPort")
    public AgentService getAgentServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mock.fiberhome.com/", "AgentServiceImplPort"), AgentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AGENTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw AGENTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return AGENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}