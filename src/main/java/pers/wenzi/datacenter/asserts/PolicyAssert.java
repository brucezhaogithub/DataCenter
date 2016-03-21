package pers.wenzi.datacenter.asserts;

public class PolicyAssert {
  
  /*
   * 文本验证
   */
  public static String AssertToString(String title, String actValue, String expValue) {
    
    String msg = title + " | 实际结果:" + actValue + " | 预期结果：" + expValue;
    if (actValue.equals(expValue)) {
      msg = msg + " | 验证通过！";
    }else {
      msg = msg + " | 验证失败！";
    }
    return msg;
    
  }
  
}
