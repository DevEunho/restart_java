package sec3.exam01;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*6) + 1;
		
		switch(num) { // <-������ num���� ���� �갡���ϸ鼭 case�ش��ϸ� ����
		case 1:
			System.out.println("1��");
			break;
		case 2:
			System.out.println("2��");
			break;
		case 3:
			System.out.println("3��");
			break;
		case 4:
			System.out.println("4��");
			break;
		case 5:
			System.out.println("5��");
			break;
		default:
			System.out.println("default�� 6��");
			break;		
		}
	}

}
