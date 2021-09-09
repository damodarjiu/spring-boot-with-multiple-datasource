package com.multiple.datasource.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Table(name = "product")
@Entity
@Data
public class Product {
  @Id
  @Column(name = "product_id")
  private Integer productId;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "product_desc")
  private String productDesc;
}
