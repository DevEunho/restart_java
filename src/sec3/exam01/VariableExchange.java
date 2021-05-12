package sec3.exam01;

public class VariableExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ",y:" + y);
		System.out.println("#################다음줄~~~~######################");
		// temp를 x로 지정
		int temp = x;
		// x에 y를 지정
		x= y;
		// temp를 y에 지정
		y= temp;
		System.out.println("x:" + x + ",y:" + y);
	}

}
