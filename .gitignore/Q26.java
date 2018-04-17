import java.util.*;
public class Q26 {
	public static int noOfnonRepeatedCharacters(String s1){
		StringBuffer sb=new StringBuffer(s1);
		for(int i=0;i<s1.length();i++)
			int n=0, i;
			for(int j=i+1;j<s2.length();j++)
				if(sb.charAt(i)==sb.charAt(j)){
					sb.deleteCharAt(j);
					n++; }
				if(n>0){
					sb.deleteCharAt(i);
					i--;
					}	
				}
		return sb.length();
	}
public static void main(String[] args) 
{
		String s1="preethi";
		System.out.println(noOfnonRepeatedCharacters(s1));
	}
}
}
