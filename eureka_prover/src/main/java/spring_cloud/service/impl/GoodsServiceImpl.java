package spring_cloud.service.impl;

import com.tabwu.spring_cloud.dao.GoodsDao;
import com.tabwu.spring_cloud.entity.Goods;
import com.tabwu.spring_cloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public Goods getGoods(int id) {
        return goodsDao.getGoods(id);
    }
}
