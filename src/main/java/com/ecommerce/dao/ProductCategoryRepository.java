package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.entity.ProductCategory;

@CrossOrigin("http://localhost:4200") // this will allow JS code running in browser to access this rest
@RepositoryRestResource(collectionResourceRel="productCategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
