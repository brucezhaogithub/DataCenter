package pers.wenzi.datacenter.web;

import static pers.wenzi.datacenter.util.ProductUtil.getValue;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pers.wenzi.datacenter.util.CertiUtil;

/**
 * 所有产品数据初始化  
 * 
 */

@Controller
@RequestMapping(value="/getdata")
public class GetData {
  
  CertiUtil certi = new CertiUtil();
  
  // 银行卡盗刷资金损失保险-本人
  @RequestMapping(value="/yhds")
  public String GetData_YHDS(Map<String, String> model) {
    
    model.put("title", "初始化参数-银行卡盗刷资金损失保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    return "getdata";
    
  }
  
  // 多轴飞行器责任保险-本人
  @RequestMapping(value="/dzfx")
  public String GetData_DZFX(Map<String, String> model) {
   
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-多轴飞行器责任保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
   
  }
  
  // 个人法律费用补偿保险-本人
  @RequestMapping(value="/flfy")
  public String GetData_FLFY(Map<String, String> model) {
  
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-个人法律费用补偿保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 85));
    return "getdata";
  
  }
  
  // 亲子旅行意外伤害保险-本人+子女
  @RequestMapping(value="/qzlx")
  public String GetData_QZLX(Map<String, String> model) {

    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-亲自履行意外伤害保险");
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65, "female"));
    model.put("kid", certi.getRandomCertiCode(1, 18));
    return "getdata";

  }
  
  // 驴友旅行意外伤害保险-本人+子女
  @RequestMapping(value="/lylx")
  public String GetData_LYLX(Map<String, String> model) {

    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-驴友旅行意外伤害保险");
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    model.put("kid", certi.getRandomCertiCode(18, 60));
    return "getdata";

  }
  
  // 航空意外险-本人
  @RequestMapping(value="/hkyw")
  public String GetData_HKYW(Map<String, String> model) {
    
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-航空意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
    
  }
  
  // 营运交通意外险-本人
  @RequestMapping(value="/yyjt")
  public String GetData_YYJT(Map<String, String> model) {
   
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-营运交通意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
   
  }
  
  // 公共场所意外险-本人
  @RequestMapping(value="/ggcs")
  public String GetData_GGCS(Map<String, String> model) {
  
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-公共场所意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 私家车意外险-本人
  @RequestMapping(value="/sjc")
  public String GetData_SJC(Map<String, String> model) {
  
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-私家车意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 成人重大疾病保险-本人
  @RequestMapping(value="/crzj")
  public String GetData_CRZJ(Map<String, String> model) {
 
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-成人重大疾病保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 45));
    return "getdata";
 
  }
  
  /*
   * 女性特定疾病保险
   * 与投保人关系：本人
   */
  @RequestMapping(value="/nxjb")
  public String getProduct001(Map<String, String> model) {
    
    CertiUtil certi = new CertiUtil();
    model.put("title",    getValue("nxjb.title"));
    model.put("relation", getValue("nxjb.relation"));
    model.put("tbrName",  getValue("nxjb.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(getValue("nxjb.tbrMinAge")), 
                          Integer.valueOf(getValue("nxjb.tbrMaxAge")), 
                          "female"));
    model.put("tbrPhone", getValue("nxjb.tbrPhone"));
    model.put("tbrEmail", getValue("nxjb.tbrEmail"));
    model.put("url",      getValue("nxjb.url"));
    return "getdata";
    
  }
  
  /*
   * 未成年人重大疾病保险
   * 产品版型：经典
   * 与投保人关系：子女
   */
  @RequestMapping(value="/etzj", method=RequestMethod.GET)
  public String getProduct002(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="1") String minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="17") String maxAge) {
  
    CertiUtil   certi = new CertiUtil();
    model.put("title",    getValue("etzj.plana.title"));
    model.put("relation", getValue("etzj.plana.relation"));
    model.put("tbrName",  getValue("etzj.plana.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(getValue("etzj.plana.tbrMinAge")), 
                          Integer.valueOf(getValue("etzj.plana.tbrMaxAge"))));
    model.put("tbrPhone", getValue("etzj.plana.tbrPhone"));
    model.put("tbrEmail", getValue("etzj.plana.tbrEmail"));
    model.put("bbrName",  getValue("etzj.plana.bbrName"));
    model.put("bbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(getValue("etzj.plana.bbrMinAge")), 
                          Integer.valueOf(getValue("etzj.plana.bbrMaxAge"))));
    model.put("bbrPhone", getValue("etzj.plana.bbrPhone"));
    model.put("url",      getValue("etzj.plana.url"));
    return "getdata";
  
  }
  
  // 儿童齿科医疗保险-子女
  @RequestMapping(value="/etck")
  public String GetData_ETCK(Map<String, String> model) {
 
    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-儿童齿科医疗保险");
    model.put("relation", "子女");
    model.put("tbrCerti", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(4, 15));
    return "getdata";
 
  }
  
  // 母婴健康保险-本人
  @RequestMapping(value="/myjk")
  public String GetData_MYJK(Map<String, String> model) {

    CertiUtil certi = new CertiUtil();
    model.put("title", "初始化参数-母婴健康保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(20, 35, "female"));
    return "getdata";

  }
  
}
