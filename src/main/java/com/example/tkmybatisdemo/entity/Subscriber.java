package com.example.tkmybatisdemo.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "subscriber")
@Data
public class Subscriber {
    @GeneratedValue(generator = "JDBC")
    @Id
    private Integer id;

    private String username;

    private String domain;

    private String password;

    @Column(name = "email_address")
    private String emailAddress;

    private String ha1;

    private String ha1b;

    private String rpid;

    @Column(name = "route_type")
    private Integer routeType;

    @Column(name = "route_dest")
    private String routeDest;

}