package project1;

public class DList {
	public DListNode head;
	public DListNode tail;
	private int size;
	
	public DList() {
		size = 0;
		head = null;
		tail = null;
	}
	
	public DList(int[] node) {
		size = 1;
		head = new DListNode(node);
		tail = head;
	}
	
	public void insertEnd(int[] node) {
		if(size==0) {
			head = new DListNode(node);
			tail = head;
		}
		else {
			DListNode temp = new DListNode(node);
			tail.nextNode = temp;
			temp.preNode = tail;
			tail = temp;
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
	public DListNode getHead() {
		return head;
	}
	
	public DListNode getTail() {
		return tail;
	}
}
