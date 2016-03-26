package pers.wenzi.datacenter.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import pers.wenzi.datacenter.entity.Entity;

@Component
public class SessionFactory {
  
  private static SqlSessionFactory factory;
  
  public SessionFactory() throws IOException {
    
    if (factory == null) {
      String resource = "batis/mybatis-config.xml";
      Reader reader   = Resources.getResourceAsReader(resource);
      factory         = new SqlSessionFactoryBuilder().build(reader);
    }
    
  }
  
  public static Entity getSessionEntity(Entity entity, String stmt, String param) {
    
    SqlSession session = null;
    try {
      session = factory.openSession();
      entity = session.selectOne(stmt, param);
    }finally {
      session.close();
    }
    return entity;
    
  }

}
