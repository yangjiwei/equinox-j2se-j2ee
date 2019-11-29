package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author yangjiwei
 * @Description:
 * @name: RequestBody
 * @date 2019/11/28 19:30
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Request")
public class HeBaoRequestBody implements Serializable {
    @XmlElement(name = "Order")
    private HeBaoOrder heBaoOrder;

    @XmlElement(name = "ApplyInfo")
    private HeBaoApplyInfo heBaoApplyInfo;
}