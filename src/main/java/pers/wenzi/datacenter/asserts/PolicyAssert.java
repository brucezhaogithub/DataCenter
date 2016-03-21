package pers.wenzi.datacenter.asserts;

import pers.wenzi.datacenter.batis.SessionFactory;
import pers.wenzi.datacenter.entity.Entity;
import pers.wenzi.datacenter.util.ProductList;

public class PolicyAssert {
  
  public PolicyAssert(Entity entity,String stmt, String param, int channelId, String productName) {
    
    entity = SessionFactory.getSessionEntity(entity, stmt, param);
    if (channelId == 90) {
      if ("nxjb".equals(productName)) {
        
      }
    }
    
    if (channelId == 94) {
      
    }
    
  }
  
  
  
  public String AssertToString(String checkObj, String actValue, String expValue, String result) {
    
    return new String(checkObj + "实际结果:" + actValue + "; 预期结果：" + expValue + "; " + result);
    
  }
  
}
