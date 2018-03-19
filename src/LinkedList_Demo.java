import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedList_Demo 
{

	
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(5);
		ll.add("hi");
		ll.add('c');
		
		System.out.println(ll.size());
		System.out.println(ll.get(1));
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(5));
		System.out.println(ll.contains(12));
		System.out.println(ll.remove(0));
		System.out.println(ll.contains(5));
		
		ArrayList al2=new ArrayList();
		al2.add(2);
		al2.add("hi");
		ll.addAll(al2);
		System.out.println();

	}

}
