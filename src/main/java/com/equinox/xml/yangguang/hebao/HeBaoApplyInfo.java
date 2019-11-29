package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author yangjiwei
 * @Description:
 * @name: HeBaoApplyInfo
 * @date 2019/11/28 19:31
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoApplyInfo {
    @XmlElement(name = "Holder")
    private HeBaoHolder heBaoHolder;

    @XmlElement(name = "InsuredInfo")
    private HeBaoInsurednfo heBaoInsurednfo;

    @XmlElement(name = "OhterInfo")
    private HeBaoOtherInfo heBaoOtherInfo;
}