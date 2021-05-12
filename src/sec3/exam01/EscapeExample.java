package sec3.exam01;

public class EscapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("번호\t이름\t직업");
		System.out.println("행단위출력 \n");
		System.out.println("행단위출력 \n");
		// \t은 탭 만큼 띄움
		// \n은 줄 띄움
		
		System.out.println("우리는 \"개발자\"입니다.");
		// \" 를 해야 문자열 안에 "를 쓸 수 있음
		System.out.println("봄\\여름\\가을\\겨울");
		// \\를 해야 문자열 안에 \를 쓸 수 있음 
	}

}
