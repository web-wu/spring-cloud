package spring_cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring_cloud.entity.Goods;
import spring_cloud.feignClient.GoodsClient;

@RestController
public class FeignController {
    @Autowired
    private GoodsClient goodsClient;

    @GetMapping("/findone/{id}")
    public Goods queryById(@PathVariable("id") int id) {
        Goods goods = goodsClient.getGoods(id);
        return goods;
    }
}
