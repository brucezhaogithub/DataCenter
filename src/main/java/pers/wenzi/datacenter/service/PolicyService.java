package pers.wenzi.datacenter.service;

import pers.wenzi.datacenter.model.Actual;

public interface PolicyService {
  
  public Actual selectPolicy(String policyNo);
  
}
