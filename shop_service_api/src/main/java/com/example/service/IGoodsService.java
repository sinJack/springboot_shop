package com.example.service;

import com.example.entity.Goods;

import java.util.List;

public interface IGoodsService {

    public List<Goods> getAll();

    int insertGoods(Goods goods);
}
