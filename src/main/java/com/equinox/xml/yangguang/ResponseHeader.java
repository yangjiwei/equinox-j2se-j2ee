package com.equinox.xml.yangguang;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author yangjiwei
 * @Description:
 * @name: ResponseHeader
 * @date 2019/11/28 19:20
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ResponseHeader {
    @XmlElement(name = "ResponseCode")
    private String responseCode;
    @XmlElement(name = "ErrorMessage")
    private String errorMessage;
}