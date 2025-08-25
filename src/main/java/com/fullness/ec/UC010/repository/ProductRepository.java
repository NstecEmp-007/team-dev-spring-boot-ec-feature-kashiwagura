package com.fullness.ec.uc010.repository;

import org.apache.ibatis.annotations.Mapper;

import com.fullness.ec.uc010.entity.Product;

@Mapper
public interface ProductRepository {

    void insert(Product product);
}
