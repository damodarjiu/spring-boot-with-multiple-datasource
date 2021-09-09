package com.multiple.datasource.repository.policy;

import com.multiple.datasource.model.policy.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {}
