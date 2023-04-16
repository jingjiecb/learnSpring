package top.claws;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.claws.service.UserService;

/**
 * @author claws
 * @since 2023/4/16
 */
public class TestServiceDao {
    @Test
    public void testServiceDao() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.addUser();
    }
}
