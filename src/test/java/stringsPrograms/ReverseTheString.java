package stringsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.bouncycastle.util.Integers;

import com.github.dockerjava.api.model.Link;
import com.graphbuilder.struc.LinkedList;

public class ReverseTheString {

	public static void main(String[] args) {
		//using normal way
//        String s="software";
//        for(int i=s.length()-1;i>=0;i--)
//        {
//        	System.out.print(s.charAt(i));
//        }
		
		//using var
//		String s="software";
//		 String rev = " ";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.print(rev);

//		using toCharArray
//		String s="software";
//		char[] str = s.toCharArray();
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(str[i]);
//		}
       
		
		//using var count
//		String s="software";
//		char[] str = s.toCharArray();
//		int count=0;
//		for(char c:str)
//		{
//			count++;
//		}
//		for(int i=count-1;i>=0;i--) {
//			System.out.print(str[i]);
//		}
		
	  //using stringBuilder
//		StringBuilder sb = new StringBuilder("software");
//	System.out.println(sb.reverse());
	
	 
		// given string is pallindrome are not
//		String s="gadag";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		if(rev.equals(s))
//		{
//			System.out.println("given string is palindrome");
//		}
//		else {
//			System.out.println("given string is not palindrome");
//		}
		
		//reverse the  given sentence
//		String s="I am a software Engineer";
//		String[] st = s.split(" ");
//		for(int i=st.length-1;i>=0;i--) {
//			System.out.print(st[i]+" ");
//		}
		
		//remove the space btw sentence
//		String s="I am a software Engineer";
//		String[] st = s.split(" ");
//		for(int i=st.length-1;i>=0;i--) {
//			System.out.print(st[i]+"");
//		}
		
		//reverse the every word in the given sentence
//		String s="I am a software Engineer";
//		String[] st = s.split(" ");
//		for(int i=0;i<st.length;i++)
//		{
//			String str = st[i];
//			for(int j=str.length()-1;j>=0;j--)
//			{
//				System.out.print(str.charAt(j));
//			}
//			System.out.print(" ");
//
//		}
		
		
		//swap the first word to last word and last word to first word
//		String s="I am a software Engineer";
//		String[] st = s.split(" ");
//		String temp=st[0];
//		st[0]=st[st.length-1];
//		st[st.length-1]=temp;
//		for(int i=0;i<st.length;i++)
//		{
//			System.out.print(st[i]+" ");
//		}
		
		
		//count num of upper letters and lower letters in the string
//		String s="SofTwArE";
//		int uppercase=0;
//		int lowercase=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if((s.charAt(i))>='A'&& (s.charAt(i)<='Z'))
//					uppercase++;
//			else 
//				lowercase++;
//			}
//			System.out.println(uppercase);
//			System.out.println(lowercase);
//		}
		
		
		//remove the duplicates from the give string
//		String s="kannada";
//       String st = s.toLowerCase();
//	LinkedHashSet<Character> l = new LinkedHashSet<Character>();//insertion order is preserved
//	//HashSet<Character> hs = new HashSet<Character>();//insertion order is not preserved
//	for(int i=0;i<st.length();i++)
//	{
//		l.add(st.charAt(i));
//	}
//	for(Character set:l) {
//	System.out.print(set);
//	}
		
		
	//occurance of each character in astring
//	String s="kannada";
//	String st = s.toLowerCase();
//	HashSet<Character> hs = new HashSet<Character>();
//	for(int i=0;i<st.length();i++) {
//		hs.add(st.charAt(i));
//	}
//	for(Character h:hs)
//	{
//	int count=0;
//	for(int i=0;i<s.length();i++)
//	{
//			if(h==s.charAt(i))
//				count++;
//	}
//	
//	System.out.println(h+"   "+count);
//	
//	}
	
	
	//print only duplicate character count in the string
//	String s="kannada";
//	String st = s.toLowerCase();
//	HashSet<Character> hs = new HashSet<Character>();
//	for(int i=0;i<st.length();i++) {
//		hs.add(st.charAt(i));
//	}
//	for(Character h:hs)
//	{
//	int count=0;
//	for(int i=0;i<s.length();i++)
//	{
//			if(h==s.charAt(i))
//				count++;
//	}
//	if(count>1)
//	System.out.println(h+"   "+count);
//	
//	}

	//positions of each character in the string
//	String s="kannada";
//	String st = s.toLowerCase();
//	for(int i=0;i<s.length();i++) {
//		System.out.println(st.charAt(i)+" is in "+i);
//	}
	
	//positions
//	String s="kannada";
//	String st = s.toLowerCase();
//	LinkedHashSet<Character> l = new LinkedHashSet<Character>();
//	for(int i=0;i<s.length();i++) 
//	{
//		l.add(st.charAt(i));
//	}
//	for(Character al:l)
//	{
//		for(int i=0;i<s.length();i++)
//		{
//			if(al==s.charAt(i)) {
//				System.out.println(al+"is present in   "+(i+1));
//			break;
//			}
//		}
//	}
		
		
		
		
//		String s="kannada";
//		String st = s.toLowerCase();
//		LinkedHashSet<Character> l = new LinkedHashSet<Character>();
//		for(int i=0;i<s.length();i++) 
//		{
//			l.add(st.charAt(i));
//		}
//		for(Character al:l)
//		{
//			for(int i=s.length()-1;i>=0;i--)
//			{
//				if(al==s.charAt(i)) {
//					System.out.println(al+"is present in   "+(i+1));
//				break;
//				}
//			}
//		}
		
		//remove the duplicate words in a given sentence
//		String s="I am I am a software a Engineer";
//		String[] st = s.split(" ");
//		LinkedHashSet<String> ls = new LinkedHashSet<String>();
//		for(int i=0;i<st.length;i++)
//		{
//			ls.add(st[i]);
//		}
//		for(String l:ls) {
//			System.out.print(l+" ");
//			
//		}
		
		
		
//		//occurance of each word in sentence
//		String s="I am I am a software a Engineer";
//		String[] st = s.split(" ");
//		LinkedHashSet<String> ls = new LinkedHashSet<String>();
//		for(int i=0;i<st.length;i++)
//		{
//			ls.add(st[i]);
//		}
//		for(String l:ls) {
//		  int count=0;
//		  for(int i=st.length-1;i>=0;i--)
//		  {
//			  if(l.equals(st[i])) {
//				  count++;
//			  }
//		  }
//		  System.out.println(l+" is repetative "+count);
//			
//		}

		
		
//		//print only duplicate words count
//		String s="I am I am a software a Engineer";
//		String[] st = s.split(" ");
//		LinkedHashSet<String> ls = new LinkedHashSet<String>();
//		for(int i=0;i<st.length;i++)
//		{
//			ls.add(st[i]);
//		}
//		for(String l:ls) {
//		  int count=0;
//		  for(int i=st.length-1;i>=0;i--)
//		  {
//			  if(l.equals(st[i])) {
//				  count++;
//			  }
//		  }
//		  if(count>1)
//		  System.out.println(l+" is repetative "+count);
//			
//		}

		
		
		//print only duplicate count
//		int[] a= {5,2,4,5,2,5,5,5};
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			hs.add(a[i]);	
//		}
//		for(Integer s:hs)
//		{
//			int count=0;
//			for(int i=0;i<a.length;i++)
//			{
//			if(s==a[i]) {
//				count++;
//			}
//		    }
//	if(count>1)
//		System.out.println(s+" repatative  "+count);
//	}
		
		//remove duplicates from the given array
//		int[] a= {5,2,4,5,2};
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			hs.add(a[i]);	
//		}
//		for(Integer s:hs)
//		{
//			System.out.print(s+" ");
//		}
		
		//print positions without duplicates
//		int[] a= {4,5,4,1,5,3,2};
//		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			hs.add(a[i]);	
//		}
//		for(Integer s:hs)
//		{
//			for(int i=0;i<=a.length;i++)
//			{
//				if(s==a[i]) {
//					System.out.println(s+"is present in   "+(i+1));
//					break;
//				}
//			}
//		}
		
		
		//print positions in reverse without duplicates
//		int[] a= {4,5,4,1,5,3,2};//45132
//		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			hs.add(a[i]);	
//		}
//		for(Integer s:hs)
//		{
//			for(int i=a.length-1;i>=0;i--)
//			{
//				if(s==a[i]) {
//					System.out.println(s+"is present in   "+(i+1));
//					break;
//				}
//			}
//		}
		
		
		//error
//		int[] a= {4,5,4,1,5,3,2};
//		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			hs.add(a[i]);	
//		}
//		for(Integer s:hs)
//		{
//			int count=0;
//			for(int i=0;i<a.length;i++)
//			{
//				if(s==a[i]) {
//					count++;
//			}			
//		}
//		System.out.print(count);
//		}
//		
//		int[] a= {4,5,4,1,5,3,2};
//		int count=0;
//		for(int i=0;i<a.length;i++)
//		{
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]!=a[j])
//					count++;
//			}
//		
//			System.out.println(count);
//		}
//	}
		
		//count number of vowels present in a string with duplicates
