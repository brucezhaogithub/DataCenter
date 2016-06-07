package pers.wenzi.datacenter.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private String next_date;

	public String currentDate() {

			Calendar cal = Calendar.getInstance();	//获得当前日期的一个实例
			cal.add(Calendar.DAY_OF_YEAR, +1);		//获取日历天数中，当前日期的下一天
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd000000");//设置输出日期的格式
			String next_date = sf.format(cal.getTime());//对下一日期做格式化
			return next_date;
	}
}