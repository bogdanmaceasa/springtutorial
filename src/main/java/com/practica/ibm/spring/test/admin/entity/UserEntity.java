package com.practica.ibm.spring.test.admin.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="age")
    private int age;

//    private String firstName;
//    private String lastName;
//    private String email;
}
