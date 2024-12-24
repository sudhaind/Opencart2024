package Javapractice2024October;

public class FindCharacter {

	public static void main(String[] args) {
		
		
		displayNumbersOnly();
	}
	
	public static void findCh()
	{
		
		String str ="java";
		
		char[] ch = str.toCharArray();
		
		
		for(Character c:ch)
		{
			//System.out.println(c);
			
			if(c =='v')
			{
				System.out.println('v');
				break;
			}
		}
	}
	
	public static void m1()
	{
		
		String str ="hello";
		
		System.out.println(str.charAt(1));
	}
	
	
	public static void StringToBytes() {
		
		
		String s1="Suresh";
		
		byte[] by=s1.getBytes();
		
		for(int i=0; i<by.length; i++)
		{
			
			System.out.print(by[i]);
			
			if(by.length-1 != i) {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	
	public static void BytesToString()
	{
		
		byte[] b1 = {'T','E','S','T','I','N','G'};
		
		byte[] b2 = {83,117,114,101,115,104};
		
		
		String s1 = new String(b1);
		
		String s2 = new String(b2);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
	}
	
	public static boolean stringVerification() {
		
		
		
		String str1 ="abc";
		
		String str2 ="abc";
		
		if (str1==str2)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
public static boolean stringVerification1() {
		
		
		
		String str1 ="abc";
		
		String str2 ="abc";
		
		if (str1.equalsIgnoreCase(str2))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}


public static void stringVerify()
{


	String s1 = new String("hello");

	String s2 = new String("hello");


	if(s1.equals(s2))
	{

		System.out.println("Both strings are equalfor this method");
	}


	if(s1 ==s2)
	{
		System.out.println("Both strings are equal");

	}

	else
	{
		System.out.println("Both strings are NOT equal");
	}
}

public static void m2()
{

	String s1="abc";

	String s2 = new String("abc");

	s2.intern();


	System.out.println(s1==s2);

	System.out.println(s2.intern());
	s2 =s2.intern();

	System.out.println(s1==s2);
}

public static void rev()
{


	String s1="java";


	String temp ="";



	for(int i=s1.length()-1;i >=0;i--)
	{

		temp = temp+s1.charAt(i);


	}

	System.out.println(temp);
}





public static void revwholeword()
{
	
	
	String s1 ="hello java";
	
	String[] s2 =s1.split(" ");
	
	/*
	 * for(String sp:s2) {
	 * 
	 * 
	 * System.out.println(sp); }
	 */
	String temp = "";
	
	
	for(int i=s2.length-1; i >=0;i--)
	{
		
		temp =temp+s2[i]+" ";
		
	}
	
	System.out.println(temp.trim());
}

public static void m4() {


	int[] num =new int[] {22,89,67,2,8,4,88,66,55};


	int largest_number=num[0];



	for(int i=0; i <num.length;i++)
	{


		if(num[i] > largest_number)
		{

			largest_number = num[i];
		}


	}

	System.out.println("The largestnumber in the given array is "+largest_number);



}

public static void m5()
{
	
	int[] num =new int[] {22,89,67,2,8,4,88,66,55};
	
	int smallest_number=num[0];
	
	for(int i=0; i < num.length;i++)
	{
		
		
		if(num[i] < smallest_number)
		{
			smallest_number= num[i];
			
		}
		
	}
	
	System.out.println("The smallestnumber in the given array is "+smallest_number);
}


public static boolean  Ispalindrome()
{



	String s ="madam";

	int len = s.length();

	boolean flag =false;

	for(int i=0; i<len;i++)
	{

		if(s.charAt(i)!=s.charAt(len-1-i))

			return false;

	}

	return true;
}


public static void frequentNumber()
{
	
	
	int[] num = new int[] {12,34,24,5,7,12,34,5,5};
	
	int freq=0;
	
	int max=0;
	
	for(int i=0; i < num.length;i++)
	{
		
		int search_num=num[i];
		int currentcount=0;
		
		
		for(int j=0; j< num.length;j++)
		{
			
			
			if(search_num == num[j])
			{
				currentcount++;
				
			}
		}
		
		
		if(currentcount > max)
		{
			
			max = currentcount;
			
			
		}
		
		freq=search_num;
	}

	
	System.out.println("The frequent number is "+freq +" and appeared in"+max+"times");

}

public static void sepAlphabets() {
	
	
	
	String item ="abc123";
	
	
	
	String alpha = item.replaceAll("[0-9]","");
	
	
	System.out.println("The alphabets are  "+ alpha);
	
	String num =item.replaceAll("[^0-9]", "");
	
	System.out.println("The numbers are  "+ num);
	
}


public static void displayNumbersOnly()

{
	String str="abc123";
	
	
	String result="";
	
	String n1="";
	
	for(int i=0;i < str.length();i++)
	{
		
		
		if(Character.isDigit(str.charAt(i)))
		{
			
			 result = result+str.charAt(i);
		}
		
		else
		{
			n1=n1+str.charAt(i);
		}
		
		
	}
	
	
	System.out.println(result);
	System.out.println(n1);
	
}

}
