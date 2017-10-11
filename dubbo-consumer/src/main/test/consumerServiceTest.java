import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.DemoService;


/**
 * @描述 : 
 * @创建者 : guoxiaopeng
 * @创建时间 : 2017-7-11 下午5:53:39
 */
public class consumerServiceTest {
    public static void main(String[] args) {  
        try {
            ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
            DemoService demoService = (DemoService) context.getBean("demoService");
            System.out.println(demoService);
            String sayHello = demoService.sayHello("张三");
            System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
//            System.out.println(sayHello);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
    }  
}
