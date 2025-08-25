package com.fullness.ec.UC010.repository;

import org.apache.ibatis.annotations.Mapper;

import com.fullness.ec.UC010.entity.Product;

@Mapper
public interface ProductRepository {

    void insert(Product product);
}
