package pers.wenzi.datacenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * itest自动化测试框架数据银行主入口
 * 
 */

@SpringBootApplication
public class Application {
    
    private final static Logger logger = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
      
      logger.info("DataCenter Starting...");
      SpringApplication.run(Application.class, args);
      
    }
    
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
      
      TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
      return factory;
      
    }
    
}
