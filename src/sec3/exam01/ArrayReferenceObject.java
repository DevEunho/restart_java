package sec3.exam01;

public class ArrayReferenceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] ); //<-��ü������
		System.out.println( strArray[0] == strArray[2] ); // <-�ٸ� ��ü�� �ٸ�
		System.out.println( strArray[0].equals(strArray[2]) + "<-���ڿ��̰���");
		
	}

}
