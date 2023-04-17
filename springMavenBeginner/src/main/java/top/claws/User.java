package top.claws;

/**
 * @author claws
 * @since 2023/4/17
 */
public class User {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello, " + name);
    }
}
