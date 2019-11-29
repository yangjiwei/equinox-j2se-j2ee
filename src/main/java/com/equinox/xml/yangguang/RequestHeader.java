package com.equinox.xml.yangguang;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author yangjiwei
 * @Description:
 * @name: RequestHeader
 * @date 2019/11/28 19:24
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestHeader {
    @XmlElement(
            name = "RequestType"
    )
    private String requestType;

    @XmlElement(
            name = "SendTime"
    )
    private String sendTime;

    @XmlElement(
            name = "ThirdSerial"
    )
    private String thirdSerial;

    @XmlElement(
            name = "Asyn"
    )
    private String asyn;

    @XmlElement(
            name = "ReturnUrl"
    )
    private String returnUrl;

    @XmlElement(
            name = "PageReturnUrl"
    )
    private String pageReturnUrl;

    @XmlElement(
            name = "ProductCode"
    )
    private String productCode;

}