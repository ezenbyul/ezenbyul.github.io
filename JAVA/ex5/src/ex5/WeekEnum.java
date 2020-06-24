package ex5;
import java.util.Calendar;

import ex5.WEEK;

public class WeekEnum {

	public static void main(String[] args) {
		WEEK today = null; // enum type �� ���� ����
		
		Calendar cal = Calendar.getInstance(); // Calendar Ÿ���� cal �ν��Ͻ� ����
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