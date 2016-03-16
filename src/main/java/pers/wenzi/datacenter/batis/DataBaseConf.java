package pers.wenzi.datacenter.batis;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class DataBaseConf implements TransactionManagementConfigurer{
  
  @Autowired
  DataSource dataSource;
  
  @Bean(name="sqlSessionFactory")
  public SqlSessionFactory sqlSessionFactoryBean() {
      
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    bean.setTypeAliasesPackage("tk.mybatis.springboot.model");
    
    // 添加XML目录
    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    try {
      bean.setMapperLocations(resolver.getResources("classpath:/pers.wenzi.datacenter.mapper/*.xml"));
      return bean.getObject();
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    } 
      
  }

  @Bean
  public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
    
    return new SqlSessionTemplate(sqlSessionFactory);
    
  }
  
  @Override
  public PlatformTransactionManager annotationDrivenTransactionManager() {
    // TODO Auto-generated method stub
    return new DataSourceTransactionManager(dataSource);
  }
  

}
