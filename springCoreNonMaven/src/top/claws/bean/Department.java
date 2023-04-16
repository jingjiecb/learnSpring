package top.claws.bean;

/**
 * @author claws
 * @since 2023/4/16
 */
public class Department {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
