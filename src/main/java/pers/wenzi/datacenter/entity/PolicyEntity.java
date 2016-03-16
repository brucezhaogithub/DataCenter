package pers.wenzi.datacenter.entity;

import java.io.Serializable;

public class PolicyEntity implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 7083460537157667618L;
  private String policyId;
  private String policyNo;
  private String productId;
  private String packageDefId;
  private String campaignDefId;
  
  public String getPolicyId() {
    
    return policyId;
    
  }
  
  public String getPolicyNo() {
    
    return policyNo;
    
  }
  
  public String getProductId() {
    
    return productId;
    
  }
  
  public String getPackageDefId() {
    
    return packageDefId;
    
  }
  
  public String getCampaignDefId() {
    
    return campaignDefId;
    
  }
  
  // set
  public void setPolicyId(String policyId) {
    
    this.policyId = policyId;
    
  }
  
  public void setPolicyNo(String policyNo) {
    
    this.policyNo = policyNo;
    
  }
  
  public void setProductId(String productId) {
    
    this.productId = productId;
    
  }
  
  public void setPackageDefId(String packageDefId) {
    
    this.packageDefId = packageDefId;
    
  }
  
  public void setCampaignDefId(String campaignDefId) {
    
    this.campaignDefId = campaignDefId;
    
  }
  
}
