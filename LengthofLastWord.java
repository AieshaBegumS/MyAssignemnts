package Weekday.Assignments;

public class LengthofLastWord {

	public static void main(String[] args) {
		String str = "I want to learn Automation";
		System.out.println("String:  "+str);
        String[] strArray = str.split(" ");
        int count = strArray[strArray.length-1].length();
        System.out.println("Length of last word '"+ strArray[strArray.length-1]+ "' is: " + count);
	}

}
