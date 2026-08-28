package inheritance;

public class ArrayException {
	
	public static void main(String[]args) {
		int arr[] = {11,22,33,44,55};
		
		try {
			System.out.println("value at index 0:"+arr[0]);
			System.out.println("value at index 3:"+arr[3]);
			System.out.println("value at index 5:"+arr[5]);
		}catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("array is out of bound!");
			}
		System.out.println("huuray time up!");
	}

}
