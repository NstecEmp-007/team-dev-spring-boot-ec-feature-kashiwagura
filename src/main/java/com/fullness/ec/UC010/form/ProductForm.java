package com.fullness.ec.UC010.form;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductForm implements java.io.Serializable {
    @NotNull
    @Min(2)
    @Max(20)
    private String name; // 商品名
    @NotNull
    @Max(1000000)
    @Min(1)
    private Integer price; // 単価
    @NotNull
    @Min(0)
    @Max(1000)
    private Integer stock; // 在庫数
    private Integer categoryId; // 商品カテゴリID
    @NotNull
    private String imageURL; // 商品画像URL

    // Getters and Setters

}
