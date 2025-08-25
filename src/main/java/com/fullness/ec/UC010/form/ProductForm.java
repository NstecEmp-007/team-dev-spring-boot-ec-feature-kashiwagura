package com.fullness.ec.uc010.form;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
//import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm implements java.io.Serializable {
    @NotNull
    @Length(min = 2, max = 20)
    // @NotBlank
    private String name; // 商品名
    @NotNull
    @Max(1000000)
    @Min(1)
    private Integer price; // 単価
    @NotNull
    @Min(0)
    @Max(1000)
    private Integer stock; // 在庫数
    @NotNull
    private Integer categoryId; // 商品カテゴリID
    @NotNull
    private MultipartFile imageURL; // 商品画像URL
    
   // private String imageFileName; // 商品画像ファイル名

    

}
