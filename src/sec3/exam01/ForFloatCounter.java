package sec3.exam01;

public class ForFloatCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(float x=0.1f; x<=1.0; x+=0.1f) {
			System.out.println(x); // <- 0.1은 float으로 정확하게 표현할 수 없기 때문에 실제 값은 0.1보다 살짞 큼 
		}
	}

}
