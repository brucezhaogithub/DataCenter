package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorHandle implements ErrorController{

  @Override
  public String getErrorPath() {
    // TODO Auto-generated method stub
    return "error";
    
  }
  
  @RequestMapping
  public String errorHandle(Map<String, String> model) {
    
    model.put("error", "系统繁忙, 请稍后执行！");
    return getErrorPath();
    
  }

}
