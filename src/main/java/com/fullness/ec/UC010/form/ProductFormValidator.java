// package com.fullness.ec.UC010.form;

// import org.springframework.stereotype.Component;
// import org.springframework.validation.Validator;
// import org.springframework.validation.Errors;

// @Component
// public class ProductFormValidator implements Validator {
// /**
// * Modelに格納されたオブジェクトが相関チェック対象かを確認する
// * true：相関チェック対象、false：対象外
// * ※ItemFormの記述を相関チェック対象クラスに変更する
// */
// @Override
// public boolean supports(Class<?> clazz) {
// return ItemForm.class.isAssignableFrom(clazz);
// }

// /**
// * object target=>相関チェック対象のインスタンス
// * Errors error=>エラーメッセージを格納する
// */
// @Override
// public void validate(Object target, Errors errors) {
// // 引数targetをItemForm型に変換する
// ItemForm itemForm = (ItemForm) target;
// // 商品名と単価がnullなら、チェックしない
// if (itemForm.getName() == null || itemForm.getPrice() == null) {
// return;
// }
// // 商品名がパソコンで価格が1000円未満の場合はエラー
// if ("パソコン".equals(itemForm.getName()) && itemForm.getPrice() < 1000) {
// // エラーメッセージの設定
// // message.propertiesに定義したメッセージキー
// errors.reject("com.example.demo.ItemForm.message");
// }
// }
// }
