package pers.wenzi.datacenter.entity;

public class PolicyEntity {

  private String id;
  private String policy_no;
  private String product_id;
  private String package_def_id;
  private String campaign_def_id;
  
  /*
   * get
   */
  
  public String getId() {
    
    return id;
    
  }
  
  public String getPolicyNo() {
    
    return policy_no;
    
  }
  
  public String getProductId() {
    
    return product_id;
    
  }

  public String getPackageDefId() {
  
    return package_def_id;
  
  }

  public String getCampaignDefId() {
  
    return campaign_def_id;
  
  }
  
  /*
   * set
   */
  
  public void setId(String id) {
    
    this.id = id;
    
  }
  
  public void setPolicyNo(String policy_no) {
    
    this.policy_no = policy_no;
    
  }
  
  public void setProductId(String product_id) {
    
    this.product_id = product_id;
    
  }

  public void setPackageDefId(String package_def_id) {
  
    this.package_def_id = package_def_id;
  
  }

  public void setCampaignDefId(String campaign_def_id) {
  
    this.campaign_def_id = campaign_def_id;
  
  }
  
}
