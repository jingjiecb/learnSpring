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

    public void selfIntroduce() {
        System.out.println("I am " + name + " from department: " + department.toString());
    }
}
