package sec3.exam01;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
		//강제 타입 변환할 경우 
		//큰 허용 범위의 변수를 작은 범위로 바꿀 경우 ()를 사용하여 강제로 변환
}
