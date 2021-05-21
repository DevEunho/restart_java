package sec3.exam01;

import java.util.Calendar; //<- Calendar 클래스 import

public class EnumWeek{
	public static void main(String[] args) {
		Week today = null;  //<- 열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //<-일(1)~토(7)까지의 숫자 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 놉시다.");
		} else {
			System.out.println("자바공부합시다 ~");
		}
	}
}
// 자바 설치시 EE로 설치했으면 window - preferences에 web이 있어서 
// ignore 하면 되는데 그걸 못함 