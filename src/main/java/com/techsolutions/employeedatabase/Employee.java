package com.techsolutions.employeedatabase;

public class Employee {
    private String name;
    private String title;
    private String department;
    private int badgeNumber;

    public Employee(String name, String title, String department, int badgeNumber){
        this.name = name;
        this.title = title;
        this.department = department;
        this. badgeNumber = badgeNumber;

    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;
    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

}
