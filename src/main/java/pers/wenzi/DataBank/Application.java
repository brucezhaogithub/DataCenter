package pers.wenzi.DataBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * itest自动化测试框架数据银行主入口
 * 
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
  
    public static void main(String[] args) {
      
      SpringApplication.run(Application.class, args);
      
    }
    
}
