package com.fullness.ec.UC010.helper;

import org.springframework.stereotype.Component;

import com.fullness.ec.UC010.entity.Product;
import com.fullness.ec.UC010.form.ProductForm;

@Component
public class ProductHelper {
    public static Product convert(ProductForm productForm) {
        Product product = new Product();
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setCategoryId(productForm.getCategoryId());
        return product;
    }
}