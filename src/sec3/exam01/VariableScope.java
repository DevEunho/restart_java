package sec3.exam01;

public class VariableScope {
	public static void main(String[] args) {
		int v1= 15;
		if(v1>10) {
			int v2;
			v2 = v1 -10;
		}
		int v3 = v1+ v1 + 5; //v2 ������ ����Ҽ� ���� ������ error �߻��� ��, v2�� v1���� �ٲ�
		System.out.println(v3);
	}
}
