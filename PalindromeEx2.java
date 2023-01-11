package Weekday.Assignments;

public class PalindromeEx2 {

	public static void main(String[] args) {
		String str ="race a car";
		String reverse ="";
		String s1= str.toLowerCase().replaceAll(" ","");
		System.out.println("Rev string:"+s1);
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		if(s1.equals(reverse))
		{
			System.out.println("String is Palindrome: "+reverse);
			System.out.println(true);
		}
		else
		{
			System.out.println("String is not Palindrome: "+reverse);
			System.out.println(false);
		}
		
}
}
