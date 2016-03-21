package pers.wenzi.datacenter.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.wenzi.datacenter.asserts.PolicyAssert;
import pers.wenzi.datacenter.dao.SessionFactory;
import pers.wenzi.datacenter.entity.Entity;
import pers.wenzi.datacenter.entity.PolicyEntity;
import pers.wenzi.datacenter.util.ProductUtil;

@Controller
@RequestMapping(value="/CheckData")
public class CheckData {
  
  // 官网-女性疾病-数据校验
  @RequestMapping(value="/online/nxjb/{policyNo}", method=RequestMethod.GET)
  public String submitData(Map<String, String> model, 
      @PathVariable("policyNo") String policyNo) {

    Entity entity = new PolicyEntity();
    String stmt   = "pers.wenzi.datacenter.mapper.PolicyMapper.selectPolicy";
    entity        = SessionFactory.getSessionEntity(entity, stmt, policyNo);
    model.put("policyNo", entity.getPolicyNo());
    model.put("productId", 
              PolicyAssert.AssertToString(
                  "productId", 
                  entity.getProductId(), 
                  ProductUtil.ONLINE_NXJB_PRODUCTID));
    model.put("packageDefId", 
              PolicyAssert.AssertToString(
                  "packageDefId", 
                  entity.getPackageDefId(), 
                  ProductUtil.ONLINE_NXJB_PACKAGEDEFID));
    model.put("campaignDefId", 
              PolicyAssert.AssertToString(
                  "productId", 
                  entity.getPackageDefId(), 
                  ProductUtil.ONLINE_NXJB_CAMPAIGNDEFID));
    return "checkdata";
    
  }

}
