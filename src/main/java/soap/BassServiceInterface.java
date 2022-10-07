
package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BassServiceInterface", targetNamespace = "http://agwems.kt.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BassServiceInterface {


    /**
     * 
     * @param parameters
     * @return
     *     returns soap.ResultVo
     */
    @WebMethod(action = "http://agwems.kt.com/BassServiceInterface/unmonitorDNRequest")
    @WebResult(partName = "return")
    @Action(input = "http://agwems.kt.com/BassServiceInterface/unmonitorDNRequest", output = "http://agwems.kt.com/BassServiceInterface/unmonitorDNResponse")
    public ResultVo unmonitorDN(
        @WebParam(name = "parameters", partName = "parameters")
        CommonReqVo parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns soap.VerifyDNResVo
     */
    @WebMethod(action = "http://agwems.kt.com/BassServiceInterface/verifyDNRequest")
    @WebResult(partName = "return")
    @Action(input = "http://agwems.kt.com/BassServiceInterface/verifyDNRequest", output = "http://agwems.kt.com/BassServiceInterface/verifyDNResponse")
    public VerifyDNResVo verifyDN(
        @WebParam(name = "parameters", partName = "parameters")
        VerifyDNReqVo parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns soap.ResultVo
     */
    @WebMethod(action = "http://agwems.kt.com/BassServiceInterface/checkLineRequest")
    @WebResult(partName = "return")
    @Action(input = "http://agwems.kt.com/BassServiceInterface/checkLineRequest", output = "http://agwems.kt.com/BassServiceInterface/checkLineResponse")
    public ResultVo checkLine(
        @WebParam(name = "parameters", partName = "parameters")
        CommonReqVo parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns soap.ResultVo
     */
    @WebMethod(action = "http://agwems.kt.com/BassServiceInterface/monitorDNRequest")
    @WebResult(partName = "return")
    @Action(input = "http://agwems.kt.com/BassServiceInterface/monitorDNRequest", output = "http://agwems.kt.com/BassServiceInterface/monitorDNResponse")
    public ResultVo monitorDN(
        @WebParam(name = "parameters", partName = "parameters")
        MonitorDNReqVo parameters);

}