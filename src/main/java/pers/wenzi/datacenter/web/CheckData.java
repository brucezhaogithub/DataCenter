package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.wenzi.datacenter.batis.SessionFactory;
import pers.wenzi.datacenter.entity.Entity;
import pers.wenzi.datacenter.entity.PolicyEntity;

@Controller
@RequestMapping(value="/CheckData")
public class CheckData {
  
  // 官网-女性疾病-数据校验
  @RequestMapping(value="/Online-NXJB/{policyNo}", method=RequestMethod.GET)
  public String submitData(Map<String, String> model, 
      @PathVariable("policyNo") String policyNo) {

    Entity entity = new PolicyEntity();
    String stmt   = "pers.wenzi.datacenter.mapper.PolicyMapper.selectPolicy";
    entity        = SessionFactory.getSessionEntity(entity, stmt, policyNo);
    model.put("policyId",       entity.getPolicyId());
    model.put("policyNo",       entity.getPolicyNo());
    model.put("productId",      entity.getProductId());
    model.put("packageDefId",   entity.getPackageDefId());
    model.put("campaignDefId",  entity.getCampaignDefId());
    return "checkdata";
    
  }

}
