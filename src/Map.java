import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Map 
{

	
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put("Idly",8);
		hm.put("Dosai",15);
		hm.put("Poori",10);
		hm.put("vadai",5);
		hm.put("Pongal",30);
		hm.containsKey(5);
		Object o=hm.get("Dosai");
		System.out.println(o);
	//	Set s=hm.keySet();
		//System.out.println(s);
		Set s=hm.entrySet();
		System.out.println(s);
		
		
		java.util.Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//System.out.println(hm.containsKey("tea"));
		//System.out.println(hm.containsKey("Pongal"));
		//System.out.println(hm.containsValue(50));
		//System.out.println(hm.containsValue(5));
		//System.out.println(hm);
		
	}

}
