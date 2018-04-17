import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Q15 {
	 public static void main (String[] args){
		 System.out.println("enter the Str to rev :");
		 Scanner str = new Scanner(System.in);
				String s=str.nextLine();
		 String reverse ="";
		 int length = s.length();
		 for(int i=length -1; i>=0;i--)
		 {
			 if(i==0)
			reverse = reverse + s.charAt(i);
			 else
			reverse = reverse + s.charAt(i)+"-";
			 
		 }
		 System.out.println(" Rev Str is:");
		 System.out.println(reverse);
		 
	 }
		

}
