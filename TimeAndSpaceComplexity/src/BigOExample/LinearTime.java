package BigOExample;

public class LinearTime {
	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array [i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] number = {1, 2, 4, 8, 16, 32, 64, 128};
		
		int target = 3;
		
		int index = linearSearch(number, target);
		
		if (index == -1) {
			System.out.println("The target number is not found");
		} else {
			System.out.println("The target number is found");
		}
	}
}