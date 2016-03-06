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
public class GetData {
  
  // 航空意外险 数据初始化
  @RequestMapping("/GetData_HKYW")
  public String GetData_HKYW(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData_HKYW";
    
  }
  
  // 营运交通意外险 数据初始化
  @RequestMapping("/GetData_YYJT")
  public String GetData_YYJT(Map<String, String> model) {
   
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData_YYJT";
   
  }
  
  //公共场所意外险 数据初始化
  @RequestMapping("/GetData_GGCS")
  public String GetData_GGCS(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData_GGCS";
  
  }
  
  //公共场所意外险 数据初始化
  @RequestMapping("/GetData_SJC")
  public String GetData_SJC(Map<String, String> model) {
  
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData_SJC";
  
  }
  
}
