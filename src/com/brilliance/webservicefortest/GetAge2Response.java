
package com.brilliance.webservicefortest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getAge2Response complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getAge2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAge2Response", propOrder = {
    "_return"
})
public class GetAge2Response {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     * 
     */
    public int getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     * 
     */
    public void setReturn(int value) {
        this._return = value;
    }

}
