package pers.wenzi.DataBank.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetCerti {

  @RequestMapping(value="/GetCerti", method=RequestMethod.GET)
  @ResponseBody
  public String GetCerti(Map<String, String> model, String tbrCerti) {
    
    System.out.println(tbrCerti);
    model.put("tbrCerti", tbrCerti);
    return "getcerti";
    
  }
  
}
