package com.equinox.xml.yangguang.hebao;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HeBaoDiseaseItem {
    @XmlElement(name = "DiseaseType")
    private String diseaseType;
    @XmlElement(name = "Disease")
    private String disease;
    @XmlElement(name = "DiseaseQuestion")
    private String diseaseQuestion;
    @XmlElement(name = "DiseaseAnswer")
    private String diseaseAnswer;
    @XmlElement(name = "DiseaseConclusion")
    private String diseaseConclusion;
}
