package sec3.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte bytevalue = 10;
		int intValue = bytevalue;
		System.out.println("intValue:"+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:"+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:"+longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:"+floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue:"+doubleValue);
		// byte < short < int < long < float < double 
		// 순으로 큰 허용범위 = 작은 허용범위 타입 으로 자동 타입 변환
	}

}
