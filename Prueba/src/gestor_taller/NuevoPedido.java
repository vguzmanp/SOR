
package gestor_taller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nuevoPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nuevoPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTaller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nuevoPedido", propOrder = {
    "pedido",
    "idTaller",
    "password"
})
public class NuevoPedido {

    protected String pedido;
    protected String idTaller;
    protected String password;

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedido(String value) {
        this.pedido = value;
    }

    /**
     * Obtiene el valor de la propiedad idTaller.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTaller() {
        return idTaller;
    }

    /**
     * Define el valor de la propiedad idTaller.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTaller(String value) {
        this.idTaller = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
