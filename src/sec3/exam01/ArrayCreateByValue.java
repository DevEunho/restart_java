package sec3.exam01;

public class ArrayCreateByValue {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 98};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("����: " + sum1);
		// �ؿ� add�� �����ؼ� ���� ���� ���� 
		int sum2 = add( new int[] {90, 90, 90} );
		System.out.println("����2: " + sum2);
		System.out.println("##### ");		
	}
	
	//add �޼ҵ�: ������ ���ؼ� return �ϴ� �޼ҵ�... �̰� �����ؾ� ������ ��
	public static int add(int[] scores) { 
		int sum =0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
