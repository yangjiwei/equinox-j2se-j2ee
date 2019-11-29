package com.equinox.xml.yangguang.chengbao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ChenBaoProposal {
    @XmlElement(name = "ProposalNo")
    private String proposalNo;
    @XmlElement(name = "UserId")
    private String userId;
    @XmlElement(name = "UserName")
    private String userName;

}
