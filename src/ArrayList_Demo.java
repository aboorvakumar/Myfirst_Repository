package learn.java.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;


public class ArrayList_Demo 
{

	
	public static void main(String[] args)
	{
		ArrayList o=new ArrayList();
		o.add(5);
		o.add("hi");
		o.add('c');
		o.size();
	//	o.toArray(o);
		System.out.println(o.size());
		System.out.println(o.get(1));
		System.out.println(o.isEmpty());
		System.out.println(o.contains(5));
		System.out.println(o.contains(12));
		System.out.println(o.remove(0));
		System.out.println(o.contains(5));
		//System.out.print(o);
		
		ArrayList al2=new ArrayList();
		al2.add(2);
		al2.add("hi");
		//o.s
		o.addAll(al2);
		System.out.println(o);
		o.indexOf(al2);
		ArrayList al=new ArrayList();
		
		al.add("ak");
		al.add(52);
		al.add(8);
		al.add(10);
		al.add(2);
		System.out.println(al);
		String[] name;
		//colection have type cast is necasary problems.
		String s=(String) al.get(0);
		String s2=(String) al.get(1).toString();
		System.out.println(s);
		System.out.println(s2);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 8));
		System.out.println(Collections.binarySearch(al, 300));
		
		
		al.add(251);
		al.add(345);
		al.iterator();
		java.util.Iterator i=  al.iterator();
		System.out.println();
		System.out.println(al);
		while(i.hasNext())
		{
			if(i.next().equals(5))
				{
			System.out.println(i.next());
				}
		System.out.println(i.next());
		}
		
		
		
		
		
		
		
		

	}

}


