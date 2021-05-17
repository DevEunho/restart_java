package sec3.exam01;

public class ArrayCreateByValue {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 98};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		// 밑에 add를 정의해서 이제 쓸쑤 있음 
		int sum2 = add( new int[] {90, 90, 90} );
		System.out.println("총합2: " + sum2);
		System.out.println("##### ");		
	}
	
	//add 메소드: 총합을 더해서 return 하는 메소드... 이걸 정의해야 위에서 씀
	public static int add(int[] scores) { 
		int sum =0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
