package pers.wenzi.DataBank.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.wenzi.DataBank.util.CertinoUtil;

/**
 * 航空意外险测试数据初始化
 * 
 */

@Controller
public class GetData {
  
  // 银行卡盗刷资金损失保险-本人
  @RequestMapping("/GetData_YHDS")
  public String GetData_YHDS(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(18, 60));
    return "GetData";
    
  }
  
  // 多轴飞行器责任保险-本人
  @RequestMapping("/GetData_DZFX")
  public String GetData_DZFX(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(18, 70));
    return "GetData";
   
  }
  
  // 个人法律费用补偿保险-本人
  @RequestMapping("/GetData_FLFY")
  public String GetData_FLFY(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(18, 99));
    return "GetData";
  
  }
  
  // 亲子旅行意外伤害保险-本人+子女
  @RequestMapping("/GetData_QZLX")
  public String GetData_QZLX(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(18, 65, "female"));
    model.put("kid", certi.getRandomCertiCode(1, 18));
    return "GetData";

  }
  
  // 驴友旅行意外伤害保险-本人+子女
  @RequestMapping("/GetData_LYLX")
  public String GetData_LYLX(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode());
    return "GetData";

  }
  
  // 航空意外险-本人
  @RequestMapping("/GetData_HKYW")
  public String GetData_HKYW(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData";
    
  }
  
  // 营运交通意外险-本人
  @RequestMapping("/GetData_YYJT")
  public String GetData_YYJT(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData";
   
  }
  
  // 公共场所意外险-本人
  @RequestMapping("/GetData_GGCS")
  public String GetData_GGCS(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData";
  
  }
  
  // 私家车意外险-本人
  @RequestMapping("/GetData_SJC")
  public String GetData_SJC(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData";
  
  }
  
  // 成人重大疾病保险-本人
  @RequestMapping("/GetData_CRZJ")
  public String GetData_CRZJ(Map<String, String> model) {
 
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(18, 45));
    return "GetData";
 
  }
  
  // 女性特定疾病保险-本人
  @RequestMapping("/GetData_NXJB")
  public String GetData_NXJB(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(18, 45, "female"));
    return "GetData";

  }
  
  // 未成年重大疾病保险-子女
  @RequestMapping("/GetData_ETZJ")
  public String GetData_ETZJ(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(1, 17));
    return "GetData";
  
  }
  
  // 儿童齿科医疗保险-子女
  @RequestMapping("/GetData_ETCK")
  public String GetData_ETCK(Map<String, String> model) {
 
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(4, 15));
    return "GetData";
 
  }
  
  // 母婴健康保险-本人
  @RequestMapping("/GetData_MYJK")
  public String GetData_MYJK(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode(20, 35, "female"));
    return "GetData";

  }
  
}
