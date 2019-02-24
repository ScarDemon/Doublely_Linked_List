
public class ListNodeDoubly<Type> {
	private ListNodeDoubly<Type> previous;
	private Type value;
	private ListNodeDoubly<Type> next;
	
	public ListNodeDoubly (Type initObj, ListNodeDoubly<Type> initNext, ListNodeDoubly<Type> initPrev)
	{
		value = initObj;
		next = initNext;
		previous = initPrev;
	}
	
	public ListNodeDoubly(Type initObj) {
		next = null;
		previous = null;
		value = initObj;
	}
	public Type getValue()
	{
		return value;
	}
	
	public ListNodeDoubly<Type> getNext()
	{
		return next;
	}
	
	public ListNodeDoubly<Type> getPrevious() {
		return previous;
	}
	
	
	
	public void setValue (Type newValue)
	{
		value = newValue;
	}
	
	public void setPrevious(ListNodeDoubly<Type> newPrevious) {
		previous = newPrevious;
	}
	public void setNext(ListNodeDoubly<Type> newNext)
	{
		next = newNext;
	}
}
