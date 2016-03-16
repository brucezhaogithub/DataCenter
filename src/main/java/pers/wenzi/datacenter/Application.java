package pers.wenzi.datacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * itest自动化测试框架数据银行主入口
 * 
 */

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
      
      ApplicationContext ctx = SpringApplication.run(Application.class, args);
//      String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
//      for (String profile : activeProfiles) {
//        System.out.println("当前使用属性文件：" + profile);
//      }
      
    }
    
}
