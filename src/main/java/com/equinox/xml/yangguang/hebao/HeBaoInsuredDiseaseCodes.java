package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoInsuredDiseaseCodes {
    @XmlElement(name = "InsuredDiseaseCodes")
    private Integer insuredDiseaseCodes;
}
