package pers.wenzi.datacenter.dao;

import pers.wenzi.datacenter.model.Actual;

public interface PolicyDao {
  
  public Actual selectPolicy(String policyNo);
  
}
