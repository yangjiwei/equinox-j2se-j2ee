package com.equinox.xml.yangguang.chengbao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {
    @XmlElement(name = "OrderId")
    private String orderId;
    @XmlElement(name = "PayOrderId")
    private String payOrderId;
    @XmlElement(name = "PayType")
    private String payType;
    @XmlElement(name = "PayAccountId")
    private String payAccountId;
    @XmlElement(name = "PayAccountName")
    private String payAccountName;
    @XmlElement(name = "BankCode")
    private String bankCode;
    @XmlElement(name = "BankCardNo")
    private String bankCardNo;
    @XmlElement(name = "HolderName")
    private String holderName;
    @XmlElement(name = "BankAccount")
    private String bankAccount;
    @XmlElement(name = "PayTime")
    private String payTime;
    @XmlElement(name = "PayMoney")
    private Integer payMoney;
    @XmlElement(name = "AccountDate")
    private String accountDate;
}