//	String s="Engineer";
//	String str = s.toLowerCase();
//	//char[] st = str.toCharArray();
//	int count=0;
//	for(int i=0;i<str.length();i++)
//	{
//		char st = str.charAt(i);
//		if(st=='a'||st=='e'||st=='i'||st=='o'||st=='u')
//			count++;
//	}
//	System.out.println(count);
		
		
		
		//error
		//count number of vowels present in a string without duplicates
//		String s="Engineer";
//		String str = s.toLowerCase();
//		//char[] st = str.toCharArray();
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		int count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			set.add(s);
//		}
//		for(String s1:set)
//		{
//			if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
//			{
//				count++;
//			}
//		}
		
	   
		
		
		
		
		
		//segregate the alphabats numbers and special characters
//		String str="Engine12#@$";
//		//char[] st = str.toCharArray();
//		 String lowalpha = "";
//		 String uppalpha = "";
//		 String num = "";
//		 String sp = "";
//		for(int i=0;i<str.length();i++)
//		{
//			char st = str.charAt(i);
//			if(st>='a'  && st<='z')
//				lowalpha=lowalpha+st;
//			else if(st>='A'  && st<='Z')
//				uppalpha=uppalpha+st;
//			else if(st>='0' && st<='9')
//				num=num+st;
//			else
//				sp=sp+st;
//		}
//		System.out.println(lowalpha);
//		System.out.println(uppalpha);
//		System.out.println(num);
//		System.out.println(sp);

		
		
		
		//sum of the digits present in the string
//		String s="ki3g4g3";
//		int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char st = s.charAt(i);
//			if(st>='0' && st<='9')
//			{
//				int n = st-48;
//				sum=sum+n;
//			}
//		}
//		System.out.print(sum);
		
		
		//addition of two digits in the string it will work for any number(single digit,double digit,three digit)
//		String s="a11b12c2";
//		int sum=0;
//		int tsum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='0' && s.charAt(i)<='9')
//			{
//				int n=s.charAt(i)-48;
//				tsum=tsum*10+n;
//			}
//			else {
//				sum=sum+tsum;
//				tsum=0;
//			}
//		}
//		sum=sum+tsum;
//		System.out.println(sum);
		
		
		
		
//		String[] s= {"abc","dv","abcdd","abcd","ab"}
//		Str
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}

