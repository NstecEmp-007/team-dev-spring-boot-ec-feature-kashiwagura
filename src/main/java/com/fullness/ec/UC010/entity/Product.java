package com.fullness.ec.uc010.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;// 商品名
    private Integer price;// 単価
    private Integer stock;// 在庫数
    private Integer categoryId; // 商品カテゴリID
    private String imageURL; // 商品画像URL
}
