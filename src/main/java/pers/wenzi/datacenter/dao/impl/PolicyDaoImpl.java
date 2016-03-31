package pers.wenzi.datacenter.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import pers.wenzi.datacenter.dao.PolicyDao;
import pers.wenzi.datacenter.model.Policy;
import pers.wenzi.datacenter.util.BatisUtil;

@Repository
public class PolicyDaoImpl implements PolicyDao {
  
  private SqlSession  session;
  
  @Override
  public Policy selectPolicy(String policyNo) {
    
    String stmt = "batis.PolicyMapper.selectPolicy";
    session = BatisUtil.openSession();
    return (Policy)session.selectOne(stmt, policyNo);
    
  }
  
}
