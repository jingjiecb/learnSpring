# 纯手工使用Spring5

## 环境

Spring版本：5.2.24.RELEASE

Junit版本：Junit4.13.2

## 依赖下载导入

### Spring 相关依赖下载

手动下载Spring的release包，里面包含一些核心的jar包：https://repo.spring.io/ui/native/release/org/springframework/spring/5.2.24.RELEASE/ 。解压后，将libs目录中core、context、expression和beans相关的jar包拷贝出来，准备到项目目录中。

另外还要下载Commons Logging包，Spring的运行依赖于这个日志包：https://commons.apache.org/proper/commons-logging/download_logging.cgi

### Junit 相关依赖下载

Junit测试框架让我们更方便可以完成一些测试用的代码。

参考[Junit4 Github官方页面](https://github.com/junit-team/junit4/wiki/Download-and-Install)，需要安装junit包和hamcrest包（断言相关支持）。可以跟着里面的链接指引，来到https://central.sonatype.com/ 相关页面进行下载。

Junit包下载链接： https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar

hamcrest包下载链接：https://search.maven.org/artifact/org.hamcrest/hamcrest-core/1.3/jar 注意要hamcrest-core的话要下载1.3的，高版本合并到hamcrest包了。

### IDEA引入包

如果使用IDEA，需要在Project Structure中引入包。操作步骤参考下面的截图。

![image-20230416213908948](https://cdn.claws.top/doc/image-20230416213908948.webp)

## 业务代码

一点点业务代码，测试一下Spring的使用。

### 新建User类

一个非常简单的类，包含一个方法。

```java
package top.claws;

public class User {
    public void add() {
        System.out.println("Add...");
    }
}
```

### 配置Bean

第一次采用最基础的方式——xml文件的形式配置bean。首先通过下图的操作，快速新建一个spring的xml配置文件，这样产生的文件包含了一些格式约定的基础内容，不用我们再自己来操心这个了。

![image-20230416214240941](https://cdn.claws.top/doc/image-20230416214240941.webp)

在新的配置文件中写入一个bean标签，id表示名字，class表示这个bean的类型，这样就完成了一个User类型的bean的配置。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="user" class="top.claws.User"></bean>
</beans>
```

## 测试代码

这里选择用Junit框架辅助完成一个最最简单的测试，用来体会Spring5的使用。

新建一个TestSpring5类（注意不要命名为Test），里面引入Test注解，用来创建一个测试。

```java
package top.claws;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testUserAdd() {
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 获得配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
```

运行测试，看到对象被成功创建起来，对象的方法也被成功调用了。

![image-20230416214708320](https://cdn.claws.top/doc/image-20230416214708320.webp)