
package com.raja.studentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.raja.studentservice package. 
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

    private final static QName _GetStudentById_QNAME = new QName("http://studentservice.raja.com/", "getStudentById");
    private final static QName _GetStudentNameByIdResponse_QNAME = new QName("http://studentservice.raja.com/", "getStudentNameByIdResponse");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://studentservice.raja.com/", "getStudentByIdResponse");
    private final static QName _GetStudentNameById_QNAME = new QName("http://studentservice.raja.com/", "getStudentNameById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.raja.studentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentNameById }
     * 
     */
    public GetStudentNameById createGetStudentNameById() {
        return new GetStudentNameById();
    }

    /**
     * Create an instance of {@link GetStudentNameByIdResponse }
     * 
     */
    public GetStudentNameByIdResponse createGetStudentNameByIdResponse() {
        return new GetStudentNameByIdResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentservice.raja.com/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentNameByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentservice.raja.com/", name = "getStudentNameByIdResponse")
    public JAXBElement<GetStudentNameByIdResponse> createGetStudentNameByIdResponse(GetStudentNameByIdResponse value) {
        return new JAXBElement<GetStudentNameByIdResponse>(_GetStudentNameByIdResponse_QNAME, GetStudentNameByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentservice.raja.com/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentNameById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://studentservice.raja.com/", name = "getStudentNameById")
    public JAXBElement<GetStudentNameById> createGetStudentNameById(GetStudentNameById value) {
        return new JAXBElement<GetStudentNameById>(_GetStudentNameById_QNAME, GetStudentNameById.class, null, value);
    }

}
