package sec3.exam01;

public class BreakOutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "<->" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
			
		} // Outter로 이름 붙힘 이걸 break함
		System.out.println("프로그램 실행 종료");
	}

}
