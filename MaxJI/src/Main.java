import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Find maximum j-i such that arra[j] > arr[i]");
		System.out.println("-------------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the length of the array");
			int lengthOfArray = scanner.nextInt();
			int[] array = new int[lengthOfArray];
			for(int index = 0; index < lengthOfArray; index++) {
				System.out.println("Enter the element "+(index+1));
				array[index] = scanner.nextInt();
			}
			PrintMaxJMinusI(array);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
	
	private static void PrintMaxJMinusI(int[] array) {
		int maxValue = Integer.MIN_VALUE;
		
		for(int index = 0; index < array.length-1; index++) {
			for(int secIndex = 1; secIndex < array.length; secIndex++) {
				if((secIndex - index) > maxValue && (array[secIndex] > array[index])) {
					maxValue = secIndex - index;
				}
			}
		}
		
		System.out.println("The maximum j-i such that array[j] is > than array[i] is "+maxValue);
	}
}
