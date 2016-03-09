package pers.wenzi.DataBank.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.wenzi.DataBank.util.CertinoUtil;

/**
 * 所有产品数据初始化
 * 
 */

@Controller
public class GetData {
  
  // 银行卡盗刷资金损失保险-本人
  @RequestMapping("/GetData_YHDS")
  public String GetData_YHDS(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    return "getdata";
    
  }
  
  // 多轴飞行器责任保险-本人
  @RequestMapping("/GetData_DZFX")
  public String GetData_DZFX(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
   
  }
  
  // 个人法律费用补偿保险-本人
  @RequestMapping("/GetData_FLFY")
  public String GetData_FLFY(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 85));
    return "getdata";
  
  }
  
  // 亲子旅行意外伤害保险-本人+子女
  @RequestMapping("/GetData_QZLX")
  public String GetData_QZLX(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65, "female"));
    model.put("kid", certi.getRandomCertiCode(1, 18));
    return "getdata";

  }
  
  // 驴友旅行意外伤害保险-本人+子女
  @RequestMapping("/GetData_LYLX")
  public String GetData_LYLX(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    model.put("kid", certi.getRandomCertiCode(18, 60));
    return "getdata";

  }
  
  //驴友旅行意外伤害保险-本人+父母+配偶+子女
  @RequestMapping("/GetData_LYLX_4PERSON")
  public String GetData_LYLX_4PERSON(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人+配偶+父母+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    model.put("spouse", certi.getRandomCertiCode(18, 65, "female"));
    model.put("parent", certi.getRandomCertiCode(40, 70));
    model.put("kid", certi.getRandomCertiCode(1, 18));
    return "getdata";

  }
  
  // 航空意外险-本人
  @RequestMapping("/GetData_HKYW")
  public String GetData_HKYW(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
    
  }
  
  // 营运交通意外险-本人
  @RequestMapping("/GetData_YYJT")
  public String GetData_YYJT(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
   
  }
  
  // 公共场所意外险-本人
  @RequestMapping("/GetData_GGCS")
  public String GetData_GGCS(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 私家车意外险-本人
  @RequestMapping("/GetData_SJC")
  public String GetData_SJC(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 成人重大疾病保险-本人
  @RequestMapping("/GetData_CRZJ")
  public String GetData_CRZJ(Map<String, String> model) {
 
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 45));
    return "getdata";
 
  }
  
  // 女性特定疾病保险-本人
  @RequestMapping("/GetData_NXJB")
  public String GetData_NXJB(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 45, "female"));
    return "getdata";

  }
  
  // 未成年重大疾病保险-子女
  @RequestMapping("/GetData_ETZJ")
  public String GetData_ETZJ(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "子女");
    model.put("tbrCerti", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(1, 17));
    return "getdata";
  
  }
  
  // 儿童齿科医疗保险-子女
  @RequestMapping("/GetData_ETCK")
  public String GetData_ETCK(Map<String, String> model) {
 
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "子女");
    model.put("tbrCerti", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(4, 15));
    return "getdata";
 
  }
  
  // 母婴健康保险-本人
  @RequestMapping("/GetData_MYJK")
  public String GetData_MYJK(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(20, 35, "female"));
    return "getdata";

  }
  
}
