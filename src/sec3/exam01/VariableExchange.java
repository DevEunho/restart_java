package sec3.exam01;

public class VariableExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ",y:" + y);
		System.out.println("#################������~~~~######################");
		// temp�� x�� ����
		int temp = x;
		// x�� y�� ����
		x= y;
		// temp�� y�� ����
		y= temp;
		System.out.println("x:" + x + ",y:" + y);
	}

}
