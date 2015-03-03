
package de.modellar.wsp.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import de.modellar.wsp.model.Address;
import de.modellar.wsp.model.Person;
import de.modellar.wsp.model.SearchQuery;
import de.modellar.wsp.model.SimpleResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080.wsp.pws package. 
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

    private final static QName _SetPersonResponse_QNAME = new QName("http://localhost:8080/wsp/PWS/", "setPersonResponse");
    private final static QName _SetPersonRequest_QNAME = new QName("http://localhost:8080/wsp/PWS/", "setPersonRequest");
    private final static QName _GetPersonResponse_QNAME = new QName("http://localhost:8080/wsp/PWS/", "getPersonResponse");
    private final static QName _GetPersonRequest_QNAME = new QName("http://localhost:8080/wsp/PWS/", "getPersonRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080.wsp.pws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link SearchQuery }
     * 
     */
    public SearchQuery createSearchQuery() {
        return new SearchQuery();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/wsp/PWS/", name = "setPersonResponse")
    public JAXBElement<SimpleResponse> createSetPersonResponse(SimpleResponse value) {
        return new JAXBElement<SimpleResponse>(_SetPersonResponse_QNAME, SimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/wsp/PWS/", name = "setPersonRequest")
    public JAXBElement<Person> createSetPersonRequest(Person value) {
        return new JAXBElement<Person>(_SetPersonRequest_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/wsp/PWS/", name = "getPersonResponse")
    public JAXBElement<Person> createGetPersonResponse(Person value) {
        return new JAXBElement<Person>(_GetPersonResponse_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/wsp/PWS/", name = "getPersonRequest")
    public JAXBElement<SearchQuery> createGetPersonRequest(SearchQuery value) {
        return new JAXBElement<SearchQuery>(_GetPersonRequest_QNAME, SearchQuery.class, null, value);
    }

}
