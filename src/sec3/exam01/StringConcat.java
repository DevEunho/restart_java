package sec3.exam01;

public class StringConcat {

	public static void main(String[] args) {
		// 숫자 연산
		int value = 10 +2 +8;
		System.out.println("value: "+value);
		
		//문자열 결합 연산
		String str1= 10+2+"8"; //<-12에 8을 더함
		System.out.println("str1: "+ str1);
		
		String str2= 10+"2"+8; //<-10에 문자2를 더하고 8을 더함
		System.out.println("str2: "+ str2);
		
		String str3= "10"+2+8; //<-문자10에 2를더하고 8을 더함
		System.out.println("str3: "+ str3);
		
		String str4= "10"+(2+8); //<-문자10에 숫자 10을 더함
		System.out.println("str4: "+ str4);

	}

}
