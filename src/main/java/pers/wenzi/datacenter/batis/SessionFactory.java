package pers.wenzi.datacenter.batis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import pers.wenzi.datacenter.entity.Entity;

@Repository
public class SessionFactory {
  
  private static SqlSessionFactory factory;
  
  public SessionFactory() throws IOException {
    
    if (factory == null) {
      String resource = "pers/wenzi/datacenter/batis/mybatis-config.xml";
      Reader reader   = Resources.getResourceAsReader(resource);
      factory         = new SqlSessionFactoryBuilder().build(reader);
    }
    
  }
  
  @Deprecated
  public static SqlSessionFactory getInstance() throws IOException {
    
    if (factory == null) {
      String resource = "pers/wenzi/datacenter/batis/mybatis-config.xml";
      Reader reader   = Resources.getResourceAsReader(resource);
      return new SqlSessionFactoryBuilder().build(reader);
    }else {
      return factory;
    }
    
  }
  
  public static Entity getSessionEntity(Entity entity, String stmt, String key) {
    
    SqlSession session = null;
    try {
      session = factory.openSession();
      entity = session.selectOne(stmt, key);
    }finally {
      session.close();
    }
    return entity;
    
  }

}
