package client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.brilliance.webservicefortest.CxfWebServiceImpl;

/**
* @ClassName: CXFClient
* @Package client
* @Description: CXF客户端
* @author Russell Xun Jiang
* @date 2016年12月18日 下午3:33:59
* 
*/
public class CXFClient {

	public static void main(String[] args) {
		System.out.println("cxf客户端访问服务端服务......");
		//创建服务代理
		JaxWsProxyFactoryBean  factoryBean=new JaxWsProxyFactoryBean(); 
		//设置被代理对象(被代理的对象是service的interface)
        factoryBean.setServiceClass(CxfWebServiceImpl.class);   
        //设置访问的服务端的URL（原生jdk webservice客户端不用设置；这里cxf客户端要设置）
        factoryBean.setAddress("http://127.0.0.1:8080/brilliance/CXFService");
        //创建服务对象service
        CxfWebServiceImpl service = (CxfWebServiceImpl)factoryBean.create();   
        int age = service.getAge2(1990);
		System.out.println("此人的年龄是："+age);
		String welcome = service.getWelcome2("Russell");
		System.out.println("欢迎信息是："+welcome);

	}

}
