package com.example.tkmybatisdemo.entity;

import javax.persistence.*;

@Table(name = "subscriber")
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

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email_address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return ha1
     */
    public String getHa1() {
        return ha1;
    }

    /**
     * @param ha1
     */
    public void setHa1(String ha1) {
        this.ha1 = ha1;
    }

    /**
     * @return ha1b
     */
    public String getHa1b() {
        return ha1b;
    }

    /**
     * @param ha1b
     */
    public void setHa1b(String ha1b) {
        this.ha1b = ha1b;
    }

    /**
     * @return rpid
     */
    public String getRpid() {
        return rpid;
    }

    /**
     * @param rpid
     */
    public void setRpid(String rpid) {
        this.rpid = rpid;
    }

    /**
     * @return route_type
     */
    public Integer getRouteType() {
        return routeType;
    }

    /**
     * @param routeType
     */
    public void setRouteType(Integer routeType) {
        this.routeType = routeType;
    }

    /**
     * @return route_dest
     */
    public String getRouteDest() {
        return routeDest;
    }

    /**
     * @param routeDest
     */
    public void setRouteDest(String routeDest) {
        this.routeDest = routeDest;
    }
}