package com.fullness.ec.uc010.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

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
    public static String createBase64ImageString(MultipartFile file) {
        try{
            StringBuilder sb = new StringBuilder();
            // data URIスキームのプレフィックスを付与
            sb.append("data:image/");
            // Content-Type から拡張子部分を取得("image/png" -> "png")
            sb.append(file.getContentType().split("/")[1]);
            // Base64エンコードであることを示すセパレータを追加
            sb.append(";base64,");
            // ファイル内容を読み込み、Base64文字列に変換して追加
            sb.append(Base64.getEncoder().encodeToString(file.getBytes()));
            // 完成した data URI を返却
            return sb.toString();
        }catch(IOException e){
            throw new RuntimeException("画像のBase64エンコードに失敗しました。", e);
        }
    }
     public static String uploadFile(String fileName, byte[] fileBytes) {
        // 保存先の絶対パスを組み立てる（例: .../src/main/resources/static/img/ファイル名）
        String filePath = new File("src/main/resources/static/images").getAbsolutePath()
                        + File.separator + fileName;
        FileOutputStream fos = null;
        try{
            // ファイル出力ストリームを生成し、バイト配列の内容を書き込む
            fos = new FileOutputStream(filePath);
            fos.write(fileBytes);
            // 保存したファイル名を返却（UUIDなどでリネームする場合はここを変更する）
            return fileName;
        }catch(FileNotFoundException e){
            // 保存先フォルダが存在しないなど、ファイルが見つからない場合の例外
            throw new RuntimeException("画像の保存先フォルダが見つかりません。", e);
        }catch(IOException e) {
            // 書き込み処理に失敗した場合の例外
            throw new RuntimeException("画像の保存に失敗しました。", e);
        }finally {
            try {
                // FileOutputStream を確実にクローズしてリソースリークを防ぐ
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                // close() に失敗した場合も例外をラップして通知
                throw new RuntimeException("ファイルのクローズに失敗しました。", e);
            }
        }
    }
}