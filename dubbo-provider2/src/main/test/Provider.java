import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @描述 : 
 * @创建者 : guoxiaopeng
 * @创建时间 : 2017-7-11 下午1:05:57
 */
public class Provider {

    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "spring-config.xml" });  
        context.start();  
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }  
}
