package pers.wenzi.datacenter.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pers.wenzi.datacenter.util.CertiUtil;
import pers.wenzi.datacenter.util.DateUtil;
import pers.wenzi.datacenter.util.InsuredUtil;

/**
 * 所有产品数据初始化  
 * @author liwenhuan
 */

@Controller
@RequestMapping(value="/getdata")
public class GetData {
  
  private final static Logger logger = LoggerFactory.getLogger(GetData.class);
  InsuredUtil insured = new InsuredUtil();  // 初始化投被保人脚本数据
  CertiUtil   certi   = new CertiUtil();    // 初始化身份证号生成工具
  DateUtil 	  date 	  = new DateUtil();		//初始化日期生成工具
  
  /*
   * 根据指定年龄和性别生成身份证号码
   * @param minAge
   * @param maxAge
   * @param gender
   */
  @RequestMapping(value="/tbr")
  public String GetTbr(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="18") int minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="60") int maxAge,
      @RequestParam(value="gender", required=false, defaultValue="random") String gender) {
    
    model.put("title", "身份证号码随机获取");
    model.put("certi", certi.getRandomCertiCode(minAge, maxAge, gender));
    logger.info("身份证号码生成成功");
    
    return "getdata";
    
  }
  
  @RequestMapping(value="/certi")
  public String GetCerti(Map<String, String> model,
      @RequestParam(value="minAge", required=false, defaultValue="18") String minAge,
      @RequestParam(value="maxAge", required=false, defaultValue="60") String maxAge,
      @RequestParam(value="gender", required=false, defaultValue="random") String gender) {
    
    model.put("title", "试验带日期方法");
    model.put("certi", certi.getRandomCertiCode2(minAge, maxAge, gender));
    model.put("date",date.currentDate());    
    logger.info("身份证号码生成成功");
    logger.info("获取明日日期成功");
    return "getdata";
    
  }
  
}
