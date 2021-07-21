package com.tabwu.config_bus.feignClient;

import com.tabwu.config_bus.eentity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider")
public interface GoodsClient {
    @GetMapping("/getgoods/{id}")
    public Goods getGoods(@PathVariable("id") int id);
}
