package Weekday.Assignments;

public class PalindromeEx1 {

	public static void main(String[] args) {
		String str ="A man,a plan,a canal:Panama";
		String reverse ="";
		String str1= str.toLowerCase().replaceAll(",","").replaceAll(" ", "").replaceAll(":", "");
			
		for(int i=str1.length()-1;i>=0;i--)
		{
			reverse=reverse+str1.charAt(i);
		}
		if(str1.equals(reverse))
		{   
			System.out.println("String is Palindrome: "+reverse);
			System.out.println(true);
		}
		else
		{
			System.out.println("String is Not a Palindrome:");
			System.out.println(false);
		}

	}

}
