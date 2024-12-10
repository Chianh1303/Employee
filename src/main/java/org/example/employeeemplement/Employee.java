package org.example.employeeemplement;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private String departments;
    private String salary;

    public Employee(int id, String name, int age, String position, String departments, String salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.departments = departments;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", departments='" + departments + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
//
//sadhashdkasjdak
}