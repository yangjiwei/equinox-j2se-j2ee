package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoHolder {
    @XmlElement(name = "HolderName")
    private String holderName;

    @XmlElement(name = "HolderEmail")
    private String holderEmail;

    @XmlElement(name = "HolderCardType")
    private String holderCardType;

    @XmlElement(name = "HolderCardNo")
    private String holderCardNo;

    @XmlElement(name = "HolderCardValid")
    private String holderCardValid;

    @XmlElement(name = "HolderBirthday")
    private String holderBirthday;

    @XmlElement(name = "HolderSex")
    private String holderSex;

    @XmlElement(name = "HolderPhone")
    private String holderPone;

    @XmlElement(name = "HolderMobile")
    private String holderMobile;

    @XmlElement(name = "HolderResidentProvince")
    private String holderResidentProvince;

    @XmlElement(name = "HolderResidentCity")
    private String holderResidentCity;

    @XmlElement(name = "HolderResidentCounty")
    private String holderResidentCounty;

    @XmlElement(name = "HolderAddress")
    private String holderAddress;

    @XmlElement(name = "HolderZip")
    private String holderZip;

    @XmlElement(name = "HolderOccupationCode")
    private String holderOccupationCode;

    @XmlElement(name = "HolderHeight")
    private String holderHeight;

    @XmlElement(name = "HolderWeight")
    private String holderWeight;

    @XmlElement(name = "Degree")
    private String degree;

    @XmlElement(name = "AnnualIncome")
    private String annualIncome;

    @XmlElement(name = "SocialFlag")
    private String socialFlag;
}
