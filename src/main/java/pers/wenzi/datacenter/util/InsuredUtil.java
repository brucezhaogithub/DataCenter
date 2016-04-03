package pers.wenzi.datacenter.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class InsuredUtil {
  
  private String jsonStr = "";
  private Map<String, String> jsonMap = new HashMap<String, String>();
  
  public InsuredUtil() {
    
    getJson();
    getMap();
    
  }
  
  private void getJson() {
    
    File file = new File("product.json");
    BufferedReader reader = null;
    try {
      reader  = new BufferedReader(new FileReader(file));
      String tempStr = "";
      while ((tempStr = reader.readLine()) != null) {
        jsonStr = jsonStr + tempStr;
      }
    }catch (IOException e) {
      e.printStackTrace();
    }finally {
      if (reader != null) {
        try{
          reader.close();
        }catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    
  }
  
  @SuppressWarnings("rawtypes")
  private void getMap() {
    
    JSONObject rootObj = JSONObject.fromObject(jsonStr);
    JSONArray  prodAry = rootObj.getJSONArray("product");
    for (int i=0;i<prodAry.size();i++) {
      JSONObject propObj = JSONObject.fromObject(prodAry.getString(i));
      Iterator it = propObj.keys();
      while (it.hasNext()) {
        String key = String.valueOf(it.next());
        String value = (String) propObj.get(key);
        jsonMap.put(key, value);
      }
    }
    
  }
  
  public String getValue(String key) {
    
    return jsonMap.get(key);
    
  }
  
}
