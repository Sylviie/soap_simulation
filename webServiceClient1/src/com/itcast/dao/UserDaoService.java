
package com.itcast.dao;

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
@WebServiceClient(name = "UserDaoService", targetNamespace = "http://dao.itcast.com/", wsdlLocation = "http://localhost:8989/userDao?wsdl")
public class UserDaoService
    extends Service
{

    private final static URL USERDAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERDAOSERVICE_EXCEPTION;
    private final static QName USERDAOSERVICE_QNAME = new QName("http://dao.itcast.com/", "UserDaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8989/userDao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERDAOSERVICE_WSDL_LOCATION = url;
        USERDAOSERVICE_EXCEPTION = e;
    }

    public UserDaoService() {
        super(__getWsdlLocation(), USERDAOSERVICE_QNAME);
    }

    public UserDaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERDAOSERVICE_QNAME, features);
    }

    public UserDaoService(URL wsdlLocation) {
        super(wsdlLocation, USERDAOSERVICE_QNAME);
    }

    public UserDaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERDAOSERVICE_QNAME, features);
    }

    public UserDaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserDaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserDao
     */
    @WebEndpoint(name = "UserDaoPort")
    public UserDao getUserDaoPort() {
        return super.getPort(new QName("http://dao.itcast.com/", "UserDaoPort"), UserDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserDao
     */
    @WebEndpoint(name = "UserDaoPort")
    public UserDao getUserDaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dao.itcast.com/", "UserDaoPort"), UserDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERDAOSERVICE_EXCEPTION!= null) {
            throw USERDAOSERVICE_EXCEPTION;
        }
        return USERDAOSERVICE_WSDL_LOCATION;
    }

}
