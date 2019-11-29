package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoDiseaseInfo {
    @XmlElement(name = "BenefitName")
    private String holderDiseaseCount;

    @XmlElement(name = "HeBaoHolderDiseaseCodes")
    private String holderDiseaseCodes;

    @XmlElement(name = "InsuredDiseaseCount")
    private String insuredDiseaseCount;

    @XmlElement(name = "InsuredDiseaseCodes")
    private String insuredDiseaseCodes;
}
