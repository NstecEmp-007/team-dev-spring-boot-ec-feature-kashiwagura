package com.fullness.ec.UC010.entity;

import lombok.Data;

@Data
public class Product {
    private String name;// 商品名
    private Integer price;// 単価
    private Integer stock;// 在庫数
    private Integer categoryId; // 商品カテゴリID
    private String imageURL; // 商品画像URL
}
