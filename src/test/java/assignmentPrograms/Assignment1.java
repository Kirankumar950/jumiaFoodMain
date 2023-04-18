package assignmentPrograms;

public class Assignment1 {

	public static void main(String[] args) {
        String s="aaabbcdddf";//a3b2cd3f
       //char[] st = s.toCharArray();
       int[] count=new int[26];
       for(int i=0;i<s.length();i++)
       {
    	  char ch = s.charAt(i);
    	  if(ch>='A' && ch<='Z')
    		  count[ch-65]++;
    	  else if(ch>='a' && ch<='z')
    		  count[ch-97]++;
       }
       for(int i=0;i<26;i++)
       {
    	   if(count[i]>=1) {
    		   
    		   System.out.print((char)(i+97)+""+count[i]);
    		   }
      
       }
	}}


