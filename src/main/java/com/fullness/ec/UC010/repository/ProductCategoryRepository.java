package com.fullness.ec.uc010.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fullness.ec.uc010.entity.ProductCategory;

/**
 * 商品カテゴリテーブルをアクセスするリポジトリインターフェース
 */
@Mapper
public interface ProductCategoryRepository {
    /**
     * すべての商品カテゴリを取得する
     * 
     * @return
     */
    List<ProductCategory> selectAll();
}