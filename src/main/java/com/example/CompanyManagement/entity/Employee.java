package com.example.CompanyManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
   @Column(name="employee_id")
    private int id;
   @Column(name="employee_name")
    private String name;
   @Column(name="employee_adress")
    private String adress;

   public Employee(){

   }

    public Employee(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
