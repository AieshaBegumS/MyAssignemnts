package Weekday.Assignments;

public class HappyNumber {

	public static void main(String[] args) {
		// 5/20

		int number=19;
		int remind=0;
		int sum=0;
		while (number > 9)
        {
            while (number > 0)
            {
            	remind = number % 10;
                sum = sum + (remind* remind);
                number = number / 10;
            }
            number = sum;
            sum = 0;
        }
        if (number == 1)
        {
            System.out.println("Given number is Happy numberber");
        }
        else
        {
            System.out.println("Given number is not Happy numberber");
        }
	}

}
