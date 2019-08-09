package logincredentials;
import java.util.Scanner;
import java.io.*;

public class Welcome extends Login{

	String Brand;
    String Material;
    String Status;
	int weight;
	int points;
	public void Status()
	{
		Scanner w=new Scanner(System.in);
		int c;
		System.out.println("----Welcome "+this.Name1+"----");
		System.out.println("Enter any of the below choices");
		System.out.println("1-Deposit Waste");
		System.out.println("2-Check Status");
		System.out.println("3-Check for any events");
		System.out.println("4-Advertise your event");
		System.out.println("5-Advertise your Brand");
		c=w.nextInt();
		if(c==1)
			
		{
			System.out.println("You have entered the deposit section");
			//w.depositWaste();
		}
		else if(c==2)
		{
			System.out.println("You have entered the Status section");
			//w.checkStatus();
		}
		else if(c==3)
		{
			System.out.println("You have entered the Events section");
			//w.checkEvents();
		}
		else if(c==4)
		{
			System.out.println("You have entered the AdvertiseEvents section");
			//w.advertiseEvent();
		}
		else if(c==5)
		{
			System.out.println("You have entered the AdvertiseBrands section");
			//w.advertiseBrand();
		}
		else
		{
			//System.out.prinln("Invalid Selection");
		}
	}
	
}
