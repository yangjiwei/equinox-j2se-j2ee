package com.equinox.xml.yangguang;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author yangjiwei
 * @Description:
 * @name: RequestPackage
 * @date 2019/11/28 19:33
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Package")
public class YGRequestPackage<T> {
    @XmlElement(
            name = "Header"
    )
    private RequestHeader requestHeader;

    @XmlAnyElement(lax = true)
    private T request;
}