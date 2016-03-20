package pers.wenzi.datacenter.batis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pers.wenzi.datacenter.entity.Entity;

public class SessionFactory {
  
  private static SqlSessionFactory factory;
  
  private SessionFactory(){};
  
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
    
    SqlSessionFactory factory = null;
    SqlSession        session = null;
    try {
      factory = SessionFactory.getInstance();
      session = factory.openSession();
      entity  = session.selectOne(stmt, key);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      System.out.println(e);
    } finally {
      session.close();
    }
    return entity;
    
  }

}
