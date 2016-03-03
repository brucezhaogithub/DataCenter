package com.zhongan.itest.DataBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongan.itest.DataBank.util.CertinoUtil;

/**
 * 航空意外险测试数据初始化
 * 
 */

@Controller
public class Online_10084 {
  
    @RequestMapping(value="/online_10084")
    @ResponseBody
    public String initData() {
      
      CertinoUtil certiNo = new CertinoUtil();
      return "随机身份证号码：" + certiNo.getRandomCertiCode();
      
    }
    
}
