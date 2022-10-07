package com.example.nmb_demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class SoapClientController {
    private final SoapClientService soapClientService;

    @GetMapping("/verifyDn")
    public ResponseEntity verifyDn() {
        return ResponseEntity.ok(soapClientService.verifyDn());
    }
    @GetMapping("/checkLine")
    public ResponseEntity checkLine(){
        return ResponseEntity.ok(soapClientService.checkLine());
    }
    @GetMapping("/monitorDn")
    public ResponseEntity monitorDn(){
        return ResponseEntity.ok(soapClientService.monitorDn());
    }
    @GetMapping("/unMonitorDn")
    public ResponseEntity unMonitorDn(){
        return ResponseEntity.ok(soapClientService.unMonitorDn());
    }
}
