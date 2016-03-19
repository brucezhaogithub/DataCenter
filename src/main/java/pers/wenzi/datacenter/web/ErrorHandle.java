package pers.wenzi.datacenter.web;

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
  public String errorHandle() {
    
    return getErrorPath();
    
  }

}
