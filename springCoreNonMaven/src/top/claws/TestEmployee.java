package top.claws;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.claws.bean.Employee;

/**
 * @author claws
 * @since 2023/4/16
 */
public class TestEmployee {
    @Test
    public void testEmployee() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Employee emp = context.getBean("emp", Employee.class);
        emp.selfIntroduce();
    }
}
