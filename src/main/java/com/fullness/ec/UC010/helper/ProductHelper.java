package com.fullness.ec.uc010.helper;

import org.springframework.stereotype.Component;

import com.fullness.ec.uc010.entity.Product;
import com.fullness.ec.uc010.form.ProductForm;

@Component
public class ProductHelper {
    public static Product convert(ProductForm productForm) {
        Product product = new Product();
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setCategoryId(productForm.getCategoryId());
        product.setStock(productForm.getStock());
        product.setImageURL(productForm.getImageURL().getOriginalFilename());
        return product;
    }
}