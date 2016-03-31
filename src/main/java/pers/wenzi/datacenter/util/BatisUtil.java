package pers.wenzi.datacenter.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component
public class BatisUtil {
  
  private static SqlSessionFactory factory;
  
  private static class BatisUtilHolder {
    
    private static final BatisUtil INSTANCE = new BatisUtil();
    
  }
  
  private BatisUtil() {
    
    if (factory == null) {
      String resource = "batis/mybatis-config.xml";
      Reader reader   = null;
      try {
        reader = Resources.getResourceAsReader(resource);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      factory = new SqlSessionFactoryBuilder().build(reader);
    }
    
  }
  
  public static final BatisUtil getInstance() {
    
    return BatisUtilHolder.INSTANCE;
    
  }
  
  public static SqlSession openSession() {
    
    return factory.openSession();
    
  }
  
}
