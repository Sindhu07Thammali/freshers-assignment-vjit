package logincredentials;

import java.util.Scanner;
import java.io.*;

public class Login {
		static String Name1;
		static String Email1;
		static String Name2;
		static String Email2;
		static String Name3;
		static String Email3;
	    public String Password;
	    public String Password2;
		public void login()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("-----SWACHH BHARATH APP----");
			System.out.println("       --LOGIN HERE--       ");
			System.out.println("Enter your email here");
			this.Email1=sc.nextLine();
			System.out.println("Enter your password");
			this.Password=sc.nextLine();
			System.out.println("--You have Successfully logged in--");
		}
		public void register()
		{
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Name here:");
			this.Name1=s.nextLine();
			System.out.println("Enter your Email ID:");
			this.Email1=s.nextLine();
			System.out.println("Enter a password with only characters");
			Password=s.nextLine();
			System.out.println("Re-enter the password for verification");
			Password2=s.nextLine();
			if(Password.equals(Password2))
			{
				System.out.println("--You have successfully Registered--");
				
			}
			else
			{
				System.out.println("Re-enter Password,Two Passwords are not same");
				System.out.println("Enter a password with only characters");
				Password=s.nextLine();
				System.out.println("Re-enter the password for verification");
				Password2=s.nextLine();
				if(Password.equals(Password2))
				{
					System.out.println("--You have successfully Registered--");
					
				}
				
		    }
		}
	public static void main(String[] args) {
		 String str1;
		 String str="yes";
		 String str3="Yes";
		 Scanner ss=new Scanner(System.in);
		 Login s=new Login();
		 System.out.println("Are you registered user?");
	     str1=ss.nextLine();
		 if(str1.equals(str))
		     s.login();
		 else if(str1.equals(str3))
			 s.login();
		 else
			 s.register();
		}

}
