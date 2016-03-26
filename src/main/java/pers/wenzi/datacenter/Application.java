package pers.wenzi.datacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import pers.wenzi.datacenter.entity.Product100002;

/**
 * itest自动化测试框架数据银行主入口
 */

@SpringBootApplication
@EnableConfigurationProperties(Product100002.class)
public class Application {
    
    public static void main(String[] args) {
      
      SpringApplication.run(Application.class, args);
      
    }
    
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
      
      TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
      return factory;
      
    }
    
}
