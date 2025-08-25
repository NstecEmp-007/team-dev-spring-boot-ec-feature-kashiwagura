package com.fullness.ec.uc010.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullness.ec.uc010.entity.Product;
import com.fullness.ec.uc010.entity.ProductCategory;
import com.fullness.ec.uc010.repository.ProductCategoryRepository;
import com.fullness.ec.uc010.repository.ProductRepository;

@Service // インスタンス生成対象で、内部処理
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    /**
     * 商品を登録する
     * 
     * @param product 商品
     */
    @Override
    public void addProduct(Product product) {
        productRepository.insert(product);
    }

    /**
     * 商品を取得する
     * 
     * @return 商品リスト
     */
    @Override
    public List<ProductCategory> getProductCategories() {
        //
        return productCategoryRepository.selectAll();
    }

    @Override
    public ProductCategory getProductCategoryById(Integer categoryId) {
        // 商品カテゴリIDを指定して商品カテゴリを取得
        return productCategoryRepository.selectAll().stream()
                .filter(category -> category.getId().equals(categoryId))
                .findFirst()
                .orElse(null);

    }

}