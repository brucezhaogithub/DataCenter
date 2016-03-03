package com.zhongan.itest.DataBank.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class CertinoUtil {

  private int     minAge = 18;
  private int     maxAge = 60;
  private String  gender = "random";
  public  String  birthday = null;
  
  //获得随机身份证号码
  public String getRandomCertiCode() {
    
    String certiCode  = null;
    String cityCode   = this.getRandomCityCode();
    String birthCode  = this.getRandomBirthCode();
    String orderCode  = this.getRandomOrderCode();
    String checkCode  = this.getCheckCode(cityCode, birthCode, orderCode);
    certiCode         = cityCode + birthCode + orderCode + checkCode;
    return certiCode;
    
  }
  
  //获得指定性别的随机身份证号码
  public String getRandomCertiCode(String gender) {
    
    String certiCode  = null;
    this.gender       = gender;
    String cityCode   = this.getRandomCityCode();
    String birthCode  = this.getRandomBirthCode();
    String orderCode  = this.getRandomOrderCode();
    String checkCode  = this.getCheckCode(cityCode, birthCode, orderCode);
    certiCode         = cityCode + birthCode + orderCode + checkCode;
    return certiCode;
    
  }
  
  //获得最小年龄至最大年龄范围内的随机身份证号码
  public String getRandomCertiCode(int minAge, int maxAge) {
    
    String certiCode  = null;
    this.minAge       = minAge;
    this.maxAge       = maxAge;
    String cityCode   = this.getRandomCityCode();
    String birthCode  = this.getRandomBirthCode();
    String orderCode  = this.getRandomOrderCode();
    String checkCode  = this.getCheckCode(cityCode, birthCode, orderCode);
    certiCode         = cityCode + birthCode + orderCode + checkCode;
    return certiCode;
    
  }
  
  // 获得最小年龄至最大年龄范围内指定性别的随机身份证号码
  public String getRandomCertiCode(int minAge, int maxAge, String gender) {

    String certiCode  = null;
    this.minAge       = minAge;
    this.maxAge       = maxAge;
    this.gender       = gender;
    String cityCode   = this.getRandomCityCode();
    String birthCode  = this.getRandomBirthCode();
    String orderCode  = this.getRandomOrderCode();
    String checkCode  = this.getCheckCode(cityCode, birthCode, orderCode);
    certiCode         = cityCode + birthCode + orderCode + checkCode;
    return certiCode;

  }
  
  //随机生成省市代码
  private String getRandomCityCode() {
    
    String cityCode = null;
    // 设定随机省市代码
    final String cities[] = {
      // 北京市
      "110101", "110102", "110105", "110106", "110107", "110108", "110109", "110111",
      "110112", "110113", "110114", "110115", "110116", "110117",
      // 上海市
      "310101", "310104", "310105", "310106", "310107", "310108", "310109", "310110",
      "310112", "310113", "310114", "310115", "310116", "310117", "310118", "310120",
      "310130",
      // 天津市
      "120101", "120102", "120103", "120104", "120105", "120106", "120110", "120111",
      "120112", "120113", "120114", "120115", "120116", "120221", "120223", "120225",
      // 河北省石家庄市
      "130101", "130102", "130104", "130105", "130107", "130108", "130109", "130110",
      "130111", "130121", "130123", "130125", "130126", "130127", "130128", "130129",
      "130130", "130131", "130132",
      // 山西省太原市
      "140101", "140105", "140106", "140107", "140108", "140109", "140110", "140121",
      "140122", "140123",
      // 内蒙古呼和浩特市
      "150100", "150101", "150102", "150103", "150104", "150105", "150121", "150122",
      "150123", "150124", "150125",
      // 辽宁省沈阳市
      "210101", "210102", "210103", "210104", "210105", "210106", "210111", "210112",
      "210113", "210114", "210122", "210123", "210124",
      // 吉林省长春市
      "220101", "220102", "220103", "220104", "220105", "220106", "220112", "220113", "220122",
      "220182", "220183",
      // 黑龙江省哈尔滨市
      "230101", "230102", "230103", "230104", "230108", "230109", "230110", "230111", "230112",
      "230123", "230124", "230125", "230126", "230127", "230128", "230129", "230182", "230183",
      "230184",
      // 江苏省南京市
      "320101", "320102", "320104", "320105", "320106", "320111", 
      "320113", "320114", "320115", "320116", "320117", "320118"
    };
    cityCode = cities[new Random().nextInt(cities.length - 1)];
    return cityCode;
    
  }
  
  //随机生成出生年月
  private String getRandomBirthCode() {
    
    String birthCode = null;
    Calendar cal = Calendar.getInstance();
    int minYear = cal.get(Calendar.YEAR) - maxAge;
    int maxYear = cal.get(Calendar.YEAR) - minAge;
    int Year    = new Random().nextInt(maxYear) % (maxYear - minYear + 1) + minYear;
    int Month   = new Random().nextInt(12);
    int Date    = new Random().nextInt(28);
    cal.set(Year, Month, Date);
    birthCode = new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
    return birthCode;
    
  }
  
  //随机生成顺序号
  private String getRandomOrderCode() {
    
    String  orderCode = null;
    String  orderNum1 = Integer.toString(new Random().nextInt(9));
    String  orderNum2 = Integer.toString(new Random().nextInt(9));
    int     num3      = new Random().nextInt(9);
    if ("female".equals(this.gender)) {
      do {
        num3 = new Random().nextInt(9);
      } while(num3 % 2 != 0);
    }
    String orderNum3  = Integer.toString(num3);
    orderCode         = orderNum1 + orderNum2 + orderNum3;
    this.gender = "random";
    return orderCode;
    
  }
  
  // 生成校验码
  private String getCheckCode(String cityCode, String birthCode, String orderCode) {
    
    String  checkCode   = null; 
    // 初始化系数表
    int     ratio[]     = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    // 初始化校验位码表
    String  checkList[] = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
    char num17[] = (cityCode + birthCode + orderCode).toCharArray();
    int sum = 0;
    for (int i=0; i<num17.length; i++) {
      sum = sum + (num17[i] - 48) * ratio[i];
    }
    checkCode = checkList[sum % 11];
    return checkCode;
    
  }
  
}
