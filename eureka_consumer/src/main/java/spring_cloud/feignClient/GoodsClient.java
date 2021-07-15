package spring_cloud.feignClient;

import com.tabwu.spring_cloud.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("eureka-provider")
public interface GoodsClient {
    @GetMapping("/findone/{id}")
    public Goods getGoods(@PathVariable("id") int id);
}
