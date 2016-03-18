package pers.wenzi.datacenter.web;

import java.io.InputStream;
import java.util.Map;

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
      @PathVariable("policyNo") String policyNo) {
    
//    String resource = "pers/wenzi/datacenter/batis/BatisConf.xml";
//    System.out.println("resource path is:" + this.getClass().getClassLoader().getResourceAsStream(resource));
//    InputStream is = this.getClass().getClassLoader().getResourceAsStream(resource);
//    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//    SqlSession session = sessionFactory.openSession();
//    String statement = "pers.wenzi.datacenter.mapper.PolicyMapper.getPolicy";
//    PolicyEntity policyEntity = session.selectOne(statement, 1);
//    model.put("policyId", policyEntity.getPolicyId());
//    model.put("policyNo", policyEntity.getPolicyNo());
//    model.put("productId", policyEntity.getProductId());
//    model.put("packageDefId", policyEntity.getPackageDefId());
//    model.put("campaignDefId", policyEntity.getCampaignDefId());
    model.put("policyNo", policyNo);
    return "checkdata";
    
  }

}
