package pers.wenzi.datacenter.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class JsonTest {
  
  @RequestMapping(value="/mapToJson")
  @ResponseBody
  public String mapToJson() {
    
    JSONObject jo = new JSONObject();
    
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("title", "女性特定疾病保险");
    map1.put("tbrName", "安安测试");
    Map<String, String> map2 = new HashMap<String, String>();
    map2.put("title", "航空意外险");
    map2.put("tbrName", "ananceshi");
    
    Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
    map.put("nxjb", map1);
    map.put("hkyw.plana", map2);
    jo.put("product", map);
    return jo.toString();
  }
  
  public String readJsonFile() {
    
    String jsonStr = "";
    String tempStr = "";
    File file = new File("E://product.json");
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
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
    return jsonStr;
    
  }
  
  public String getJsonObject() {
    
    JSONObject  jsonObject  = JSONObject.fromObject(readJsonFile());
    JSONArray   products    = jsonObject.getJSONArray("product");
    for (int i=0;i<products.size();i++) {
      JSONArray product = products.getJSONArray(i);
      for (int j=0;j<product.size();j++) {
        JSONArray properties = product.getJSONArray(j);
        for (int k=0;k<properties.size();k++) {
          System.out.println(properties.getString(k));
        }
      }
    }
    return "hello";
    
  }
  
  @RequestMapping(value="/readJson")
  @ResponseBody
  public String readJson() {
    
//    return mapToJson();
//    return readJsonFile();
    return getJsonObject();
    
  }
  
  
}
