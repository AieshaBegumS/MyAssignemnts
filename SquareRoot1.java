package Weekday.Assignments;

public class SquareRoot1 {

	public static void main(String[] args) {
		int num =  8;
		if(num <= 2) {
			System.out.println("Square Root is: " + num);
			return;
		}
		int i = 1;
		while(i*i <= num) 
		{
			i++;
		}
		
		System.out.println("Square Root of is: " + (i-1));
	}

}
