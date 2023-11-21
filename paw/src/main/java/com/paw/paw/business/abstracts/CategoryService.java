package com.paw.paw.business.abstracts;

import com.paw.paw.core.DataResult;
import com.paw.paw.entities.dtos.CategoryWithServiceDtos;

import java.util.List;

public interface CategoryService {

    DataResult<List<CategoryWithServiceDtos>> getCategories();

}
