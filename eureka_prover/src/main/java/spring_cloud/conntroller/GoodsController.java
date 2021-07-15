package spring_cloud.conntroller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tabwu.spring_cloud.entity.Goods;
import com.tabwu.spring_cloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/findone/{id}")
    @HystrixCommand(fallbackMethod = "getGoods_fallback")
    public Goods getGoods(@PathVariable("id") int id) {
        return goodsService.getGoods(id);
    }

    public Goods getGoods_fallback(int id) {
        Goods goods = new Goods();
        goods.setName("网络太忙，请稍后在访问。。。");
        return goods;
    }
}
