package com.multiple.datasource.model.policy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

import lombok.Data;

@Table(name = "policy")
@Entity
@Data
public class Policy {
  @Id
  @Column(name = "policy_id")
  private Long policyId;

  @Column(name = "policy_type")
  private String policyType;

  @Column(name = "created_at")
  private LocalDateTime createdAt;
}
