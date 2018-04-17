package list;

public class LockDList extends DList{
	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
	    return new LockDListNode(item, (LockDListNode)prev, (LockDListNode)next);
	  }
	
	public void remove(DListNode node) {
	    // Your solution here.
		  if(node==null)
			  return;
		  if(((LockDListNode)node).locked == true)
			  return;
		  node.prev.next = node.next;
		  node.next.prev = node.prev;
	  }
	
	public void lockNode(DListNode node) {
		if(node==null)
			  return;
		((LockDListNode)node).locked = true;
	}
}
