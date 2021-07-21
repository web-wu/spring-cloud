package com.tabwu.config_bus.entity;

import java.util.Date;

public class Goods {
    private int id;
    private String name;
    private String price;
    private int number;
    private String describle;
    private Date joinDate;

    public Goods() {
    }

    public Goods(int id, String name, String price, int number, String describle, Date joinDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.describle = describle;
        this.joinDate = joinDate;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", number=" + number +
                ", describle='" + describle + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}