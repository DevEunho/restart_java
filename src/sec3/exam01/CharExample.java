package sec3.exam01;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		int check = 'A';
		
		char c4 = '°¡';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(check); //<-¾ê¸¸ 65·Î³ª¿È,int´Ï±î

		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
	}

}
