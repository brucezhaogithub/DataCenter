package pers.wenzi.datacenter.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pers.wenzi.datacenter.util.CertiUtil;
import pers.wenzi.datacenter.util.CertiUtil2;
import pers.wenzi.datacenter.util.InsuredUtil;

/**
 * 所有产品数据初始化  
 * 
 */

@Controller
@RequestMapping(value="/getdata")
public class GetData {
  
  private final static Logger logger = LoggerFactory.getLogger(GetData.class);
  InsuredUtil insured = new InsuredUtil();  // 初始化投被保人脚本数据
  CertiUtil   certi   = new CertiUtil();    // 初始化身份证号生成工具
  CertiUtil2  certi2  = new CertiUtil2();
  
  /*
   * 银行卡盗刷资金损失保险
   * 产品版型：经典版
   * 与投保人关系：本人
   */
  @RequestMapping(value="/yhds/plana")
  public String GetDataForYhdsPlana(Map<String, String> model) {
    
    model.put("title",    insured.getValue("yhds.plana.title"));
    model.put("relation", insured.getValue("yhds.plana.relation"));
    model.put("tbrName",  insured.getValue("yhds.plana.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("yhds.plana.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("yhds.plana.tbrMaxAge"))));
    model.put("tbrPhone", insured.getValue("yhds.plana.tbrPhone"));
    model.put("tbrEmail", insured.getValue("yhds.plana.tbrEmail"));
    model.put("url",      insured.getValue("yhds.plana.url"));
    logger.info("银行卡盗刷资金损失保险-经典版-数据获取完成");
    return "getdata";
    
  }
  
  /*
   * 银行卡盗刷资金损失保险
   * 产品版型：尊享版
   * 与投保人关系：本人
   */
  @RequestMapping(value="/yhds/planb")
  public String GetDataForYhdsPlanb(Map<String, String> model) {
    
    model.put("title",    insured.getValue("yhds.planb.title"));
    model.put("relation", insured.getValue("yhds.planb.relation"));
    model.put("tbrName",  insured.getValue("yhds.planb.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("yhds.planb.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("yhds.planb.tbrMaxAge"))));
    model.put("tbrPhone", insured.getValue("yhds.planb.tbrPhone"));
    model.put("tbrEmail", insured.getValue("yhds.planb.tbrEmail"));
    model.put("url",      insured.getValue("yhds.planb.url"));
    logger.info("银行卡盗刷资金损失保险-尊享版-数据获取完成");
    return "getdata";
    
  }
  
  /*
   * 银行卡盗刷资金损失保险
   * 产品版型：土豪版
   * 与投保人关系：本人
   */
  @RequestMapping(value="/yhds/planc")
  public String GetDataForYhdsPlanc(Map<String, String> model) {
    
    model.put("title",    insured.getValue("yhds.planc.title"));
    model.put("relation", insured.getValue("yhds.planc.relation"));
    model.put("tbrName",  insured.getValue("yhds.planc.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("yhds.planc.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("yhds.planc.tbrMaxAge"))));
    model.put("tbrPhone", insured.getValue("yhds.planc.tbrPhone"));
    model.put("tbrEmail", insured.getValue("yhds.planc.tbrEmail"));
    model.put("url",      insured.getValue("yhds.planc.url"));
    logger.info("银行卡盗刷资金损失保险-土豪版-数据获取完成");
    return "getdata";
    
  }
  
  // 多轴飞行器责任保险-本人
  @RequestMapping(value="/dzfx")
  public String GetData_DZFX(Map<String, String> model) {
    
    model.put("title", "初始化参数-多轴飞行器责任保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
   
  }
  
  // 个人法律费用补偿保险-本人
  @RequestMapping(value="/flfy")
  public String GetData_FLFY(Map<String, String> model) {
    
    model.put("title", "初始化参数-个人法律费用补偿保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 85));
    return "getdata";
  
  }
  
  // 亲子旅行意外伤害保险-本人+子女
  @RequestMapping(value="/qzlx")
  public String GetData_QZLX(Map<String, String> model) {
    
    model.put("title", "初始化参数-亲自履行意外伤害保险");
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65, "female"));
    model.put("kid", certi.getRandomCertiCode(1, 18));
    return "getdata";

  }
  
  // 驴友旅行意外伤害保险-本人+子女
  @RequestMapping(value="/lylx")
  public String GetData_LYLX(Map<String, String> model) {
    
    model.put("title", "初始化参数-驴友旅行意外伤害保险");
    model.put("relation", "本人+子女");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    model.put("kid", certi.getRandomCertiCode(18, 60));
    return "getdata";

  }
  
  // 航空意外险-本人
  @RequestMapping(value="/hkyw")
  public String GetData_HKYW(Map<String, String> model) {
    
    model.put("title", "初始化参数-航空意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 70));
    return "getdata";
    
  }
  
  // 营运交通意外险-本人
  @RequestMapping(value="/yyjt")
  public String GetData_YYJT(Map<String, String> model) {
    
    model.put("title", "初始化参数-营运交通意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
   
  }
  
  // 公共场所意外险-本人
  @RequestMapping(value="/ggcs")
  public String GetData_GGCS(Map<String, String> model) {
    
    model.put("title", "初始化参数-公共场所意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 私家车意外险-本人
  @RequestMapping(value="/sjc")
  public String GetData_SJC(Map<String, String> model) {
    
    model.put("title", "初始化参数-私家车意外险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 65));
    return "getdata";
  
  }
  
  // 成人重大疾病保险-本人
  @RequestMapping(value="/crzj")
  public String GetData_CRZJ(Map<String, String> model) {
    
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
    
    model.put("title",    insured.getValue("nxjb.title"));
    model.put("relation", insured.getValue("nxjb.relation"));
    model.put("tbrName",  insured.getValue("nxjb.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("nxjb.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("nxjb.tbrMaxAge")), 
                          "female"));
    model.put("tbrPhone", insured.getValue("nxjb.tbrPhone"));
    model.put("tbrEmail", insured.getValue("nxjb.tbrEmail"));
    model.put("url",      insured.getValue("nxjb.url"));
    logger.info("女性特定疾病保险-数据获取完成");
    return "getdata";
    
  }
  
  /*
   * 未成年人重大疾病保险
   * 产品版型：经典
   * 与投保人关系：子女
   */
  @RequestMapping(value="/etzj")
  public String getProduct002(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="1") String minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="17") String maxAge) {
    
    model.put("title",    insured.getValue("etzj.plana.title"));
    model.put("relation", insured.getValue("etzj.plana.relation"));
    model.put("tbrName",  insured.getValue("etzj.plana.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("etzj.plana.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("etzj.plana.tbrMaxAge"))));
    model.put("tbrPhone", insured.getValue("etzj.plana.tbrPhone"));
    model.put("tbrEmail", insured.getValue("etzj.plana.tbrEmail"));
    model.put("bbrName",  insured.getValue("etzj.plana.bbrName"));
    model.put("bbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("etzj.plana.bbrMinAge")), 
                          Integer.valueOf(insured.getValue("etzj.plana.bbrMaxAge"))));
    model.put("bbrPhone", insured.getValue("etzj.plana.bbrPhone"));
    model.put("url",      insured.getValue("etzj.plana.url"));
    return "getdata";
    
  }
  
  // 儿童齿科医疗保险-子女
  @RequestMapping(value="/etck")
  public String GetData_ETCK(Map<String, String> model) {
    
    model.put("title", "初始化参数-儿童齿科医疗保险");
    model.put("relation", "子女");
    model.put("tbrCerti", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(4, 15));
    return "getdata";
 
  }
  
  // 母婴健康保险-本人
  @RequestMapping(value="/myjk")
  public String GetData_MYJK(Map<String, String> model) {
    
    model.put("title", "初始化参数-母婴健康保险");
    model.put("relation", "本人");
    model.put("tbrCerti", certi.getRandomCertiCode(20, 35, "female"));
    return "getdata";

  }
  
  /*
   * 个人住院医疗保险
   * 产品版型：无社保
   * 与投保人关系：本人
   */
  @RequestMapping(value="/zyyl/plana")
  public String GetDataForZyylPlana(Map<String, String> model) {
    
    model.put("title",    insured.getValue("zyyl.plana.title"));
    model.put("relation", insured.getValue("zyyl.plana.relation"));
    model.put("tbrName",  insured.getValue("zyyl.plana.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("zyyl.plana.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("zyyl.plana.tbrMaxAge"))));
    model.put("tbrPhone", insured.getValue("zyyl.plana.tbrPhone"));
    model.put("tbrEmail", insured.getValue("zyyl.plana.tbrEmail"));
    model.put("url",      insured.getValue("zyyl.plana.url"));
    logger.info("个人住院医疗保险-无社保-数据获取完成");
    return "getdata";
    
  }
  
  /*
   * 个人住院医疗保险
   * 产品版型：有社保
   * 与投保人关系：本人
   */
  @RequestMapping(value="/zyyl/planb")
  public String GetDataForZyylPlanb(Map<String, String> model) {
    
    model.put("title",    insured.getValue("zyyl.planb.title"));
    model.put("relation", insured.getValue("zyyl.planb.relation"));
    model.put("tbrName",  insured.getValue("zyyl.planb.tbrName"));
    model.put("tbrCerti", certi.getRandomCertiCode(
                          Integer.valueOf(insured.getValue("zyyl.planb.tbrMinAge")), 
                          Integer.valueOf(insured.getValue("zyyl.planb.tbrMaxAge"))));
    model.put("tbrPhone", insured.getValue("zyyl.planb.tbrPhone"));
    model.put("tbrEmail", insured.getValue("zyyl.planb.tbrEmail"));
    model.put("url",      insured.getValue("zyyl.planb.url"));
    logger.info("个人住院医疗保险-有社保-数据获取完成");
    return "getdata";
    
  }
  
  /*
   * 根据指定年龄范围生成投被保人身份证号码
   * 与投保人关系：本人
   * 投被保人年龄：minAge：最小年龄, maxAge：最大年龄
   * 投被保人性别：gender: 默认random, female:女性身份证
   */
  @RequestMapping(value="/random")
  public String GetDataTbr(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="18") int minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="60") int maxAge,
      @RequestParam(value="gender", required=false, defaultValue="random") String gender) {
    
    model.put("title",    "投保人数据生成");
    model.put("relation", "本人");
    model.put("tbrName",  "安安测试");
    model.put("tbrCerti", certi.getRandomCertiCode(minAge, maxAge, gender));
    model.put("tbrPhone", "13108130001");
    model.put("tbrEmail", "13108130001@zhongan.com");
    return "getdata";
    
  }
  
  /*
   * 根据指定年龄范围生成被保人身份证号码
   * 与投保人关系：配偶、子女、父母、其他
   * 投保人年龄：18-60周岁
   * 被保人年龄：minAge：最小年龄, maxAge：最大年龄
   * 被保人性别：gender: 默认random, female:女性身份证
   */
  @RequestMapping(value="/randombbr")
  public String GetDataForAge(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="18") int minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="60") int maxAge,
      @RequestParam(value="gender", required=false, defaultValue="random") String gender) {
    
    model.put("title",    "投保人数据生成");
    model.put("relation", "本人");
    model.put("tbrName",  "安安测试");
    model.put("tbrCerti", certi.getRandomCertiCode(18, 60));
    model.put("tbrPhone", "13108130001");
    model.put("tbrEmail", "13108130001@zhongan.com");
    model.put("bbrName",  "安安被保人");
    model.put("bbrCerti", certi.getRandomCertiCode(minAge, maxAge, gender));
    model.put("bbrPhone", "13108130001");
    return "getdata";
    
  }
  
}
