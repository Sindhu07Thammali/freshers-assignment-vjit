package logincredentials;

import java.util.Scanner;
import java.io.*;


public class Login  
{
	    static String Brand;
	    static String Material;
	    static String Status;
		static int weight,Duracell,Amaron,Exide,Nipon;
		static int points,batteries,scrap,electronic,automobile;
		static int sum=0;
		static String Name1;
		static String Email1;
		static String Name2;
		static String Email2;
		static String Name3;
		static String Email3;
	    public String Password;
	    public String Password2;
	    static int Plastic=0, Glass=0, Metal=0,Cadburys=0,Parle=0,Nestle=0,Amul=0;
	    static int cocacola=0,thumbsup=0,mountainDew=0,Pepsi=0,Maaza=0;
		public void login()
		{
			Scanner sc=new Scanner(System.in);
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
			System.out.println("      --REGISTER HERE--     ");
			System.out.println("Enter your Name here:");
	    	this.Name1=s.nextLine();
            System.out.println("Enter your Email ID:");
            this.Email1=s.nextLine();
			System.out.println("Enter a password with only characters");
			this.Password=s.nextLine();
			System.out.println("Re-enter the password for verification");
			this.Password2=s.nextLine();
			if(Password.equals(Password2))
			{
				System.out.println("--You have successfully Registered--");
				
			}
			else
			{
				System.out.println("The passwords you have entered do not match!");
				System.out.println("Enter a password with only characters");
				Password=s.nextLine();
				System.out.println("Re-enter the password for verification");
				Password2=s.nextLine();
				if(Password.equals(Password2))
				{
					System.out.println("      --You have successfully Registered--    ");
					
					
				}
				
		    }
		}
	   public void Status()
		{
		    System.out.println("-------HOME SECTION-----");
			Scanner w=new Scanner(System.in);
			int c;
			System.out.println("Enter any of the below choices");
			System.out.println("1-Deposit Waste");
			System.out.println("2-Check Status");
			System.out.println("3-Check for any events");
			System.out.println("4-Advertise your event");
			System.out.println("5-Advertise your Brand");
			System.out.println("6-exit");
			c=w.nextInt();
			if(c==1)
				{
				System.out.println("You have entered the deposit section");
				depositWaste();	
				}
			else if(c==2)
			{
				System.out.println("You have entered the Status section");
				checkStatus();
			}
			else if(c==3)
			{
				System.out.println("You have entered the Events section");
				checkEvents();
			}
			else if(c==4)
			{
				System.out.println("You have entered the AdvertiseEvents section");
				//advertiseEvent();
			}
			else if(c==5)
			{
				System.out.println("You have entered the AdvertiseBrands section");
				//advertiseBrand();
			}
			else if(c==6)
			{
				System.out.println("Your Efforts contribute a lot to the welfare of our society!");
				System.out.println("HAVE A GREAT DAY :) !!");
				System.exit(1);
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
	  public void depositWaste()
	  {
		  int c;
		  Scanner w=new Scanner(System.in);
		  System.out.println("Choose any of the below options");
		  System.out.println("1.Plastic 2.Glass 3.Metal");
		  c=w.nextInt();
		  if(c==1)
		  {
			  Plastic();
		  }
		  else if(c==2)
		  {	  			
			  Glass();
		  }
		  else if(c==3)
		  {
			  Metal();
		  }
		  else
		  {
			  System.out.println("Invalid selection");
			  depositWaste();
		  }
	  }
	  public void Plastic()
	  {
		  Scanner w=new Scanner(System.in);
		  Material="Plastic";
		  System.out.println("Select the type of the plastic waste from below");
		  System.out.println("1.Plastic Bottles  2.Food Wrappers 3.Polyethene Bags 4.Sanitary Products 5.Cosmetics");
		  int Ch=w.nextInt();
		  if(Ch==1)
		  {
			  System.out.println("Select the brand");
			  System.out.println("1.CocaCola 2.ThumbsUp 3.MountainDew 4.Pepsi");
			  int v=w.nextInt();
			  if(v==1)
			  {
				  cocacola++;
				  System.out.println("Enter the weight of the product");
				  Weight();
				  
			  }
			  else if(v==2)
			  {
				  thumbsup++;
				  System.out.println("Enter the weight of the product");
				  Weight();
			  }
			  else if(v==3)
			  {
				  mountainDew++;
				  System.out.println("Enter the weight of the product");
				  Weight();

			  }
			  else if(v==4)
			  {
				  Pepsi++;
				  System.out.println("Enter the weight of the product");
				  Weight();

			  }
			  else 
			  {
				  System.out.println("Enter the brand");
				  Brand=w.nextLine();
				  System.out.println("Enter the weight of the product");
			  }
		  }
		  else if(Ch==2)
		  {
				  System.out.println("Select the brand");
				  System.out.println("1.Amul 2.Nestle 3.Parle 4.Cadbury's");
				  int v=w.nextInt();
				  if(v==1)
				  {
					  Amul++;
					  System.out.println("Enter the weight of the product");
					  Weight();
					  
				  }
				  else if(v==2)
				  {
					  Nestle++;
					  System.out.println("Enter the weight of the product");
					  Weight();
				  }
				  else if(v==3)
				  {
					  Parle++; 
					  System.out.println("Enter the weight of the product");
					  Weight();

				  }
				  else if(v==4)
				  {
					  Cadburys++;
					  System.out.println("Enter the weight of the product");
					  Weight();

				  }
				  else 
				  {
					  System.out.println("Enter the brand");
					  Brand=w.nextLine();
					  System.out.println("Enter the weight of the product");
				  }
		  }
	      else 
			  {
				  System.out.println("Invalid selection");
				  Plastic();
				  
			  }

	  }
	  public void Glass()
	  {
		  Scanner w=new Scanner(System.in);
		  Material="Glass";
		  System.out.println("Select the type of the glass waste from below");
		  System.out.println("1.Glass bottles  2.Window panes/Doors/Mirrors 3.Food containers 4.Jewellery Bangles 5.Tube-lights/Bulbs");
		  int Ch=w.nextInt();
		  if(Ch==1)
		  {
			  System.out.println("Select the brand");
			  System.out.println("1.CocaCola 2.ThumbsUp 3.Maaza 4.Pepsi");
			  int v=w.nextInt();
			  if(v==1)
			  {
				  cocacola++;
				  System.out.println("Enter the weight of the product");
				  Weight();
				  
			  }
			  else if(v==2)
			  {
				  thumbsup++;
				  System.out.println("Enter the weight of the product");
				  Weight();
			  }
			  else if(v==3)
			  {
				  Maaza++;
				  System.out.println("Enter the weight of the product");
				  Weight();

			  }
			  else if(v==4)
			  {
				  Pepsi++;
				  System.out.println("Enter the weight of the product");
				  Weight();

			  }
			  else
			  {
				  System.out.println("Enter the brand");
				  Brand=w.nextLine();
				  System.out.println("Enter the weight of the product");

			  }
		  }
		 else 
			  {
				  System.out.println("Invalid selection");
				  Glass();
				  
			  }

	  }
	  public void Metal()
	  {
		  Scanner w=new Scanner(System.in);
		  Material="Metal";
		  System.out.println("Select the type of the metal waste from below");
		  System.out.println("1.Batteries  2.Industrial Scrap 3.Electronic Waste 4.Automobiles");
		  int Ch=w.nextInt();
		  if(Ch==1)
		  {
			  batteries++;
			  System.out.println("Select the brand");
			  System.out.println("1.Duracell 2.Amaron 3.Exide 4.Nipon");
			  int v=w.nextInt();
			  if(v==1)
			  {
				  Duracell++;
				  System.out.println("Enter the weight of the product");
				  Weight();
				  
			  }
			  else if(v==2)
			  {
				  Amaron++;
				  System.out.println("Enter the weight of the product");
				  Weight();
			  }
			  else if(v==3)
			  {
				  Exide++;
				  System.out.println("Enter the weight of the product");
				  Weight();

			  }
			  else if(v==4)
			  {
				  Nipon++;
				  System.out.println("Enter the weight of the product");
				  Weight();

			  }
			  else 
			  {
				  System.out.println("Enter the brand");
				  Brand=w.nextLine();
				  System.out.println("Enter the weight of the product");
			  }
		  }
	      else 
			  {
				  System.out.println("Invalid selection");
				  Plastic();
				  
			  }
	  }
	public void Weight()
	{
		Scanner o=new Scanner(System.in);
		int wt=o.nextInt();
		int q;
		if(Material=="Plastic")
		{
		  q=wt/10;
		 points=5*(q+1);
		 System.out.println("Congratulations!! You have scored "+points+" points");
		 sum=sum+points;
		 Status();
		}
		else if(Material=="Glass")
		{
			if(wt>=30)
			{
				q=wt/30;
				points=((q*20)-((q-1)*10));
				System.out.println("Congratulations!! You have scored "+points+" points");
				sum=sum+points;
				Status();
			}
			else if((0<wt)&&(wt<30))
			{
				points=10;
				System.out.println("Congratulations!! You have scored "+points+" points");
				sum=sum+points;
				Status();
			}
				
		}
		else if(Material=="Metal")
		{
		     if(wt>=50)
		     {
		    	 q=wt/50;
		    	 points=q*20;
		    	 System.out.println("Congratulations!! You have scored "+points+" points");
		    	 sum=sum+points;
		    	 Status();
		     }
		     else if((0<wt)&&(wt<50))
		     {
		    	 points=10;
		    	 System.out.println("Congratulations!! You have scored "+points+" points");
		    	 sum=sum+points;
		    	 Status();
		     }
		}
		
	}
	public void Welcome()
	{
		 System.out.println("----Welcome "+this.Name1+"----");
	}
	public void checkStatus()
	{
		System.out.println("You have a total credit score of: "+sum+" Points");
		Status();
	}
	public void checkEvents()
	{
		if(events==0)
             System.out.println("There are no events yet! Visit again after sometime for more updates!!");
	}

	public static void main(String[] args) {
		 String str1;
		 String str="yes";
		 String str3="Yes";
		 Scanner ss=new Scanner(System.in);
		 System.out.println("-----SWACHH BHARATH APP----");
		 Login s=new Login();
		 System.out.println("Are you a registered user?");
	     str1=ss.nextLine();
		 if(str1.equals(str))
		     s.login();
		 else if(str1.equals(str3))
			 s.login();
		 else
			 s.register();
		 s.Welcome();
		 s.Status();
		 
	}


}
