package top.claws;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author claws
 * @since 2023/4/17
 */

public class TestBeginner {
    @Test
    public void testOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("hamcrest-core-1.3.jar");
        User user = context.getBean("user", User.class);
        user.sayHello();
    }

    @Test
    public void testFileExists() {
        String filename = "learnSpring.iml"; // 文件路径
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("文件存在!");
        } else {
            System.out.println("文件不存在!");
        }
        String workingDir = System.getProperty("user.dir");
        System.out.println("当前工作目录：" + workingDir);
        String classpath = System.getProperty("java.class.path");
        System.out.println("Classpath: " + classpath);
    }
}
