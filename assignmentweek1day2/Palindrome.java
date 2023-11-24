package assignmentweek1day2;

public class Palindrome {

	public static void main(String[] args) {
		int a=121;
		int b=a;
		int rev=0;
		
		
		
		while(a!=0){
			rev=rev*10+a%10;
			a=a/10;
		}
		
		if (b==rev) {
			System.out.println("Given value is palindrome " +b);
		}
		else
			
		{
			System.out.println("Given value is not palindrome " +b);
			
		}
		
	}

}
