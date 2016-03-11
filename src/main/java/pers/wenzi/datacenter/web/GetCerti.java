package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.wenzi.datacenter.util.CertinoUtil;

@Controller
public class GetCerti {

  @RequestMapping(value="/GetCerti/{productId}", method=RequestMethod.GET)
  @ResponseBody
  public String getCerti(Map<String, String> model) {
    
    CertinoUtil certi = new CertinoUtil();
    model.put("tbrCerti", certi.getRandomCertiCode());
    return "getcerti";
    
  }
  
}
