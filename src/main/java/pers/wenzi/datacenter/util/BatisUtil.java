package pers.wenzi.datacenter.util;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class BatisUtil {
  
  private SqlSessionFactory sqlSessionFactory;
  private static BatisUtil batisUtil;
  
  private BatisUtil(DataSource dataSource) {
    
    System.out.println("--------------------------BatisUtil initialize-----------------------"); 
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    try {
      String resource = "batis/mybatis-config.xml";
      sqlSessionFactoryBean.setMapperLocations(resolver.getResources(resource));
      sqlSessionFactory = sqlSessionFactoryBean.getObject();
    }catch (Exception e) {
      throw new RuntimeException("BatisUtil init Error:" + e.getMessage());
    }
    
  }
  
  public static BatisUtil getInstance(DataSource dataSource) {
    
    synchronized(dataSource) {
      if (batisUtil == null) {
        batisUtil = new BatisUtil(dataSource);
      }
    }
    return batisUtil;
    
  }
  
  public SqlSession getSession() throws Exception {
    
    return sqlSessionFactory.openSession();
    
  }
  
}
