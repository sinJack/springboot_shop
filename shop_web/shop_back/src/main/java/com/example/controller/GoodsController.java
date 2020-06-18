package com.example.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.entity.Goods;
import com.example.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RequestMapping("/goods")
@Controller
public class GoodsController {

    @Reference
    private IGoodsService goodsService;

    @RequestMapping("/list")
    public String goodsList(ModelMap map){
        List<Goods> goods=goodsService.getAll();
        System.out.println("商品列表信息："+goods);
        map.put("goods",goods);
        return "goods/goods_list";
    }
}
