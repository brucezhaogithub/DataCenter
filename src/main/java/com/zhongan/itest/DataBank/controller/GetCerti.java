package com.zhongan.itest.DataBank.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhongan.itest.DataBank.util.CertinoUtil;

/**
 * 航空意外险测试数据初始化
 * 
 */

@Controller
public class GetCerti {
  
  // 获取随机身份证号
  @RequestMapping("/GetCerti")
  public String getCerti(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetCerti";
    
  }
  
  // 获取女性身份证号
  // 适用与女性特定疾病、母婴健康险等指定女性产品
  @RequestMapping("/GetFemaleCerti")
  public String getFemaleCerti(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode("female"));
    return "GetCerti";
    
  }
  
  // 获取指定年龄范围身份证号
  // 同时生成投保人及儿童身份证号
  // 适用与未成年人重疾、儿童齿科等指定儿童产品
  @RequestMapping("/GetAgeCerti")
  public String getAgeCerti(Map<String, String> model, int minAge, int maxAge) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    model.put("kid", certi.getRandomCertiCode(minAge, maxAge));
    return "GetCerti";
    
  }
  
}
