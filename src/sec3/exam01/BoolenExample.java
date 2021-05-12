package sec3.exam01;

public class BoolenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		boolean stop2 = false;
		if(stop2) {
			System.out.println("stop덮어쓰기테스트false");
		}else {
			System.out.println("stop덮어쓰기테스트true");
		}//<- 똑같은 stop으로 boolean 덮어씌울라 했는데 안됨 시@ㅏㅂㄹ
	}

}
