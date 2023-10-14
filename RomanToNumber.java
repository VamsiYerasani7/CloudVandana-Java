package cloudvandana;

import java.util.*;
import java.util.HashMap;

public class RomanToNumber {
	

	 public static void convertRomanToInt(String s)  
	    {  
	        HashMap<Character, Integer> map=new HashMap<Character, Integer>();    
	        map.put('I',1);  
	        map.put('V',5);  
	        map.put('X',10);  
	        map.put('L',50);  
	        map.put('C',100);  
	        map.put('D',500);  
	        map.put('M',1000);    
	  
	        int number = map.get(s.charAt(s.length()-1));   
	        for (int i = s.length()-2; i >=0; i--)  
	        {  
	        	if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
	        	{
	        		number-=map.get(s.charAt(i));
	        	}
	        	else
	        	{
	        		number+=map.get(s.charAt(i));
	        	}
	              
	        }  
	        System.out.println("The corresponding Integer value is: "+number);  
	}  
	    
	    public static void main (String args[])  
	    {  
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter a Roman Number");
	         String str=sc.nextLine();
	         convertRomanToInt(str);  
	    }  

}
