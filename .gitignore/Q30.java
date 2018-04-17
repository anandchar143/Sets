import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class Q30 {
public static void main(String args[]){

	HashMap<Integer ,String> map = new HashMap<Integer, String>();
	map.put(2, "hi");
	map.put(8,"hello");
	map.put(12,"hello world");
	for(Iterator <Entry<Integer,String>>it=map.entrySet().iterator();it.hasNext();){
		Entry<Integer,String>Entry = it.next();
		if(Entry.getKey() % 4==0)
		{
			it.remove();
			
		}
	}
	System.out.println("map size :"+map.size());
	
}
}
