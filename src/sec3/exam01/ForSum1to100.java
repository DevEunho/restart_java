package sec3.exam01;

public class ForSum1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=100; i++) { // for�� ���۽� �ʱ�ȭ�� ����, ���ǽ��� true�� �ؿ� ���๮ ����, false�� ����
			sum += i;
		}
		
		System.out.println("1~100������ ����?->" + sum);
	}

}
