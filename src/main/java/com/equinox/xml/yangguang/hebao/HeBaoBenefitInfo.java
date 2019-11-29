package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoBenefitInfo {
    @XmlElement(name = "IsLegal")
    private String isLegal;

    @XmlElementWrapper(name = "BenefitList")
    @XmlElement(name = "Benefit")
    private List<HeBaoBenefit> benefitList;
}
