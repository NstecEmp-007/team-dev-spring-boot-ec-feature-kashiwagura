package com.fullness.ec.uc010.service;

import java.util.List;

import com.fullness.ec.uc010.entity.Product;
import com.fullness.ec.uc010.entity.ProductCategory;

public interface ProductService {
    /**
     * 商品を登録する
     * 
     * @param item
     */
    void addProduct(Product product);

    /**
     * 商品カテゴリ一覧を取得する
     * 
     * @return
     */
    List<ProductCategory> getProductCategories();

    ProductCategory getProductCategoryById(Integer categoryId);
}