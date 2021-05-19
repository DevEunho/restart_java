package sec3.exam01;

public class ArrayReferenceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] ); //<-객체가같음
		System.out.println( strArray[0] == strArray[2] ); // <-다른 객체라 다름
		System.out.println( strArray[0].equals(strArray[2]) + "<-문자열이같음");
		
	}

}
