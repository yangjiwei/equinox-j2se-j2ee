一、XML
使用JAXB 注解，将java bean转换成XML. 支持泛型，集合List, 嵌套等。
包路径：com.equinox.xml
1.list嵌套及包装，同时使用    
@XmlElementWrapper(name = "ItemList")
@XmlElement(name = "Item")
private List<HeBaoRisk> item;

2.泛型的使用
@XmlAnyElement(lax = true)
private T request;
同时在具体的对象上，使用XmlRootElement：
@XmlRootElement(name = "Request")
public class HeBaoRequestBody{}

3.如果更改xml头，则将头的生成注释掉，然后重写
marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
StringWriter writer = new StringWriter();
writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");