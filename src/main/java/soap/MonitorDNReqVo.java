
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>monitorDNReqVo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="monitorDNReqVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crv" type="{http://agwems.kt.com/}commonReqVo" minOccurs="0"/&gt;
 *         &lt;element name="trsSvrIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trsSvrPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitorDNReqVo", propOrder = {
    "crv",
    "trsSvrIp",
    "trsSvrPort"
})
public class MonitorDNReqVo {

    protected CommonReqVo crv;
    protected String trsSvrIp;
    protected int trsSvrPort;

    /**
     * crv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommonReqVo }
     *     
     */
    public CommonReqVo getCrv() {
        return crv;
    }

    /**
     * crv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReqVo }
     *     
     */
    public void setCrv(CommonReqVo value) {
        this.crv = value;
    }

    /**
     * trsSvrIp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrsSvrIp() {
        return trsSvrIp;
    }

    /**
     * trsSvrIp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrsSvrIp(String value) {
        this.trsSvrIp = value;
    }

    /**
     * trsSvrPort 속성의 값을 가져옵니다.
     * 
     */
    public int getTrsSvrPort() {
        return trsSvrPort;
    }

    /**
     * trsSvrPort 속성의 값을 설정합니다.
     * 
     */
    public void setTrsSvrPort(int value) {
        this.trsSvrPort = value;
    }

}
