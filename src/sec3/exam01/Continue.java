package sec3.exam01;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; // <-홀수인 경우 조건식으로가라!
			}
			System.out.println(i);
		}
	}
}
