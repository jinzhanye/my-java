package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Demo1 {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        Date date = new Date(1359641834000L);// 2013-1-31 22:17:14
        String dateStr = "2013-1-31 22:17:14";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date dateTmp = null;
        try {
            dateTmp = dateFormat.parse(dateStr);// 得到 2013-1-31 22:17:14 加上8小时的结果
            System.out.println(dateTmp);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String dateStrTmp = dateFormat.format(date);// 得到 2013-1-31 22:17:14 减去8小时的结果
        System.out.println(dateStrTmp);
    }
}
