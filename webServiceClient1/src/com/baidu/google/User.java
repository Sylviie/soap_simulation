
package com.baidu.google;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="momo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="papa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "id",
    "momo",
    "name",
    "papa",
    "weibo"
})
public class User {

    protected int id;
    protected String momo;
    protected String name;
    protected String papa;
    protected String weibo;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the momo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMomo() {
        return momo;
    }

    /**
     * Sets the value of the momo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMomo(String value) {
        this.momo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the papa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPapa() {
        return papa;
    }

    /**
     * Sets the value of the papa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPapa(String value) {
        this.papa = value;
    }

    /**
     * Gets the value of the weibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * Sets the value of the weibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeibo(String value) {
        this.weibo = value;
    }

}
