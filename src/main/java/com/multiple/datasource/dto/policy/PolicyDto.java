package com.multiple.datasource.dto.policy;

import java.time.*;

import lombok.*;

@Data
public class PolicyDto {
  private Long policyId;

  private String policyType;

  private LocalDateTime createdAt;
}
