package top.claws;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author claws
 * @since 2023/4/16
 */
public class TestSpring5 {

    @Test
    public void testUserAdd() {
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        System.out.println("xml 文件已加载");

        // 获得配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.sayHello();
    }
}
