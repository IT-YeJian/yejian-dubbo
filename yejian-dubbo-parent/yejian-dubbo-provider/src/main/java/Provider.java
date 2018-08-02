import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author YeJian (jian.ye@downjoy.com)
 * @Description: 服务方启动类
 * @date 2018/8/2 16:25
 */
public class Provider {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext  context =
               new ClassPathXmlApplicationContext(new String[]{"META-INF/provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
