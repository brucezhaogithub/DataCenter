package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.wenzi.datacenter.model.Policy;
import pers.wenzi.datacenter.service.PolicyService;

@Controller
@RequestMapping(value="/checkdata")
public class CheckData {
  
  Policy policy;
  
  @Autowired
  private PolicyService policyService;
  
  // 官网-女性疾病-数据校验
  @RequestMapping(value="/online/nxjb/{policyNo}", method=RequestMethod.GET)
  public String checkNXJB(Map<String, String> map, 
      @PathVariable("policyNo") String policyNo) {
    
    policy = policyService.selectPolicy(policyNo);
    map.put("policyNo",       policyNo);
    map.put("productId",      policy.getProductId());
    map.put("packageDefId",   policy.getPackageDefId());
    map.put("campaignDefId",  policy.getCampaignDefId());
    return "checkdata";
    
  }

}
