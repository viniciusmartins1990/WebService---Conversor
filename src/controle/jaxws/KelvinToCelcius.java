
package controle.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "kelvinToCelcius", namespace = "http://controle/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kelvinToCelcius", namespace = "http://controle/")
public class KelvinToCelcius {

    @XmlElement(name = "grau", namespace = "")
    private String grau;

    /**
     * 
     * @return
     *     returns String
     */
    public String getGrau() {
        return this.grau;
    }

    /**
     * 
     * @param grau
     *     the value for the grau property
     */
    public void setGrau(String grau) {
        this.grau = grau;
    }

}
