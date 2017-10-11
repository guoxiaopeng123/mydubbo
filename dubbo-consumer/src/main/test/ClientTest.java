import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.DemoService;

/**
 * @描述 : 
 * @创建者 : guoxiaopeng
 * @创建时间 : 2017-7-12 上午11:26:27
 */
public class ClientTest {

    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("spring-config.xml");
        DemoService demoService= (DemoService) app.getBean("demoService");
        String sayHello = demoService.sayHello("hello");
        System.out.println(sayHello);
    }
}
