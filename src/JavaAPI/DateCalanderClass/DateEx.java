package JavaAPI.DateCalanderClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Date 클래스 : 자바 초기 버전 부터 제공되는 클래스
*  java.util 패키지에 포함되어 있음
*  Date 객체는 UTC 를 기준으로 1970년 1월 1일 자정부터 경과 시간 계산 */
public class DateEx {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        // yyyy : 연도를 4자리로 표시
        // yy : 연도를 2자리로 표시
        // MM : 월을 표시(대문자임을 유의) 2자리 차지
        // HH : 24시간제를 의미
        // hh : 12시간제를 의미
        // mm : 분을 의미
        // ss : 초를 의미
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주의 d번째날 입니다");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
        System.out.println(f5.format(date));
        System.out.println(f6.format(date));
    }
}
