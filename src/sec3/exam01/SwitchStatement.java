package sec3.exam01;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*6) + 1;
		
		switch(num) { // <-변수를 num으로 정함 얘가변하면서 case해당하면 실행
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("default로 6번");
			break;		
		}
	}

}
