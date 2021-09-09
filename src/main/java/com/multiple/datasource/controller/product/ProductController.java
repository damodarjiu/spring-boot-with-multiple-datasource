package com.multiple.datasource.controller.product;

import com.multiple.datasource.dto.product.*;
import com.multiple.datasource.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired private IProduct product;

  @PostMapping(value = "/saveproduct", consumes = "application/json", produces = "application/json")
  public String savePolicy(@RequestBody ProductDto productDto) {
    product.saveProduct(productDto);
    return "Product details saved!!";
  }
}
