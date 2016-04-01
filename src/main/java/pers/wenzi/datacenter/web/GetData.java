package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pers.wenzi.datacenter.product.Product100002;
import pers.wenzi.datacenter.util.CertiUtil;

/**
 * 所有产品数据初始化  
 * 
 */

@Controller
@RequestMapping(value="/getdata")
@EnableConfigurationProperties(Product100002.class)
public class GetData {
  
  @Autowired
  private Product100002 product100002;
  
  /*
   * 女性特定疾病保险
   */
  @RequestMapping(value="/nxjb")
  public String getDataProduct100002(Map<String, String> model) {
    
    CertiUtil certi = new CertiUtil();
    model.put("title",    product100002.getTitle());
    model.put("relation", product100002.getRelation());
    model.put("tbrName",  product100002.getTbrName());
    model.put("tbrCerti", certi.getRandomCertiCode(
                          product100002.getTbrMinAge(), 
                          product100002.getTbrMaxAge(), 
                          "female"));
    model.put("tbrPhone", product100002.getTbrPhone());
    model.put("tbrEmail", product100002.getTbrEmail());
    model.put("bbrName",  product100002.getBbrName());
    model.put("bbrCerti", certi.getRandomCertiCode(
                          product100002.getBbrMinAge(), 
                          product100002.getBbrMaxAge(), 
                          "female"));
    model.put("bbrPhone", product100002.getBbrPhone());
    model.put("url",      product100002.getUrl());  
    return "getdata";
    
  }
  
  // 银行卡盗刷资金损失保险-本人
  @RequestMapping(value="/yhds")
  public String GetData_YHDS(Map<String, String> model) {
    
    CertiUtil certi = new CertiUtil();
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
  
  // 女性特定疾病保险-本人
  @Deprecated
  @RequestMapping(value="/nxjb0325", method=RequestMethod.GET)
  public String GetData_NXJB(Map<String, Object> model, 
      @RequestParam(value="minAge", required=false, defaultValue="19") String minAge, 
      @RequestParam(value="maxAge", required=false, defaultValue="45") String maxAge) {
    
    CertiUtil   certi = new CertiUtil();
    final String  url   = "http://www.zhongan.com:6080/channel/product/productDetail_100002.html";
    model.put("title", "初始化参数-女性特定疾病保险");
    model.put("tbrCerti", certi.getRandomCertiCode(
        Integer.valueOf(minAge), 
        Integer.valueOf(maxAge), 
        "female"));
    model.put("tbrPhone", "13108130001");
    model.put("tbrEmail", "13108130001@qq.com");
    model.put("relation", "本人");
    model.put("url", url);
    return "getdata";

  }
  
  // 未成年人重大疾病保险-子女
  @RequestMapping(value="/etzj", method=RequestMethod.GET)
  public String GetData_ETZJ(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="1") String minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="17") String maxAge) {
  
    CertiUtil   certi = new CertiUtil();
    final String  url   = "http://www.zhongan.com:6080/channel/product/productDetail_100001.html";
    model.put("title", "初始化参数-未成年人重大疾病保险");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    model.put("tbrPhone", "13108130002");
    model.put("tbrEmail", "13108130002@qq.com");
    model.put("relation", "子女");
    model.put("bbrCerti", certi.getRandomCertiCode(
        Integer.valueOf(minAge), 
        Integer.valueOf(maxAge)));
    model.put("bbrPhone", "13108130002");
    model.put("url", url);
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
