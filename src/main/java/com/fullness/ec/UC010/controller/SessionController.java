package com.fullness.ec.uc010.controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.groovy.tools.shell.IO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.multipart.MultipartFile;
import com.fullness.ec.uc010.entity.Product;
import com.fullness.ec.uc010.entity.ProductCategory;
import com.fullness.ec.uc010.form.ProductForm;
import com.fullness.ec.uc010.helper.ProductHelper;
import com.fullness.ec.uc010.service.ProductService;

@Controller
@RequestMapping("admin/product/add")
@SessionAttributes({"productForm","categoryList"})
public class SessionController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductHelper productHelper;

    /** productForm をセッションに格納 */
    @ModelAttribute("productForm")
    public ProductForm setupForm() {
        return new ProductForm();
    }

    /** カテゴリ一覧を Model に格納（セッションには入れない） */
    @ModelAttribute("categoryList")
    public List<ProductCategory> categoryList() {
        return productService.getProductCategories();
    }

    /** 入力画面表示 */
    @GetMapping
    public String input(Model model) {
        return "view/admin/product/add/input";
    }

    /** 確認画面表示 */
    @PostMapping("confirm")
    public String confirm(@Validated ProductForm form, BindingResult result, Model model) 
    throws IOException {
        if (result.hasErrors()) {
            return "view/admin/product/add/input";
        }

        ProductCategory category = productService.getProductCategoryById(form.getCategoryId());
        if (category != null) {
            model.addAttribute("categoryName", category.getName());
        }
        byte[] fileBytes = form.getImageURL().getBytes();
        String url = productHelper.uploadFile(form.getImageURL().getOriginalFilename(),fileBytes);
        model.addAttribute("imageFileName", form.getImageURL().getOriginalFilename());

        return "view/admin/product/add/confirm";
    }

    /** 登録処理（PRGパターン） */
    @PostMapping("register")
    public String register(ProductForm form, RedirectAttributes ra) {
        productService.addProduct(productHelper.convert(form));
        ra.addFlashAttribute("completed", true);
        return "redirect:/admin/product/add/complete";
    }

    /** 完了画面表示 */
    @GetMapping("complete")
    public String complete(ProductForm form, SessionStatus status, Model model) {
        // if (!model.containsAttribute("completed")) {
        //     return "redirect:/admin/product/add/input";
        // }
        model.addAttribute("addProductName", form.getName());
        status.setComplete();
        return "view/admin/product/add/complete";
    }

    /** 戻るボタン対応 */
    @PostMapping("back")
    public String back() {
        return "redirect:/admin/product/add/input";
    }
}
