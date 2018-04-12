package project1;

public class DListNode {
	public int[] node;
	public DListNode preNode;
	public DListNode nextNode;
	
	public DListNode() {
		node = new int[4];
		preNode = null;
		nextNode = null;
	}
	
	public DListNode(int[] node) {
		this.node = node;
		preNode = null;
		nextNode = null;
	}
	
}
