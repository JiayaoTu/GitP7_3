package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String gender;
    private int companyId;
    private int salary;

    public Employee(String name, int age,  String gender,  int salary,int id,int companyId) {}
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.companyId=companyId;
        this.salary=salary;
    }
    public Employee(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
