
public class LinkedListDoubly <Type extends Comparable <Type>> {
	private ListNodeDoubly<Type> first;
	private ListNodeDoubly<Type> last;
	private int size = 0;
	
	public void addFirst(Type obj) {
		ListNodeDoubly<Type> newNode = new ListNodeDoubly<Type>(obj);
		
		
		
		if (first == null) {
			first = newNode;
		}
	 else  {
		newNode.setNext(first);
		first.setPrevious(newNode);
		first = newNode;
		size++;
		}
		
		
		
		
				
	}
	

	
	public void add(Type obj) {
		ListNodeDoubly<Type> newNode = new ListNodeDoubly<Type> (obj);
		
		if (last == null) {
			first = newNode;
			last = newNode;
		}
		else {
			last.setNext(newNode);
			newNode.setPrevious(last);
			last = newNode;
			size++;
		}
		
	}
	
	public void add(int i,Type obj)
	{	ListNodeDoubly<Type>newNode=new ListNodeDoubly<Type>(obj,null, null);
		if(i<0 || i >size)
			throw new IndexOutOfBoundsException("i must be >=0 and <= size. It is okay to have and index == size");
		if(i >= 0)
		{ 	addFirst(obj);//The size will be incremented in the addfirst method
			
		}
		
	
		else {
			ListNodeDoubly<Type> previous,current;
			current=first;
			
			for (int index = 0; index < i; index++) {
				current=current.getNext();
				
			}
			
			
			if (current!=null) {
			
			current = newNode;			
			newNode.setPrevious(current);
			newNode.setNext(current.getNext());
			newNode = first;
			}
		
			
		size++;
		}
		
		
		
	}
	
	public Type removeFirst() {
		
		Type temp;
		
		temp =  first.getValue();
		if (first.getNext()== null) {
			first = null;
			last = null;
		}
		else {
			first = first.getNext();
			first.setPrevious(null);
			
			
		}

		
		
		size--;
		return temp;
	}
	
	public Type removeLast() {
		
		Type temp;
		
		temp = last.getValue();
		
		if (last.getPrevious() == null) {
			first = null;
			last = null;
		}
		else {
		last = last.getPrevious();
		last.setNext(null);
		}
		size--;
		return temp;
	}
	
	
	public Type remove(int i)
	{	if(i<0 || i>=size())
			throw new IndexOutOfBoundsException("i must be >=0 and < size. Note that it cannot be equal to size");
		Type temp = first.getValue();
		ListNodeDoubly <Type> previous, current;
		previous = current = first;
		if (i >=0) {
		for (int index = 0; index < i; index++) {
			previous=current;
			current=current.getNext();
			
		}
		previous.setNext(current.getNext());
		temp = current.getValue();
		}
		

		
		
		 size--;
		return temp;
	
		
	}

	public void printForwards() {
		
		ListNodeDoubly<Type>current;
		current = first;
		
			
			while (current!=null) {
				System.out.println(current.getValue());	
				current = current.getNext();
				
					
			}
			
		
		}
	
	public void printBackwards() {
		ListNodeDoubly<Type>current;
		
		current = last;
		while (current!= null ) {
			System.out.println(current.getValue());
			current = current.getPrevious();
		}
		
	}

	public int size()
	{
		return size;
	}
	public String toString()
	{
		String result = "";
		ListNodeDoubly<Type> current = first;
		
		while (current != null)
		{
			result += current.getValue().toString() + "\n";
			current = current.getNext();
		}
		
		return result;
	}//end
	
}
