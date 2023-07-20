package com.github.vermucht.smth.entity;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "employees")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "department")
  private String department;

  @Column(name = "salary")
  private int salary;

  public Employee() {}

  public Employee(long id, String name, String surname, String department, int salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.department = department;
    this.salary = salary;
  }

  public Employee(Employee other) {
    this.id = other.id;
    this.name = other.name;
    this.surname = other.surname;
    this.department = other.department;
    this.salary = other.salary;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return id == employee.id
        && salary == employee.salary
        && Objects.equals(name, employee.name)
        && Objects.equals(surname, employee.surname)
        && Objects.equals(department, employee.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, department, salary);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("name='" + name + "'")
        .add("surname='" + surname + "'")
        .add("department='" + department + "'")
        .add("salary=" + salary)
        .toString();
  }
}
