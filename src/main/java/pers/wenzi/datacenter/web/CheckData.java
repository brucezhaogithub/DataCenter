package pers.wenzi.datacenter.web;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.wenzi.datacenter.entity.PolicyEntity;

@Controller
@RequestMapping(value="/CheckData")
public class CheckData {
  
  // 官网-女性疾病-数据校验
  @RequestMapping(value="/Online-NXJB/{policyNo}", method=RequestMethod.GET)
  public String submitData(Map<String, String> model, 
      @PathVariable("policyNo") String policyNo) throws IOException {
    
    String                    resource  = "pers/wenzi/datacenter/batis/mybatis-config.xml";
    Reader                    reader    = Resources.getResourceAsReader(resource);
    System.out.println("resource path is:" + reader);
//    InputStream               is        = Resources.getResourceAsStream(resource);
    SqlSessionFactoryBuilder  builder   = new SqlSessionFactoryBuilder();
    SqlSessionFactory         factory   = builder.build(reader);
    SqlSession                session   = factory.openSession();
    String statement = "pers.wenzi.datacenter.mapper.PolicyMapper.selectPolicy";
    PolicyEntity policyEntity = session.selectOne(statement, policyNo);
    model.put("policyNo", policyNo);
    model.put("productId", policyEntity.getProductId());
    return "checkdata";
    
  }

}
