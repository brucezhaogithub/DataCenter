package pers.wenzi.datacenter.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/CheckData")
public class CheckData {
  
  // 官网-女性疾病-数据校验
  @RequestMapping(value="/Online-NXJB/{policyNo}", method=RequestMethod.GET)
  public String submitData(Map<String, String> model, 
      @PathVariable("policyNo") String policyNo) throws IOException {
    
    String                    resource  = "/batisconf.xml";
    System.out.println("resource path is:" + CheckData.class.getResourceAsStream(resource));
    InputStream               is        = Resources.getResourceAsStream(resource);
    SqlSessionFactoryBuilder  builder   = new SqlSessionFactoryBuilder();
    SqlSessionFactory         factory   = builder.build(is);
    SqlSession                session   = factory.openSession();
    String statement = "pers.wenzi.datacenter.mapper.PolicyMapper.getPolicy";
    String result = session.selectOne(statement);
  //    PolicyEntity policyEntity = session.selectOne(statement, 1);
//    model.put("policyId", policyEntity.getPolicyId());
//    model.put("policyNo", policyEntity.getPolicyNo());
//    model.put("productId", policyEntity.getProductId());
//    model.put("packageDefId", policyEntity.getPackageDefId());
//    model.put("campaignDefId", policyEntity.getCampaignDefId());
    model.put("policyId", result);
    model.put("policyNo", policyNo);
    return "checkdata";
    
  }

}
