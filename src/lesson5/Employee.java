package lesson5;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;
    private int salary;

    public Employee(String name,
                    String position,
                    String email,
                    String phone,
                    int salary,
                    int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
