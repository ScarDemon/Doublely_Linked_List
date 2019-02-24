
public class LinkedListDoublyDriverMonmouthDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDoubly<String>list=new LinkedListDoubly<String>();
		System.out.println("\n***Testing add (add or addLast are the same, you can change the driver to accomodate your code***");
		list.add("Long Branch");
		list.add("Asbury Park");
		list.add("Freehold");
		list.add("Seaside Heights");
		list.add("Point Pleasant");
		list.add("Belmar");
		list.add("Neptune");
		list.add("Manasquan");
		list.add("Atlantic HighLands");
		list.add("Belmar");
		list.printForwards();
	
		System.out.println("\n***Testing addFirst***");
		list.addFirst("Bayone");
		list.addFirst("Newark");
		list.addFirst("Manalapan");
		list.printForwards();
	
		System.out.println("\n***Testing removeFirst() (or deleteFirst)***");
		System.out.println("removing: "+list.removeFirst());
		System.out.println("removing: "+list.removeFirst());
		System.out.println("removing: "+list.removeFirst());
		list.printForwards();
	
		System.out.println("\n***Testing add(int i,Type obj) which is insert***");
		list.add(0,"Manalapan");
		list.add(4,"Newark");
		list.add(list.size(),"Bayonne");
		list.printForwards();
	
		System.out.println("\n***Testing remove(int i)***");
		System.out.println("removing: "+list.remove(0));
		System.out.println("removing: "+list.remove(4));
		System.out.println("removing: "+list.remove(list.size()-2));
		list.printForwards();
		
		System.out.println("\n***Testing removeLast (or deleteLast)***");
		System.out.println("removing: "+list.removeLast());
		System.out.println("removing: "+list.removeLast());
		System.out.println("removing: "+list.removeLast());
		list.printForwards();
		
		
		
	/*	//We are NOT testing remove(Type obj) at this time
		System.out.println("\nTesting remove(Type obj)");
		System.out.println("removing: "+list.remove("Asbury Park"));
		System.out.println("removing: "+list.remove("Newark"));
		System.out.println("removing: "+list.remove("Neptune"));
		list.printForwards();
		*/
	
		System.out.println("\n *** Testing printBackwards -- iteratively (non-recursive) ****");
		list.printBackwards();
		
	
	}

}
/*
 ***Testing add (add or addLast are the same, you can change the driver to accomodate your code***
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing addFirst***
Manalapan
Newark
Bayone
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing removeFirst() (or deleteFirst)***
removing: Manalapan
removing: Newark
removing: Bayone
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing add(int i,Type obj) which is insert***
Manalapan
Long Branch
Asbury Park
Freehold
Newark
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar
Bayonne

***Testing remove(int i)***
removing: Manalapan
removing: Seaside Heights
removing: Bayonne
Long Branch
Asbury Park
Freehold
Newark
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing removeLast (or deleteLast)***
removing: Belmar
removing: Atlantic HighLands
removing: Manasquan
Long Branch
Asbury Park
Freehold
Newark
Point Pleasant
Belmar
Neptune

 *** Testing printBackwards -- iteratively (non-recursive) ****
Neptune
Belmar
Point Pleasant
Newark
Freehold
Asbury Park
Long Branch

		
		
 */
/*
 * 
***Testing add (add or addLast are the same, you can change the driver to accomodate your code***
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing addFirst***
Manalapan
Newark
Bayone
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing removeFirst() (or deleteFirst)***
removing: Manalapan
removing: Newark
removing: Bayone
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing add(int i,Type obj) which is insert***
Bayonne
Newark
Manalapan
Long Branch
Asbury Park
Freehold
Seaside Heights
Point Pleasant
Belmar
Neptune
Manasquan
Atlantic HighLands
Belmar

***Testing remove(int i)***
removing: Bayonne
removing: Asbury Park
removing: Neptune
Bayonne
Newark
Manalapan
Long Branch
Freehold
Seaside Heights
Point Pleasant
Belmar
Manasquan
Atlantic HighLands
Belmar

***Testing removeLast (or deleteLast)***
removing: Belmar
removing: Atlantic HighLands
removing: Manasquan
Bayonne
Newark
Manalapan
Long Branch
Freehold
Seaside Heights
Point Pleasant
Belmar
Manasquan

 *** Testing printBackwards -- iteratively (non-recursive) ****
Neptune
Belmar
Point Pleasant
Seaside Heights
Freehold
Asbury Park
Long Branch
Manalapan
Newark
Bayonne
*/
