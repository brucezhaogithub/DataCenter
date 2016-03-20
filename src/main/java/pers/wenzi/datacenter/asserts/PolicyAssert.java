package pers.wenzi.datacenter.asserts;

import java.io.IOException;

import pers.wenzi.datacenter.batis.SessionFactory;
import pers.wenzi.datacenter.entity.Entity;
import pers.wenzi.datacenter.entity.PolicyEntity;

public class PolicyAssert {
  
  private String expProductId;
  private String expPackageDefId;
  private String expCampaignDefId;
  private String actPolicyId;
  private String actPolicyNo;
  private String actProductId;
  private String actPackageDefId;
  private String actCampaignDefId;
  
  public PolicyAssert(String checkName, String policyNo) {
    
    this.actPolicyNo = policyNo;
    if ("OnlineNXJB".equals(checkName)) { setValueForOnlineNXJB(); }
    
  }
  
  private void setValueForOnlineNXJB() {
    
    Entity entity         = new PolicyEntity();
    String stmt           = "pers.wenzi.datacenter.mapper.PolicyMapper.selectPolicy";
    entity                = SessionFactory.getSessionEntity(entity, stmt, this.actPolicyNo);
    this.actPolicyId      = entity.getPolicyId();
    this.actProductId     = entity.getProductId();
    this.actPackageDefId  = entity.getPackageDefId();
    this.actCampaignDefId = entity.getCampaignDefId();
    this.expProductId     = "";
    this.expPackageDefId  = "";
    this.expCampaignDefId = "";
    
  }
  
  
  
  public String AssertToString() {
    
    String msg = null;
    return msg;
    
  }
  
}
