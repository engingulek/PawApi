package com.paw.paw.business.concretes;

import com.paw.paw.business.abstracts.CategoryService;
import com.paw.paw.core.DataResult;
import com.paw.paw.core.SuccessDataResult;
import com.paw.paw.dataAccess.CategoryDao;
import com.paw.paw.entities.dtos.CategoryWithServiceDtos;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;

    @Autowired
    public  CategoryManager(CategoryDao categoryDao){
        super();
        this.categoryDao = categoryDao;
    }
    @Override
    public DataResult<List<CategoryWithServiceDtos>> getCategories() {
        return new SuccessDataResult<List<CategoryWithServiceDtos>>(this.categoryDao.getCateggories(),"Data Listed");
    }
}
