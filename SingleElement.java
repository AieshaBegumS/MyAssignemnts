package Weekday.Assignments;

public class SingleElement {
//4/20
	public static void main(String[] args) {
		int numbers[] = { 4 ,1,2,1,2};

		for (int i = 0; i < numbers.length; i++) {
			int a = 0;
			for (int j = 1; j < numbers.length - 1; j++) {
				if (numbers[i] == numbers[j]) {
					a++;
				}

			}
			if (a == 0) {
				System.out.println(numbers[i]);
			}

	}
	}
}
	