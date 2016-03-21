package pers.wenzi.datacenter.asserts;

import java.io.IOException;

import pers.wenzi.datacenter.batis.SessionFactory;
import pers.wenzi.datacenter.entity.Entity;
import pers.wenzi.datacenter.entity.PolicyEntity;

public class PolicyAssert {
  
  private String actProductId;
  private String actPackageDefId;
  private String actCampaignDefId;
  private String expProductId;
  private String expPackageDefId;
  private String expCampaignDefId;
  
  public PolicyAssert() {
    
    
    
  }
  
  public String AssertToString(String checkObj, String actValue, String expValue, String result) {
    
    return new String(checkObj + "实际结果:" + actValue + "; 预期结果：" + expValue + "; " + result);
    
  }
  
}
