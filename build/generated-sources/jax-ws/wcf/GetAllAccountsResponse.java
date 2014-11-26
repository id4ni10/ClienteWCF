
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
 *         &lt;element name="GetAllAccountsResult" type="{http://schemas.datacontract.org/2004/07/Lib}ArrayOfAccount" minOccurs="0"/>
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
    "getAllAccountsResult"
})
@XmlRootElement(name = "GetAllAccountsResponse", namespace = "http://tempuri.org/")
public class GetAllAccountsResponse {

    @XmlElementRef(name = "GetAllAccountsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAccount> getAllAccountsResult;

    /**
     * Obtém o valor da propriedade getAllAccountsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAccount> getGetAllAccountsResult() {
        return getAllAccountsResult;
    }

    /**
     * Define o valor da propriedade getAllAccountsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAccount }{@code >}
     *     
     */
    public void setGetAllAccountsResult(JAXBElement<ArrayOfAccount> value) {
        this.getAllAccountsResult = value;
    }

}
