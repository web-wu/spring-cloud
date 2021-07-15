package com.tabwu.spring_cloud.controller;

import com.tabwu.spring_cloud.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getorder/{id}")
    public Goods getGoods(@PathVariable("id") int id) {
//        String url = "http://localhost:8080/findone/"+ id;

        List<ServiceInstance> instances = discoveryClient.getInstances("goods-server");
        ServiceInstance instance = instances.get(0);
        String url = "http://"+ instance.getHost()+":"+ instance.getPort() +"/findone";
        Goods goods = restTemplate.getForObject(url, Goods.class);
        return goods;
    }
}