
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>verifyDNResVo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="verifyDNResVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="afi" type="{http://agwems.kt.com/}agwFacilityInfo" minOccurs="0"/&gt;
 *         &lt;element name="resultVo" type="{http://agwems.kt.com/}resultVo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyDNResVo", propOrder = {
    "afi",
    "resultVo"
})
public class VerifyDNResVo {

    protected AgwFacilityInfo afi;
    protected ResultVo resultVo;

    /**
     * afi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AgwFacilityInfo }
     *     
     */
    public AgwFacilityInfo getAfi() {
        return afi;
    }

    /**
     * afi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AgwFacilityInfo }
     *     
     */
    public void setAfi(AgwFacilityInfo value) {
        this.afi = value;
    }

    /**
     * resultVo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ResultVo }
     *     
     */
    public ResultVo getResultVo() {
        return resultVo;
    }

    /**
     * resultVo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultVo }
     *     
     */
    public void setResultVo(ResultVo value) {
        this.resultVo = value;
    }

}
