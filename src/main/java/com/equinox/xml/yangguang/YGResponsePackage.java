package com.equinox.xml.yangguang;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author yangjiwei
 * @Description:
 * @name: ResponsePackage
 * @date 2019/11/28 19:59
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Package")
public class YGResponsePackage<T> {
    @XmlElement(name = "Header")
    private ResponseHeader responseHeader;

    //@XmlElement(name = "Response")
    @XmlAnyElement(lax = true)
    private T object;
}