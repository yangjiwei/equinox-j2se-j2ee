package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoHolderDiseaseCodes {
    @XmlElement(name = "HolderDiseaseCode")
    private Integer holderDiseaseCode;
}
