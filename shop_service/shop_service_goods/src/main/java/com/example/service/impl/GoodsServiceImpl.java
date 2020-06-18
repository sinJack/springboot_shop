package com.example.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.dao.GoodsMapper;
import com.example.entity.Goods;
import com.example.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getAll() {
        System.out.println(goodsMapper.selectList(null));
        return goodsMapper.selectList(null);
    }

    @Override
    public int insertGoods(Goods goods) {
        return goodsMapper.insert(goods);
    }
}
