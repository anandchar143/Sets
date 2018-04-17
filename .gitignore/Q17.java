import java.io.*;

public class Q17 {

	 public static void main (String[] args) throws IOException{
		 BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		  System.out.println("\n Enter a Number :");
		  int n = Integer.parseInt(br.readLine());
		  int num =0, sum =0;
		  while(n!=0)
		  {
			  num = n%10;
			  sum = sum + (num*num);
			  n = n/10;
			  
		  }
		  System.out.println("\n sum of Individual digits : "+sum);
	 }
		 
		
}
