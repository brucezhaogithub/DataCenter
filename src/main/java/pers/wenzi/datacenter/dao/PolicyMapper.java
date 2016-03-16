package pers.wenzi.datacenter.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pers.wenzi.datacenter.entity.PolicyEntity;

@Repository
@Transactional
public interface PolicyMapper {

  public PolicyEntity getPolicy(String policyNo);
  
  public List<PolicyEntity> getPolicyAll();
  
  public void insertPolicy(PolicyEntity entity);
  
  public void deletePolicy(PolicyEntity entity);
  
  public void updatePolicy(PolicyEntity entity);
  
  public void selectPolicy(PolicyEntity entity);
  
}
