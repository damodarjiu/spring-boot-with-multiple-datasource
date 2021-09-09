package com.multiple.datasource.service;

import com.multiple.datasource.dto.product.*;
import com.multiple.datasource.model.product.*;
import com.multiple.datasource.repository.product.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class ProductServiceImpl implements IProduct {

  @Autowired private ProductRepository productRepository;

  @Override
  public void saveProduct(ProductDto productDto) {
    Product product = new Product();
    product.setProductId(productDto.getProductId());
    product.setProductDesc(productDto.getProductDesc());
    product.setProductName(productDto.getProductName());
    productRepository.save(product);
  }
}
