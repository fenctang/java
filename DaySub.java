package cfp.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DaySub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateString = "2016-06-29 10:37:58";
		// 設定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 進行轉換
		Date date;
		try {
			date = sdf.parse(dateString);
			Calendar c1 = Calendar.getInstance();
			c1.setTime(date);  
			Calendar c2 = Calendar.getInstance();
			long mins =(c2.getTimeInMillis()-c1.getTimeInMillis())/(60*1000);
			System.out.println(mins);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int j =0 ; j < 10 ; j++){
			System.out.println(Character.toString((char) (65+j))+".F_CV");
		}
	}

}
