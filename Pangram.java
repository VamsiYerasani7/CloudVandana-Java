package cloudvandana;
import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				count++;
			}
		}
		if(count==str.length())
		{
			System.out.println("Giving String is a Pangram");
		}
		else
		{
			System.out.println("Giving String is Not a Pangram");
		}

	}

}
