package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Proposal")
public class HeBaoProposalResponse {
    @XmlElement(name = "ProposalNo")
    private String proposalNo;
    @XmlElement(name = "UnderwriteFlag")
    private Boolean underwriteFlag;
    @XmlElement(name = "FailReason")
    private String failReason;
    @XmlElement(name = "IsTransUWFlag")
    private Boolean isTransUWFlag;
}
