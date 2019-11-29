package com.equinox.xml.yangguang.chengbao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ChengBaoHeader {
    @XmlElement(name = "RequestType")
    private String requestType;
    @XmlElement(name = "SendTime")
    private String sendTime;
    @XmlElement(name = "ThirdSerial")
    private String thirdSerial;
    @XmlElement(name = "Asyn")
    private Boolean asyn;
    @XmlElement(name = "ReturnUrl")
    private String returnUrl;
    @XmlElement(name = "PageReturnUrl")
    private String pageReturnUrl;
    @XmlElement(name = "ProductCode")
    private String productCode;
}
