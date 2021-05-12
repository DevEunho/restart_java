package sec3.exam01;

public class SwitchString {

	public static void main(String[] args) {
		
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("월급 : 700만");
			break;
		case "과장":
			System.out.println("월급 : 700만");
			break;
		default:
			System.out.println("300만원");
		}
	}

}
