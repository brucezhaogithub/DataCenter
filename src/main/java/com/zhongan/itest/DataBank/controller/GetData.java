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
    
  @RequestMapping("/GetData")
  public String getData(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("certi", certi.getRandomCertiCode());
    return "GetData";
    
  }
    
}
