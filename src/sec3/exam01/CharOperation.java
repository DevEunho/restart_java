package sec3.exam01;

public class CharOperation {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // <- c1 = bb�� �����ϵ�
		char c2 = 'A';
		// char c3 = c2 + 1; <- char������ ��� ���꿡 ���Ǹ� intŸ������ ��ȯ�ǹǷ� ����� intŸ���̵�
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		char c3 = (char) (c2 + 1);
		System.out.println("c3: " + c3);
		
	}

}
