package client;

import com.brilliance.webservicefortest.WebServiceImpl;
import com.brilliance.webservicefortest.WebServiceImplService;

/**
* @ClassName: ClientClass
* @Package client
* @Description: 纯jdk webservice客户端
* @author Russell Xun Jiang
* @date 2016年12月18日 下午2:42:13
* 调用服务端服务
*/
public class ClientClass {

	public static void main(String[] args) {
		System.out.println("纯jdk webservice客户端访问服务端服务......");
		//创建服务对象
		WebServiceImplService ws = new WebServiceImplService();
		//创建服务代理，通过服务代理调用服务的方法。
		WebServiceImpl servicePoxy = ws.getWebServiceImplPort();
		int age = servicePoxy.getAge(1990);
		System.out.println("此人的年龄是："+age);
		String welcome = servicePoxy.getWelcome("Russell");
		System.out.println("欢迎信息是："+welcome);
	}

}
