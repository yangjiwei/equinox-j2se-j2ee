package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoInsurednfo {
    @XmlElement(name = "IsHolder")
    private String isHolder;

    @XmlElementWrapper(name = "InsuredList")
    @XmlElement(name = "Insured")
    private List<HeBaoInsured> insuredList;
}
