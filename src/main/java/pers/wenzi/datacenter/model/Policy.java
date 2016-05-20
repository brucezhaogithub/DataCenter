package pers.wenzi.datacenter.model;

public class Policy {
  
  private int policyId;
  private String policyNo;
  private String productId;
  private String packageDefId;
  private String campaignDefId;
  
  /*
   * getter method
   */
  
  public int getPolicyId() {
    
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
   * setter method
   */
  
  public void setPolicyId(int policyId) {
    
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
