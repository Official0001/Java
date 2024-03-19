import java.util.*;

public class PalindromeCheck{
	public static void main(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem; 
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		System.out.printf("Palindrome");
		else
		System.out.printf("Not Palindrome");
		
	}
}