package top.claws;

/**
 * @author claws
 * @since 2023/4/16
 */
public class User {
    private String name;

    private int age;

    public User() {
        System.out.println("User 对象创建");
    }
    public void sayHello() {
        System.out.println("Hello, I am " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
