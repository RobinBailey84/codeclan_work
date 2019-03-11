package com.example.employeerecords.employeerecords;

import javax.persistence.*;

@Entity
@Table(name="employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "employee_number")
    private int employeeNumer;
    @Column(name = "email_address")
    private String email;

    public Employee(String name, int age, int employeeNumer, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumer = employeeNumer;
        this.email = email;
    }

    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getEmployeeNumer() {
        return employeeNumer;
    }

    public void setEmployeeNumer(int employeeNumer) {
        this.employeeNumer = employeeNumer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
