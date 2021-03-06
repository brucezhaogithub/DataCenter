package pers.wenzi.datacenter.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CertiUtil2 {

  private String minAge = "18";
  private String maxAge = "60";
  private String gender = "random";
  
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
  public String getRandomCertiCode(String minAge, String maxAge) {
    
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
  public String getRandomCertiCode(String minAge, String maxAge, String gender) {

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
    cityCode = TextUtil.cities[new Random().nextInt(TextUtil.cities.length)];
    return cityCode;
    
  }
  
  //随机生成出生年月
  private String getRandomBirthCode() {
    
    Random random     = new Random();
    String birthCode  = null;
    Calendar cal      = Calendar.getInstance();
    cal.setTime(new Date());
    int minYear = (maxAge.indexOf('d') == -1)?
        cal.get(Calendar.YEAR) - Integer.valueOf(maxAge):cal.get(Calendar.YEAR);
    int maxYear = (minAge.indexOf('d') == -1)?
        cal.get(Calendar.YEAR) - Integer.valueOf(minAge):cal.get(Calendar.YEAR);
    int Year  = random.nextInt(maxYear) % (maxYear - minYear + 1) + minYear;
    int Month = (Year == maxYear)?
        random.nextInt(cal.get(Calendar.MONTH) + 1):random.nextInt(12);
    int Date  = ((Year == maxYear) && (Month == cal.get(Calendar.MONTH)))?
        random.nextInt(cal.get(Calendar.DATE)) + 1:random.nextInt(28);
    cal.set(Year, Month, Date);
    birthCode = new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
    return birthCode;
    
  }
  
  //随机生成顺序号
  private String getRandomOrderCode() {
    
    Random  random    = new Random();
    String  orderCode = null;
    String  orderNum1 = Integer.toString(new Random().nextInt(9));
    String  orderNum2 = Integer.toString(new Random().nextInt(9));
    int     num3      = random.nextInt(9);
    if ("female".equals(this.gender)) {
      do {
        num3 = random.nextInt(9);
      } while(num3 % 2 != 0);
    }
    String orderNum3  = Integer.toString(num3);
    orderCode         = orderNum1 + orderNum2 + orderNum3;
    this.gender       = "random";
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
