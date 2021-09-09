package com.multiple.datasource.repository.product;

import com.multiple.datasource.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {}
