package com.example.pj.online_shop.port.out;

import com.example.pj.online_store.Goods;

public interface ReadGoodsDetail {
    Goods read(Goods.GoodsId goodsId);
}