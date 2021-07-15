package spring_cloud.entity;

import java.util.Date;

public class Goods {
    private int id;
    private String name;
    private String price;
    private int goods_num;
    private Date joinDate;

    public Goods() {
    }

    public Goods(int id, String name, String price, int goods_num, Date joinDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.goods_num = goods_num;
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

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
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
                ", goods_num=" + goods_num +
                ", joinDate=" + joinDate +
                '}';
    }
}
