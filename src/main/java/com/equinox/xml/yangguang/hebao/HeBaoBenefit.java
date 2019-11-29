package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoBenefit {
    @XmlElement(name = "BenefitName")
    private String benefitName;

    @XmlElement(name = "BenefitRelation")
    private String benefitRelation;

    @XmlElement(name = "BenefitOrder")
    private String benefitOrder;

    @XmlElement(name = "BenefitScale")
    private String benefitScale;

    @XmlElement(name = "BenefitSex")
    private String benefitSex;

    @XmlElement(name = "BenefitCardType")
    private String benefitCardType;

    @XmlElement(name = "BenefitCardNo")
    private String benefitCardNo;

    @XmlElement(name = "BenefitCardValid")
    private String benefitCardValid;

    @XmlElement(name = "BenefitBirthday")
    private String benefitBirthday;

    @XmlElement(name = "BenefitType")
    private String benefitType;

    public HeBaoBenefit(String benefitName){
        this.benefitName = benefitName;
    }
}
