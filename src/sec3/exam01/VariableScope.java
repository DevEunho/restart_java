package sec3.exam01;

public class VariableScope {
	public static void main(String[] args) {
		int v1= 15;
		if(v1>10) {
			int v2;
			v2 = v1 -10;
		}
		int v3 = v1+ v1 + 5; //v2 변수를 사용할수 없기 때문에 error 발생할 것, v2를 v1으로 바꿈
		System.out.println(v3);
	}
}
