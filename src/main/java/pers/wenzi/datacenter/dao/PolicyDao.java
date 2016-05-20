package pers.wenzi.datacenter.dao;

import pers.wenzi.datacenter.model.Policy;

public interface PolicyDao {
  
  public Policy selectPolicy(String policyNo);
  
}
