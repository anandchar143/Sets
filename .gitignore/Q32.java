import java.io.*;

public class Q32 {
public static int VowelCheck(String s){
int c=0;
for(int i=0;i<s.length();i++)
{
	if('a'==s.charAt(i)||'e'==s.charAt(i)||'i'==s.charAt(i)||'o'==s.charAt(i)||'u'==s.charAt(i))
	{
		c++;
	}
}
if(c==5)
{
	return 1;
}
else
{
	return -1;
}
}
public static void main(String[] args){
String s="acebisouzz";
System.out.println(VowelCheck(s));
}
}
