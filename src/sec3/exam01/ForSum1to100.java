package sec3.exam01;

public class ForSum1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=100; i++) { // for문 시작시 초기화식 실행, 조건식이 true면 밑에 실행문 실행, false면 종료
			sum += i;
		}
		
		System.out.println("1~100까지의 합은?->" + sum);
	}

}
