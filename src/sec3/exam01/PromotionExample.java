package sec3.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		byte bytevalue = 10;
		int intValue = bytevalue;
		System.out.println("intValue:"+intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�:"+intValue);
		
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
		// ������ ū ������ = ���� ������ Ÿ�� ���� �ڵ� Ÿ�� ��ȯ
	}

}
