import java.util.*;
class Login
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		String un,pw;
		System.out.println("\tLogin");
		
		System.out.println("Enter the Username");
		un = obj.next();
		System.out.println("Enter the Password");
		pw = obj.next();

		System.out.println("Username"+un);	
		System.out.println("Password"+pw);
	}
}
