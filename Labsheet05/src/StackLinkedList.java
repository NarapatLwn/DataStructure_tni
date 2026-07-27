
public class StackLinkedList {
   
   // pointer to the top node
   private Node top;

   // create an empty stack /t1=O1
   public StackLinkedList() {
      top = null;
   }
   public boolean isEpmty() {
	   if (top == null) {
		   return true;
	   }
	   return false;
   }
   public void push(int value) {
	   Node new_node = new Node(value);
	   if (isEpmty()) { //same as (isEpmty())==true)
		   top = new_node;
	   } else {
		   new_node.next = top;
		   top = new_node;
	   }
   }
   public int pop() {
	   if (isEpmty()) {
		   return -1;
	   } else {
		   Node temp_node = top;
		   int temp_data = temp_node.data;
		   top = top.next;
		   temp_node = null;
		   return temp_data;
	   }
	   
   }
   public void popAll() {
	   top = null;
   }
}