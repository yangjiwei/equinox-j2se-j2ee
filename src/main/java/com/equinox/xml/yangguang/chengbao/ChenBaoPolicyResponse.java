package com.equinox.xml.yangguang.chengbao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ChenBaoPolicyResponse {
    @XmlElement(name = "PolicyNo")
    private String policyNo;
    @XmlElement(name = "ProposalNo")
    private String proposalNo;
    @XmlElement(name = "TotalPremium")
    private Integer totalPremium;
    @XmlElement(name = "IsSuccess")
    private Boolean isSuccess;
    @XmlElement(name = "FailReason")
    private String failReason;
    @XmlElement(name = "IssuedTime")
    private String issuedTime;
}
