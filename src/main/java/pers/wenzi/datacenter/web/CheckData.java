package pers.wenzi.datacenter.web;

import java.io.IOException;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.wenzi.datacenter.batis.SessionFactory;
import pers.wenzi.datacenter.entity.PolicyEntity;

@Controller
@RequestMapping(value="/CheckData")
public class CheckData {
  
  // 官网-女性疾病-数据校验
  @RequestMapping(value="/Online-NXJB/{policyNo}", method=RequestMethod.GET)
  public String submitData(Map<String, String> model, 
      @PathVariable("policyNo") String policyNo) throws IOException {
    
    SqlSessionFactory factory = SessionFactory.getInstance();
    SqlSession        session = factory.openSession();
    try {
      String        statement = "pers.wenzi.datacenter.mapper.PolicyMapper.selectPolicy";
      PolicyEntity  entity    = session.selectOne(statement, policyNo);
      model.put("policyId",       entity.getId());
      model.put("policyNo",       entity.getPolicyNo());
      model.put("productId",      entity.getProductId());
      model.put("packageDefId",   entity.getPackageDefId());
      model.put("campaignDefId",  entity.getCampaignDefId());
    }finally {
      session.close();
    }

    return "checkdata";
    
  }

}
