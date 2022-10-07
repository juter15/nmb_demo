package com.example.nmb_demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soap.*;

@Service
//@RequiredArgsConstructor
@Slf4j
public class SoapClientService {
    //    @Autowired
//    private BassServiceImplService bassServiceImplService;
    private final BassServiceImplService bassServiceImplService = new BassServiceImplService();
    private final BassServiceInterface client = bassServiceImplService.getBassServiceImplPort();

    public VerifyDNResVo verifyDn() {
//        BassServiceImplService bassServiceImplService = new BassServiceImplService();

        VerifyDNReqVo verifyDNReqVo = new VerifyDNReqVo();
        verifyDNReqVo.setCrv(setCommonReqVo());
        verifyDNReqVo.setTryDn("1234");
        return client.verifyDN(verifyDNReqVo);
//        VerifyDNResVo verifyDNResVo = bassServiceInterfaceImpl.verifyDN(verifyDNReqVo);
    }

    public ResultVo checkLine() {
//        BassServiceImplService bassServiceImplService = new BassServiceImplService();

        return client.checkLine(setCommonReqVo());
//        VerifyDNResVo verifyDNResVo = bassServiceInterfaceImpl.verifyDN(verifyDNReqVo);
    }

    public ResultVo monitorDn() {
        MonitorDNReqVo monitorDNReqVo = new MonitorDNReqVo();
        monitorDNReqVo.setCrv(setCommonReqVo());
        monitorDNReqVo.setTrsSvrIp("1");
        monitorDNReqVo.setTrsSvrPort(5000);
        return client.monitorDN(monitorDNReqVo);
    }

    public ResultVo unMonitorDn() {
        return client.unmonitorDN(setCommonReqVo());
    }

    public CommonReqVo setCommonReqVo() {
        CommonReqVo commonReqVo = new CommonReqVo();
        commonReqVo.setReqId("123");
        commonReqVo.setCmi(setCommonMeasInfo());
        commonReqVo.setEventTime("123");
        return commonReqVo;
    }

    public CommonMeasInfo setCommonMeasInfo() {
        CommonMeasInfo commonMeasInfo = new CommonMeasInfo();
        commonMeasInfo.setAgwIp("125.159.22.51");
        commonMeasInfo.setColcode("TICB_XN_M");
        commonMeasInfo.setApsIp("apsIp");
        commonMeasInfo.setEmsIp("emsIp");
        commonMeasInfo.setStartTime("startTime");
        commonMeasInfo.setEndTime("endTime");
        commonMeasInfo.setExId("exId");
        commonMeasInfo.setFlcYn("flcYn");
        commonMeasInfo.setFlln(1111111);
        commonMeasInfo.setLln(1111111);
        commonMeasInfo.setManufacturer("mfc");
        commonMeasInfo.setMgid("mgid");
        commonMeasInfo.setModel("model");
        commonMeasInfo.setPctIp("pctIp");
        commonMeasInfo.setPstnLen("pstnLen");
        commonMeasInfo.setV52Yn("52YTn");
        commonMeasInfo.setPots("pots");
        return commonMeasInfo;
    }
}
