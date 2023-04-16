package top.claws.bean;

/**
 * @author claws
 * @since 2023/4/16
 */
public class Employee {
    private String name;
    private Department department;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // 如果想要给department的属性在xml配置中进行级联赋值，则需要设置一个get方法暴露出来。
    public Department getDepartment() {
        return department;
    }

    public void selfIntroduce() {
        System.out.println("I am " + name + " from department: " + department.toString());
    }
}
