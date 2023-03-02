import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Client {

	public static void main(String[] args) {
		
		// 2 types of IoC containers:  
		
		// Bean Factory :
		Resource resource = new ClassPathResource("employeeConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		EmployeeBean e1 = (EmployeeBean)factory.getBean("emp1");
		EmployeeBean e2 = factory.getBean("emp2",EmployeeBean.class);
		EmployeeBean e3 = factory.getBean("emp3",EmployeeBean.class);
		
//		Application Context :
		
//		ApplicationContext appcon = new ClassPathXmlApplicationContext("employeeConfig.xml");
//		EmployeeBean e1 = (EmployeeBean)appcon.getBean("emp1");
//		EmployeeBean e2 = (EmployeeBean)appcon.getBean("emp2");
//		EmployeeBean e3 = (EmployeeBean)appcon.getBean("emp3");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
