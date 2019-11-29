package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoRisk {
    @XmlElement(name = "SkuCode")
    private String skuCode;

    @XmlElement(name = "IsMainRisk")
    private String isMainRisk;

    @XmlElement(name = "ProductCode")
    private String productCode;

    @XmlElement(name = "ProductName")
    private String productName;

    @XmlElement(name = "SpecialCode")
    private String specialCode;

    @XmlElement(name = "Amount")
    private String amount;

    @XmlElement(name = "Premium")
    private String premium;

    @XmlElement(name = "InsBeginDate")
    private String insBeginDate;

    @XmlElement(name = "InsEndDate")
    private String insEndDate;

    @XmlElement(name = "InsPeriod")
    private String insPeriod;

    @XmlElement(name = "PayType")
    private String payType;

    @XmlElement(name = "PaymentPeriod")
    private String paymentPeriod;

    @XmlElement(name = "IsSpec")
    private String isSpec;

    @XmlElement(name = "SpecContent")
    private String specContent;

    @XmlElement(name = "SafeguardPlan")
    private String safeguardPlan;

    @XmlElement(name = "RnewFlag")
    private String rnewFlag;

}
