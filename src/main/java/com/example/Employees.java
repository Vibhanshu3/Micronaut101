package com.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.inject.Singleton;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Singleton
@Data
@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private long id;

    @Getter
    @Setter
    @Column(name = "name")
    private String name;

    @Getter
    @Setter
    @Column(name = "salary")
    private int salary;

    public Employees() {
    }

    public Employees(long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}