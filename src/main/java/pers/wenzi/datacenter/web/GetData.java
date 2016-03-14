package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pers.wenzi.datacenter.util.CertinoUtil;

/**
 * 所有产品数据初始化  
 * 
 */

@Controller
@RequestMapping(value="/GetData")
public class GetData {
  
  // 银行卡盗刷资金损失保险-本人
  @RequestMapping(value="/YHDS")
  public String GetData_YHDS(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    return "getdata";
    
  }
  
  // 多轴飞行器责任保险-本人
  @RequestMapping(value="/DZFX")
  public String GetData_DZFX(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
   
  }
  
  // 个人法律费用补偿保险-本人
  @RequestMapping(value="/FLFY")
  public String GetData_FLFY(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 85));
    return "getdata";
  
  }
  
  // 亲子旅行意外伤害保险-本人+子女
  @RequestMapping(value="/QZLX")
  public String GetData_QZLX(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65, "female"));
    model.put("kid", certi.getRandomCertiCode(1, 18));
    return "getdata";

  }
  
  // 驴友旅行意外伤害保险-本人+子女
  @RequestMapping(value="/LYLX")
  public String GetData_LYLX(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    model.put("kid", certi.getRandomCertiCode(18, 60));
    return "getdata";

  }
  
  // 航空意外险-本人
  @RequestMapping(value="/HKYW")
  public String GetData_HKYW(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
    
  }
  
  // 营运交通意外险-本人
  @RequestMapping(value="/YYJT")
  public String GetData_YYJT(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
   
  }
  
  // 公共场所意外险-本人
  @RequestMapping(value="/GGCS")
  public String GetData_GGCS(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 私家车意外险-本人
  @RequestMapping(value="/SJC")
  public String GetData_SJC(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 成人重大疾病保险-本人
  @RequestMapping(value="/CRZJ")
  public String GetData_CRZJ(Map<String, String> model) {
 
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 45));
    return "getdata";
 
  }
  
  // 女性特定疾病保险-本人
  @RequestMapping(value="/NXJB", method=RequestMethod.GET)
  public String GetData_NXJB(Map<String, Object> model, 
      @RequestParam(value="minAge", required=false, defaultValue="18") String minAge, 
      @RequestParam(value="maxAge", required=false, defaultValue="45") String maxAge) {
    
    CertinoUtil certi = new CertinoUtil();
    String url = "http://www.zhongan.com:6080/channel/product/productDetail_100002.html";
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(
            Integer.valueOf(minAge).intValue(), 
            Integer.valueOf(maxAge).intValue(), 
            "female"));
    model.put("url", url);
    return "getdata";

  }
  
  // 未成年重大疾病保险-子女
  @RequestMapping(value="/ETZJ")
  public String GetData_ETZJ(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "子女");
    model.put("tbrCerti", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(1, 17));
    return "getdata";
  
  }
  
  // 儿童齿科医疗保险-子女
  @RequestMapping(value="/ETCK")
  public String GetData_ETCK(Map<String, String> model) {
 
    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "子女");
    model.put("tbrCerti", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(4, 15));
    return "getdata";
 
  }
  
  // 母婴健康保险-本人
  @RequestMapping(value="/MYJK")
  public String GetData_MYJK(Map<String, String> model) {

    CertinoUtil certi = new CertinoUtil();
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(20, 35, "female"));
    return "getdata";

  }
  
}
