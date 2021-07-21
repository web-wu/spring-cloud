package com.tabwu.config_bus.controller;

import com.tabwu.config_bus.eentity.Goods;
import com.tabwu.config_bus.feignClient.GoodsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GoodsController {
    @Autowired
    private GoodsClient goodsClient;
    @Value("${tabwu}")
    private String tabwu;

    @GetMapping("/findone/{id}")
    public Goods getGoods(@PathVariable("id") int id) {
        Goods goods = goodsClient.getGoods(id);
        goods.setDescrible(tabwu);
        System.out.println(goods);
        return goods;
    }
}
