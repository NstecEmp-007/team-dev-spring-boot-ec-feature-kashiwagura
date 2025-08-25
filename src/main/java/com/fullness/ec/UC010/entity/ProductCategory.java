package com.fullness.ec.uc010.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory {

    // 取得した商品カテゴリ
    private Integer id;
    private String name;

    // 商品カテゴリに属する商品
    private List<ProductCategory> productCategories;

}