package sec3.exam01;

import java.util.Calendar; //<- Calendar Ŭ���� import

public class EnumWeek{
	public static void main(String[] args) {
		Week today = null;  //<- ���� Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //<-��(1)~��(7)������ ���� ����
		
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
		
		System.out.println("���� ����: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� ��ô�.");
		} else {
			System.out.println("�ڹٰ����սô� ~");
		}
	}
}
// �ڹ� ��ġ�� EE�� ��ġ������ window - preferences�� web�� �־ 
// ignore �ϸ� �Ǵµ� �װ� ���� 