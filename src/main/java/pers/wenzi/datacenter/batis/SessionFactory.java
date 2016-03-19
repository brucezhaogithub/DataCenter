package pers.wenzi.datacenter.batis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {
  
  private static SqlSessionFactory factory;
  private static SqlSession session;
  
  private SessionFactory(){};
  
  public static SqlSessionFactory getInstance() throws IOException {
    
    if (factory == null) {
      String resource = "pers/wenzi/datacenter/batis/mybatis-config.xml";
      Reader reader    = Resources.getResourceAsReader(resource);
      return new SqlSessionFactoryBuilder().build(reader);
    }else {
      return factory;
    }
    
  }

}
