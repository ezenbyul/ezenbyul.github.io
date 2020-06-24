package ex5;
import java.util.Calendar;

import ex5.WEEK;

public class WeekEnum {

	public static void main(String[] args) {
		WEEK today = null; // enum type 의 변수 선언
		
		Calendar cal = Calendar.getInstance(); // Calendar 타입의 cal 인스턴스 생성
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1:
			today = WEEK.SUNDAY;
			break;
		case 2:
			today = WEEK.MONDAY;
			break;
		case 3:
			today = WEEK.TUESDAY;
			break;
		case 4:
			today = WEEK.WEDNESDAY;
			break;
		case 5:
			today = WEEK.THURSDAY;
			break;
		case 6:
			today = WEEK.FRIDAY;
			break;
		case 7:
			today = WEEK.SATURDAY;
			break;			
		}
		System.out.println(today);
	}

}
