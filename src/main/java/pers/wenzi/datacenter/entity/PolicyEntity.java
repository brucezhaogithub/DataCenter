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
  
  public String getExpProductId() {
    
    return expProductId;
    
  }
  
  public String getExpPackageDefId() {
    
    return expPackageDefId;
    
  }
  
  public String getExpCampaignDefId() {
    
    return expCampaignDefId;
    
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
  
  public void setExpProductId(String productId) {
    
    this.expProductId = productId;
    
  }
  
  public void setExpPackageDefId(String packageDefId) {
    
    this.expPackageDefId = packageDefId;
    
  }
  
  public void setExpCampaignDefId(String campaignDefId) {
    
    this.expCampaignDefId = campaignDefId;
    
  }
  
}
