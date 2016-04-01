package pers.wenzi.datacenter.util;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;

import com.alibaba.common.lang.StringUtil;
import com.google.common.collect.Maps;
import com.taobao.diamond.manager.ManagerListenerAdapter;
import com.taobao.diamond.manager.impl.DefaultDiamondManager;

@SuppressWarnings("deprecation")
/**
 * 公共数据中心diamond配置
 * @author qitao
 *
 */
public class DiamondConfig implements InitializingBean {

  private String groupID;
  private String dataID;

  private Map<String, String> configs = Maps.newHashMap();

  public String getConfig(String key) {
      
    if (StringUtils.isNotEmpty(key)) {
      return configs.get(key);
    }
    return StringUtil.EMPTY_STRING;
      
  }

  @Override
  public void afterPropertiesSet() throws Exception {
  // 接收diamond消息
    resolveConfigInfo(new DefaultDiamondManager(groupID, dataID, new ManagerListenerAdapter() {
      @Override
      public void receiveConfigInfo(String configInfo) {
        resolveConfigInfo(configInfo);
      }
    }).getAvailableConfigureInfomation(5000));
  }

  /**
   * 解析配置信息
   * 
   * @param configInfo
   */
  private void resolveConfigInfo(String configInfo) {
      
    String[] productConfigPart = configInfo.split("\r\n");
    String[] configPart = null;
    for (String productEdorConfig : productConfigPart) {
      if (StringUtil.isBlank(productEdorConfig) || productEdorConfig.startsWith("#")) {
        continue;
      }
      configPart = productEdorConfig.split(":");
      if (configPart != null && configPart.length >= 2) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 1; i < configPart.length; i++) {
          if (i != 1) {
            buffer.append(":");
          }
          buffer.append(configPart[i]);
        }
        configs.put(configPart[0], buffer.toString());
      }
    }
        
  }

  public void setGroupID(String groupID) {
    this.groupID = groupID;
  }

  public void setDataID(String dataID) {
    this.dataID = dataID;
  }

}
