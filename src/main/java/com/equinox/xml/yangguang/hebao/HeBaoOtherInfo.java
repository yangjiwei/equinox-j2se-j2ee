package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoOtherInfo {

    @XmlElement(name = "PolicyType")
    private String policyType;

    @XmlElement(name = "IsPostInvoice")
    private String isPostInvoice;

    @XmlElement(name = "PostAddress")
    private String postAddress;

    @XmlElement(name = "PostZip")
    private String postZip;

    @XmlElement(name = "HistoryAmountFlag")
    private String historyAmountFlag;

    @XmlElement(name = "HistoryAmount")
    private String historyAmount;
}
