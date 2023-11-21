package com.paw.paw.dataAccess;

import com.paw.paw.entities.concretes.Category;
import com.paw.paw.entities.dtos.CategoryWithServiceDtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {
    // Fetch Categories
    @Query(value = "Select new com.paw.paw.entities.dtos.CategoryWithServiceDtos(c.id,c.category) From Category as c")
    List<CategoryWithServiceDtos> getCateggories();

}
