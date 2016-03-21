package pers.wenzi.datacenter.asserts;

public class PolicyAssert {
  
  private String expProductId;
  private String expPackageDefId;
  private String expCampaignDefId;
  
  public PolicyAssert() {
    
    
    
  }
  
  
  
  public String AssertToString(String checkObj, String actValue, String expValue, String result) {
    
    return new String(checkObj + "实际结果:" + actValue + "; 预期结果：" + expValue + "; " + result);
    
  }
  
}
