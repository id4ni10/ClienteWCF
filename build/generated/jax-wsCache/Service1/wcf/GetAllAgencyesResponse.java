
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
 *         &lt;element name="GetAllAgencyesResult" type="{http://schemas.datacontract.org/2004/07/Lib}ArrayOfAgency" minOccurs="0"/>
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
    "getAllAgencyesResult"
})
@XmlRootElement(name = "GetAllAgencyesResponse", namespace = "http://tempuri.org/")
public class GetAllAgencyesResponse {

    @XmlElementRef(name = "GetAllAgencyesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAgency> getAllAgencyesResult;

    /**
     * Obtém o valor da propriedade getAllAgencyesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgency }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAgency> getGetAllAgencyesResult() {
        return getAllAgencyesResult;
    }

    /**
     * Define o valor da propriedade getAllAgencyesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAgency }{@code >}
     *     
     */
    public void setGetAllAgencyesResult(JAXBElement<ArrayOfAgency> value) {
        this.getAllAgencyesResult = value;
    }

}
