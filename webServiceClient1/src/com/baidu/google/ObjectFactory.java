
package com.baidu.google;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baidu.google package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://dao.itcast.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://dao.itcast.com/", "addResponse");
    private final static QName _FindUserByidResponse_QNAME = new QName("http://dao.itcast.com/", "findUserByidResponse");
    private final static QName _FindUserByid_QNAME = new QName("http://dao.itcast.com/", "findUserByid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baidu.google
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link FindUserByidResponse }
     * 
     */
    public FindUserByidResponse createFindUserByidResponse() {
        return new FindUserByidResponse();
    }

    /**
     * Create an instance of {@link FindUserByid }
     * 
     */
    public FindUserByid createFindUserByid() {
        return new FindUserByid();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.itcast.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.itcast.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.itcast.com/", name = "findUserByidResponse")
    public JAXBElement<FindUserByidResponse> createFindUserByidResponse(FindUserByidResponse value) {
        return new JAXBElement<FindUserByidResponse>(_FindUserByidResponse_QNAME, FindUserByidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.itcast.com/", name = "findUserByid")
    public JAXBElement<FindUserByid> createFindUserByid(FindUserByid value) {
        return new JAXBElement<FindUserByid>(_FindUserByid_QNAME, FindUserByid.class, null, value);
    }

}
