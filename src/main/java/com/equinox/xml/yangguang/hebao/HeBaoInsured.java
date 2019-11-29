package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoInsured {
    @XmlElement(name = "InsuredName")
    private String insuredName;

    @XmlElement(name = "InsuredEmail")
    private String insuredEmail;

    @XmlElement(name = "InsuredCardType")
    private String insuredCardType;

    @XmlElement(name = "InsuredCardNo")
    private String insuredCardNo;

    @XmlElement(name = "InsuredCardValid")
    private String insuredCardValid;

    @XmlElement(name = "InsuredBirthday")
    private String insuredBirthday;

    @XmlElement(name = "InsuredSex")
    private String insuredSex;

    @XmlElement(name = "InsuredPhone")
    private String insuredPhone;

    @XmlElement(name = "InsuredMobile")
    private String insuredMobile;

    @XmlElement(name = "InsuredResidentProvince")
    private String insuredResidentProvince;

    @XmlElement(name = "InsuredResidentCity")
    private String insuredResidentCity;

    @XmlElement(name = "InsuredResidentCounty")
    private String insuredResidentCounty;

    @XmlElement(name = "InsuredAddress")
    private String insuredAddress;

    @XmlElement(name = "InsuredZip")
    private String insuredZip;

    @XmlElement(name = "InsuredOccupationCode")
    private String insuredOccupationCode;

    @XmlElement(name = "InsuredHeight")
    private String insuredHeight;

    @XmlElement(name = "InsuredWeight")
    private String insuredWeight;

    @XmlElement(name = "InsuredRelation")
    private String insuredRelation;

    @XmlElement(name = "Degree")
    private String degree;

    @XmlElement(name = "AnnualIncome")
    private String annualIncome;

    @XmlElement(name = "SocialFlag")
    private String socialFlag;

    @XmlElement(name = "BenefitInfo")
    private HeBaoBenefitInfo heBaoBenefitInfo;
}
