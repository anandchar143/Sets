
public class RetrivedArray{

public static int[] retrievePostion(int[] a,int[] b)
{
	int[] c=new int[a.length];
	int i;
	for(i=0;i<c.length;i++)
	{
		if(i%2==0)
			c[i]=b[i];
		if(i%2!=0)
			c[i]=a[i];
	}
	return c;
}
public static void main(String[] args)
{
	int[] a={12,1,32,3};
	int[] b={0,12,2,23};
	int[] c=retrievePostion(a,b);
	for(int d:c)
		System.out.println(d);
}

}
