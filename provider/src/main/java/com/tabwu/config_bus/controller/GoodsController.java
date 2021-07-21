package com.tabwu.config_bus.controller;

import com.tabwu.config_bus.eentity.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @GetMapping("/getgoods/{id}")
    public Goods getGoods(@PathVariable("id") int id) {
        Goods goods = new Goods();
        goods.setId(id);
        return goods;
    }
}
