package com.fullness.ec.UC010.entity;

import java.util.List;

import lombok.Data;

@Data
public class ProductCategory {

    // 取得した商品カテゴリ
    private Integer id;
    private String name;

    // 商品カテゴリに属する商品
    private List<ProductCategory> productCategories;

}