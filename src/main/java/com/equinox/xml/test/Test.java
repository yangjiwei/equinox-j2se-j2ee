package com.equinox.xml.test;

import com.equinox.xml.yangguang.RequestHeader;
import com.equinox.xml.yangguang.YGRequestPackage;
import com.equinox.xml.yangguang.hebao.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjiwei
 * @Description:
 * @name: Test
 * @date 2019/11/28 20:14
 */
public class Test {

    public static void main(String[] args){
        YGRequestPackage<HeBaoRequestBody> ygRequestPackage = createHeBaoBean();
        bean2Xml(ygRequestPackage, HeBaoRequestBody.class );
    }

    public static YGRequestPackage createHeBaoBean(){
        YGRequestPackage<HeBaoRequestBody> ygResponsePackage = new YGRequestPackage();
        HeBaoRequestBody heBaoRequestBody = new HeBaoRequestBody();
        RequestHeader requestHeader = new RequestHeader();
        ygResponsePackage.setRequestHeader(requestHeader);
        requestHeader.setRequestType("01");

        ygResponsePackage.setRequest(heBaoRequestBody);

        HeBaoOrder heBaoOrder = new HeBaoOrder();
        heBaoOrder.setApplyNum("1");
        heBaoOrder.setCouplePolicyNo("12345");

        List<HeBaoRisk> list = new ArrayList<>();
        HeBaoRisk heBaoRisk = new HeBaoRisk();
        heBaoRisk.setAmount("999");

        HeBaoRisk heBaoRisk1 = new HeBaoRisk();
        heBaoRisk1.setAmount("888");
        list.add(heBaoRisk);
        list.add(heBaoRisk1);
        heBaoOrder.setItem(list);

        HeBaoApplyInfo heBaoApplyInfo = new HeBaoApplyInfo();
        HeBaoHolder heBaoHolder = new HeBaoHolder();
        heBaoApplyInfo.setHeBaoHolder(heBaoHolder);

        HeBaoInsurednfo heBaoInsurednfo = new HeBaoInsurednfo();
        heBaoInsurednfo.setIsHolder("1");

        List<HeBaoInsured> insuredList = new ArrayList<>();
        HeBaoInsured heBaoInsured = new HeBaoInsured();
        HeBaoInsured heBaoInsured1 = new HeBaoInsured();
        insuredList.add(heBaoInsured);
        insuredList.add(heBaoInsured1);
        heBaoInsured.setDegree("0");
        heBaoInsured.setInsuredAddress("北京");

        heBaoInsured1.setAnnualIncome("20000");
        heBaoInsured1.setInsuredCardType("1");

        HeBaoBenefitInfo heBaoBenefitInfo = new HeBaoBenefitInfo();
        heBaoBenefitInfo.setIsLegal("0");
        HeBaoBenefit heBaoBenefit = new HeBaoBenefit("样子");
        HeBaoBenefit heBaoBenefit1 = new HeBaoBenefit("mary");

        List<HeBaoBenefit> list1 = new ArrayList<>();
        list1.add(heBaoBenefit);
        list1.add(heBaoBenefit1);
        heBaoBenefitInfo.setBenefitList(list1);
        heBaoInsured.setHeBaoBenefitInfo(heBaoBenefitInfo);
        heBaoInsurednfo.setInsuredList(insuredList);
        heBaoApplyInfo.setHeBaoInsurednfo(heBaoInsurednfo);

        HeBaoOtherInfo heBaoOtherInfo = new HeBaoOtherInfo();
        heBaoOtherInfo.setHistoryAmount("123");
        heBaoApplyInfo.setHeBaoOtherInfo(heBaoOtherInfo);

        heBaoRequestBody.setHeBaoApplyInfo(heBaoApplyInfo);
        heBaoRequestBody.setHeBaoOrder(heBaoOrder);
        return ygResponsePackage;
    }


    public static String bean2Xml(Object a, Class t){
        JAXBContext jc = null;
        try {
            StringWriter writer = new StringWriter();
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

            jc = JAXBContext.newInstance(a.getClass(), t);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(a, writer);
            String result = writer.toString();
            System.out.println(result);
            return result;
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> String bean2Xmlt(T a, Class t){
        JAXBContext jc = null;
        try {
            StringWriter writer = new StringWriter();
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

            jc = JAXBContext.newInstance(a.getClass(), t);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.marshal(a, writer);
            String result = writer.toString();
            System.out.println(result);
            return result;
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}