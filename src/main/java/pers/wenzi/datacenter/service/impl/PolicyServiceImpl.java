package pers.wenzi.datacenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.wenzi.datacenter.dao.PolicyDao;
import pers.wenzi.datacenter.model.Actual;
import pers.wenzi.datacenter.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
  
  @Autowired
  private PolicyDao policyDao;
  
  @Override
  public Actual selectPolicy(String policyNo) {
    // TODO Auto-generated method stub
    return policyDao.selectPolicy(policyNo);
    
  }
  
}
