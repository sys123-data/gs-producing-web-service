package com.example.producingwebservice;


import jakarta.el.MethodNotFoundException;
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import javax.xml.namespace.QName;

public class CustomSoapFaultMappingExceptionResolver extends SoapFaultMappingExceptionResolver {

    @Override
    protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
        if (ex instanceof MethodNotFoundException) {
            SoapFaultDetail detail = fault.addFaultDetail();
            detail.addFaultDetailElement(new QName("http://spring.io/guides/gs-producing-web-service", "FaultCode"))
                    .addText("SOAP-ENV:Client");
            detail.addFaultDetailElement(new QName("http://spring.io/guides/gs-producing-web-service", "FaultString"))
                    .addText("Failed to locate method (ValidateCreditCard) in class (examplesCreditCard)");
        }
    }
}