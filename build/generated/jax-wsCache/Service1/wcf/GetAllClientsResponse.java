
package wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAllClientsResult" type="{http://schemas.datacontract.org/2004/07/Lib}ArrayOfClient" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllClientsResult"
})
@XmlRootElement(name = "GetAllClientsResponse", namespace = "http://tempuri.org/")
public class GetAllClientsResponse {

    @XmlElementRef(name = "GetAllClientsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClient> getAllClientsResult;

    /**
     * Obtém o valor da propriedade getAllClientsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClient }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClient> getGetAllClientsResult() {
        return getAllClientsResult;
    }

    /**
     * Define o valor da propriedade getAllClientsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClient }{@code >}
     *     
     */
    public void setGetAllClientsResult(JAXBElement<ArrayOfClient> value) {
        this.getAllClientsResult = value;
    }

}
