package com.ccstudy.qna.controller;

import com.ccstudy.qna.dto.LikeReqDto;
import com.ccstudy.qna.service.DressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class DressController {

    private final DressService dressService;

    public DressController(DressService dressService) {
        this.dressService = dressService;
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("brandList", dressService.getAllBrandList());
        return "index";
    }

    @GetMapping("/{idx}")
    public String viewProduct(Model model, @PathVariable(value = "idx") final int idx) {
        model.addAttribute("productList", dressService.getAllBrandProductList(idx));
        return "products";
    }

    @GetMapping("/likeSave/{idx}")
    public String saveLike(@PathVariable(value = "idx") final int idx) {
        dressService.saveLike(idx);
        return "redirect:/like";
    }

    @GetMapping("/like")
    public String viewProduct(Model model) {
        model.addAttribute("likeList", dressService.getAllLikeProductList());
        return "list";
    }

}
