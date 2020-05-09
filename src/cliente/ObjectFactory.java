
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
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

    private final static QName _CelciusToKelvinResponse_QNAME = new QName("http://controle/", "celciusToKelvinResponse");
    private final static QName _KelvinToCelciusResponse_QNAME = new QName("http://controle/", "kelvinToCelciusResponse");
    private final static QName _KelvinToCelcius_QNAME = new QName("http://controle/", "kelvinToCelcius");
    private final static QName _CelciusToKelvin_QNAME = new QName("http://controle/", "celciusToKelvin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KelvinToCelciusResponse }
     * 
     */
    public KelvinToCelciusResponse createKelvinToCelciusResponse() {
        return new KelvinToCelciusResponse();
    }

    /**
     * Create an instance of {@link CelciusToKelvin }
     * 
     */
    public CelciusToKelvin createCelciusToKelvin() {
        return new CelciusToKelvin();
    }

    /**
     * Create an instance of {@link KelvinToCelcius }
     * 
     */
    public KelvinToCelcius createKelvinToCelcius() {
        return new KelvinToCelcius();
    }

    /**
     * Create an instance of {@link CelciusToKelvinResponse }
     * 
     */
    public CelciusToKelvinResponse createCelciusToKelvinResponse() {
        return new CelciusToKelvinResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelciusToKelvinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "celciusToKelvinResponse")
    public JAXBElement<CelciusToKelvinResponse> createCelciusToKelvinResponse(CelciusToKelvinResponse value) {
        return new JAXBElement<CelciusToKelvinResponse>(_CelciusToKelvinResponse_QNAME, CelciusToKelvinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelciusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "kelvinToCelciusResponse")
    public JAXBElement<KelvinToCelciusResponse> createKelvinToCelciusResponse(KelvinToCelciusResponse value) {
        return new JAXBElement<KelvinToCelciusResponse>(_KelvinToCelciusResponse_QNAME, KelvinToCelciusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KelvinToCelcius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "kelvinToCelcius")
    public JAXBElement<KelvinToCelcius> createKelvinToCelcius(KelvinToCelcius value) {
        return new JAXBElement<KelvinToCelcius>(_KelvinToCelcius_QNAME, KelvinToCelcius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelciusToKelvin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controle/", name = "celciusToKelvin")
    public JAXBElement<CelciusToKelvin> createCelciusToKelvin(CelciusToKelvin value) {
        return new JAXBElement<CelciusToKelvin>(_CelciusToKelvin_QNAME, CelciusToKelvin.class, null, value);
    }

}
