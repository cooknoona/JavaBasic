package JavaAPI.DateCalanderClass;

import java.util.Calendar;
/* Date 클래스의 단점을 보완하기 위해서 도입
*  java.util 에 포함되어 있음
*  Calendar 는 추상 클래스로써 특정 국가나 문화의 달력 설정에 맞게 하위 클래스가 구현된다 */
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH)+1);
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        System.out.println(now.get(Calendar.AM_PM));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));
    }
}
