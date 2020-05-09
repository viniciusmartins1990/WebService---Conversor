
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de celciusToKelvin complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="celciusToKelvin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celciusToKelvin", propOrder = {
    "grau"
})
public class CelciusToKelvin {

    protected String grau;

    /**
     * Obtém o valor da propriedade grau.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrau() {
        return grau;
    }

    /**
     * Define o valor da propriedade grau.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrau(String value) {
        this.grau = value;
    }

}
