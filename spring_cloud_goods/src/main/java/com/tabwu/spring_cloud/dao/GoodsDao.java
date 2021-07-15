package com.tabwu.spring_cloud.dao;

import com.tabwu.spring_cloud.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class GoodsDao {
    public Goods getGoods(int id) {
        return new Goods(id,"iphone","6999",100,new Date());
    }
}
