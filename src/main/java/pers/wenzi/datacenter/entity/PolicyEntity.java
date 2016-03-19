package pers.wenzi.datacenter.entity;

public class PolicyEntity extends Entity {

  private String policyId;
  private String policyNo;
  private String productId;
  private String packageDefId;
  private String campaignDefId;
  
  /*
   * Get Method
   */
  
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
  
  /*
   * Set Method
   */
  
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
