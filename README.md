# Fullness Stationary社 文具/雑貨販売システム

## チームメンバー
- リーダー: [棟方勇志]
- テクニカルリーダー: [佐藤楓]
- メンバー: [柏倉颯太]
- メンバー: [山根ティノ]
- メンバー: [田中雅鈴]



## チームの目標
・議論を避けない
・初期フェーズまでやりきる

## チームのルール
・1時間ごとに報告する


## コーディング規約

### 基本規約

本システムのコーディング規約は基本的には[オブジェクト倶楽部版 Java コーディング規約](http://objectclub.jp/community/codingstandard/CodingStd.pdf)に準ずる

### URL一覧
画⾯名|コントローラー|メソッド|ビュー(HTTPメソッド)
---|---|---|---
[UC009:担当者アカウント登録（入力）画面(BP003)](http://localhost:8080/admin/account/form)|MenuController|form|view/admin/accoumt/form.html(POST)
[UC009:担当者アカウント登録（確認）画面(BP004)](http://localhost:8080/admin/account/confirm)|EmployeeAccountController|confirm|view/admin/account/confirm.html(POST)
[UC009:担当者アカウント登録（完了）画面(BP005)](http://localhost:8080/admin/account/complete)|EmployeeAccountController|execute|(POST)
[UC009:担当者アカウント登録（完了）画面(BP005)](http://localhost:8080/admin/account/complete)|EmployeeAccountController|complete|view/admin/account/complete.html(GET)
[UC010:新商品登録(⼊⼒)画⾯](http://localhost:8080/admin/product/add)|SessionController|form|view/admin/product/add/input.html(GET)
[UC010:新商品登録(確認)画⾯](http://localhost:8080/admin/product/add/confirm)|SessionController|confirm|view/admin/product/add/confirm.html(POST)
[UC010:新商品登録(完了)画⾯](http://localhost:8080/admin/product/add/complete)|SessionController|complete|view/admin/product/add/complete.html(GET)
[UC011 商品検索](http://127.0.0.1:8080/admin/product) | SearchController | Search | view/admin/search/search.html(GET) | get |
[UC011 商品検索結果](http://127.0.0.1:8080/admin/product) | SearchController | Search(Pageable pageable, Model model,int categoryId) | view/admin/search/search.html(POST) | post |
[UC012 商品修正入力](http://127.0.0.1:8080/admin/product/edit/{productId}) | UpdateController| form(Model model,int productId) | view/admin/update/form.html(GET) | get |
[UC012 商品修正確認](http://127.0.0.1:8080/admin/product/edit/confirm) | UpdateController | confirm(Model model) | view/admin/update/confirm.html(POST) | post |
[UC012 商品修正リダイレクト](http://127.0.0.1:8080/admin/product/edit/execute) | UpdateController | execute(RedirectAttributes redirectAttributes) | post | post |
[UC012 商品修正完了](http://127.0.0.1:8080/admin/product/edit/complete) | UpdateController | complete(SessionStatus sessionStatus) | view/admin/update/complete.html(GET) | get |
[UC013:商品削除（確認）画面(BP007)](http://localhost:8080/admin/product/delete/{productId})|ProductDeleteController|confirm|view/admin/delete/confirm.html(POST)
[UC013:商品削除（完了）画面(BP008)](http://localhost:8080/admin/product/delete/complete)|ProductDeleteController|execute|(POST)
[UC013:商品削除（完了）画面(BP008)](http://localhost:8080/admin/product/delete/complete)|ProductDeleteController|complete|view/admin/delete/complete.html(GET)
[UC014:商品カテゴリ登録(入力)画面](http://localhost:8080/admin/product-category-add)|ProductCategoryController|input|view/admin/product-category-add/input.html(GET)
[UC014:商品カテゴリ登録(確認)画面](http://localhost:8080/admin/product-category-add/confirm)|ProductCategoryController|confirm|view/admin/product-category-add/confirm.html(POST)
[UC014:商品カテゴリ登録(完了)画面](http://localhost:8080/admin/product-category-add/complete)|ProductCategoryController|execute|view/admin/product-category-add/complete.html(POST)
[UC014:商品カテゴリ登録(完了)画面](http://localhost:8080/admin/product-category-add/complete)|ProductCategoryController|complete|view/admin/product-category-add/complete.html(GET)
[UC017:担当者ログイン画⾯](http://localhost:8080/admin/login)|LoginController|login|view/login.html(POST)
[UC017:メニュー画⾯（ログイン後）](http://localhost:8080/admin)|LoginController|menu|view/menu.html(POST)
[UC018:メニュー画⾯（未ログイン時）](http://localhost:8080/admin)|LoginController|menu|view/menu.html(POST)