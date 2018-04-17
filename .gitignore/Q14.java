import java.util.Scanner;
import java.util.StringTokenizer;


public class Q14 {
	 public static String LenHigStr(String s1){
		  int max=0;
		     String s2=null;
		        StringTokenizer t=new StringTokenizer(s1," ");
		        while(t.hasMoreTokens()){
		         s1=t.nextToken();
		         int n=s1.length();
		         if(n>max){
		          max=n;
		          s2=s1;  }
		         }
		        int val =s2.length();
		        String l=String.valueOf(val);
		        System.out.println("Max string len is :"+l);
		        
		        return s2;
		 }
		 public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the String:");
		  String s1=s.nextLine();
		  System.out.println("the lengthiest string is:"+LenHigStr(s1));
		  }
		
}
