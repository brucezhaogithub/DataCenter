package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.wenzi.datacenter.asserts.PolicyAssert;
import pers.wenzi.datacenter.model.Except;
import pers.wenzi.datacenter.model.Actual;
import pers.wenzi.datacenter.service.PolicyService;

@Controller
@RequestMapping(value="/checkdata")
public class CheckData {
  
  Actual policy = new Actual();
  Except except = new Except();
  
  @Autowired
  private PolicyService policyService;
  
  @RequestMapping(value="/mobile/yhds/plana/{policyNo}", method=RequestMethod.GET)
  public String checkYhdsPlana(Map<String, String> model,
      @PathVariable("policyNo") String policyNo) {
    
    policy = policyService.selectPolicy(policyNo);
    model.put("policyNo",       policyNo);
    model.put("productId", PolicyAssert.AssertToString(
            "产品版型校验", policy.getProductId(), except.getValue("yhds.plana.productId")));
    model.put("packageDefId", PolicyAssert.AssertToString(
            "产品组合校验", policy.getPackageDefId(), except.getValue("yhds.plana.packageDefId")));
    model.put("campaignDefId", PolicyAssert.AssertToString(
            "营销渠道校验", policy.getCampaignDefId(), except.getValue("yhds.plana.campaignDefId")));
    
    return "checkdata";
    
  }
  
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
  
  @RequestMapping(value="/checkpolicy", method=RequestMethod.POST)
  public String checkPolicy(Map<String, String> map) {
    
    System.out.println("submit this");
    return "checkpolicy";
    
  }

}
