package pers.wenzi.datacenter.batis;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataBaseConf {
  
  private RelaxedPropertyResolver propertyResolver;
  
  public void setEnvironment(Environment env) {
    
    this.propertyResolver = new RelaxedPropertyResolver(env, "jdbc.");
    
  }
  
  @Bean(name="readDataSources")
  public List<DataSource> readDataSources() {
    
    List<DataSource> dataSources = new ArrayList<DataSource>();
    
    return dataSources;
    
  }

}
