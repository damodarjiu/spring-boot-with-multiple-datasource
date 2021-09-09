package com.multiple.datasource.controller.policy;

import com.multiple.datasource.dto.policy.*;
import com.multiple.datasource.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policy")
public class PolicyController {

  @Autowired private IPolicy policy;

  @PostMapping(value = "/savepolicy", consumes = "application/json", produces = "application/json")
  public String savePolicy(@RequestBody PolicyDto policyDto) {
    policy.savePolicy(policyDto);
    return "Policy details saved!!";
  }
}
