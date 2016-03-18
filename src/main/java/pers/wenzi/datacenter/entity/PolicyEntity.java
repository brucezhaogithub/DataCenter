package pers.wenzi.datacenter.entity;

public class PolicyEntity {

  private String id;
  private String policyNo;
  private String productId;
  private String packageDefId;
  private String campaignDefId;
  
  /*
   * get
   */
  
  public String getId() {
    
    return id;
    
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
   * set
   */
  
  public void setId(String id) {
    
    this.id = id;
    
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
