package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order")
public class HeBaoOrder {
    @XmlElement(name = "OrderId")
    private String orderId;

    @XmlElement(name = "ApplyNum")
    private String applyNum;

    @XmlElement(name = "TotalPremium")
    private String totalPremium;

    @XmlElement(name = "PayType")
    private String payType;

    @XmlElement(name = "PaymentPeriod")
    private String paymentPeriod;

    @XmlElement(name = "RenewalBankCode")
    private String renewalBankCode;

    @XmlElement(name = "RenewalBankName")
    private String renewalBankName;

    @XmlElement(name = "RenewalBankAccount")
    private String renewalBankAccount;

    @XmlElementWrapper(name = "ItemList")
    @XmlElement(name = "Item")
    private List<HeBaoRisk> item;

    @XmlElement(name = "NotePadCont")
    private String notePadCont;

    @XmlElement(name = "HbClass")
    private String hbClass;

    @XmlElement(name = "CoupleFlag")
    private String coupleFlag;

    @XmlElement(name = "CouplePolicyNo")
    private String couplePolicyNo;

}
