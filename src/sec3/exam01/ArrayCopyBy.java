package sec3.exam01;

public class ArrayCopyBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldInArray = { 1, 2, 3};
		int[] newInArray = new int[5];
		
		for(int i=0; i<oldInArray.length; i++) {
			newInArray[i]=oldInArray[i];
		}
		for(int i=0; i<newInArray.length; i++) {
			System.out.println(newInArray[i] + ",");
		}
		
	}

}
