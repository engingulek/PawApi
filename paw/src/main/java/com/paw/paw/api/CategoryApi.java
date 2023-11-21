package com.paw.paw.api;


import com.paw.paw.business.abstracts.CategoryService;
import com.paw.paw.core.DataResult;
import com.paw.paw.entities.dtos.CategoryWithServiceDtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryApi {
    private CategoryService categoryService;

    @Autowired
    public  CategoryApi(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/getCategories")
    public DataResult<List<CategoryWithServiceDtos>> getCategories() {
        return  this.categoryService.getCategories();
    }
}
