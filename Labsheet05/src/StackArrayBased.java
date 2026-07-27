
public class StackArrayBased {
	 private int[] stacks; // array to store elements
	 private final int MAX_STACK = 50; // maximum size of stack
	 private int top; // index of the top element
		 
	// create an empty stack with a maximum size
	 public StackArrayBased() {
	 stacks = new int[MAX_STACK];
	 top = -1;  //ถ้าtopมีค่าเท่ากับ-1 แสดงว่าเป็นลิสต์เปล่า
	 }
		 
	 // create an empty stack with a specific size กำหนดไซส์เอง
	 public StackArrayBased(int capacity) {
	 stacks = new int[capacity];
	 top = -1;
	 
	 }
	
	 public boolean isEmpty() {
		 if (top == -1) {
			 return true;
		 }
		 return false ;
	 }
	 public boolean isFull() { //จำเป็นต้องมีใน array base
		 if (top == stacks.length-1) { 
			 return true;
		 }
		 return false;
	 }
	 public boolean push(int new_element)  {
		 if (isFull() == false) {  //same as (!isFull())
			 top++;
			 stacks[top] = new_element;
			 return true;
	     } 
		 return false;
	 }
	 public int peek() { //can use top()
		 if (!isEmpty()) { // same as (isEmpty() == false)
			 return stacks[top];
		 }
		 return -1;
	 
	 }
	 
	 public int pop() {
		 if (!isEmpty()) {
			 int top_element = stacks[top];
			 top--;
			 return top_element;
		 }
		     return -1;
	 }
	 public void popAll() {
		 stacks = new int[MAX_STACK];
		 top = -1;
	 }
	 public void printStack() {
		    System.out.print("[");
		    for (int i = 0; i <= top; i++) {
		        System.out.print(stacks[i]);
		        if (i < top) {
		            System.out.print(", ");
		        }
		    }
		    System.out.println("]");
		}
	 
}
