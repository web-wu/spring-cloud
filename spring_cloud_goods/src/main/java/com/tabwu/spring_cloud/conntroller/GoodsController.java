package com.tabwu.spring_cloud.conntroller;

import com.tabwu.spring_cloud.entity.Goods;
import com.tabwu.spring_cloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @GetMapping("/findone/{id}")
//    @ResponseBody
    public Goods getGoods(@PathVariable("id") int id) {
        return goodsService.getGoods(id);
    }
}
