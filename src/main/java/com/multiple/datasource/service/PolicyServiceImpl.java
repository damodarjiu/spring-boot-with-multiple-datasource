package com.multiple.datasource.service;

import com.multiple.datasource.dto.policy.*;
import com.multiple.datasource.model.policy.*;
import com.multiple.datasource.repository.policy.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class PolicyServiceImpl implements IPolicy {

  @Autowired private PolicyRepository policyRepository;

  @Override
  public void savePolicy(PolicyDto policyDto) {
    Policy policy = new Policy();
    policy.setPolicyId(policyDto.getPolicyId());
    policy.setPolicyType(policyDto.getPolicyType());
    policy.setCreatedAt(policyDto.getCreatedAt());
    policyRepository.save(policy);
  }
}
