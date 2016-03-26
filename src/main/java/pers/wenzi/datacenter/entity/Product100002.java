package pers.wenzi.datacenter.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(locations="classpath:product.properties", prefix="nxjb")
public class Product100002 {
  
  @NotBlank
  private String title;
  private String relation;
  private String tbrName;
  private String tbrPhone;
  private String tbrEmail;
  private String bbrName;
  private String bbrPhone;
  private String url;
  
  @NotNull
  private int tbrMinAge;
  private int tbrMaxAge;
  private int bbrMinAge;
  private int bbrMaxAge;
  
  /*
   *  getterMethod
   */
  
  public String getTitle() {
    
    return title;
    
  }
  
  public String getRelation() {
    
    return relation;
    
  }
  
  public String getTbrName() {
    
    return tbrName;
    
  }
  
  public int getTbrMinAge() {
    
    return this.tbrMinAge;
    
  }
  
  public int getTbrMaxAge() {
    
    return this.tbrMaxAge;
    
  }
  
  public String getTbrPhone() {
    
    return tbrPhone;
    
  }
  
  public String getTbrEmail() {
    
    return tbrEmail;
    
  }
  
  public String getBbrName() {
    
    return bbrName;
    
  }
  
  public int getBbrMinAge() {
    
    return this.bbrMinAge;
    
  }
  
  public int getBbrMaxAge() {
    
    return this.bbrMaxAge;
    
  }
  
  public String getBbrPhone() {
    
    return bbrPhone;
    
  }
  
  public String getUrl() {
    
    return url;
    
  }
  
  /*
   * setterMethod
   */
  public void setTitle(String title) {
    
    this.title = title;
    
  }
  
  public void setRelation(String relation) {
    
    this.relation = relation;
    
  }
  
  public void setTbrName(String tbrName) {
    
    this.tbrName = tbrName;
    
  }
  
  public void setTbrMinAge(int tbrMinAge) {
    
    this.tbrMinAge = tbrMinAge;
    
  }
  
  public void setTbrMaxAge(int tbrMaxAge) {
    
    this.tbrMaxAge = tbrMaxAge;
    
  }
  
  public void setTbrPhone(String tbrPhone) {
    
    this.tbrPhone = tbrPhone;
    
  }
  
  public void setTbrEmail(String tbrEmail) {
    
    this.tbrEmail = tbrEmail;
    
  }
  
  public void setBbrName(String bbrName) {
    
    this.bbrName = bbrName;
    
  }
  
  public void setBbrMinAge(int bbrMinAge) {
    
    this.bbrMinAge = bbrMinAge;
    
  }
  
  public void setBbrMaxAge(int bbrMaxAge) {
    
    this.bbrMaxAge = bbrMaxAge;
    
  }
  
  public void setBbrPhone(String bbrPhone) {
    
    this.bbrPhone = bbrPhone;
    
  }
  
  public void setUrl(String url) {
    
    this.url = url;
    
  }
  
}
