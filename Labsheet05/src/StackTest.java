
public class StackTest {

	public static void main(String[] args) {
		
		StackArrayBased num_stack = new StackArrayBased(5);
		
		num_stack.push(15);  //push is add element
		num_stack.push(16); 
		num_stack.push(17); //out put = สนใจที่ตัวบนสุดของstack
		
		//data in stack linked list -> [17,16,15]
		
		System.out.println("Pop stack = "+num_stack.pop());
		//data in stack linked list -> [16,15]
		System.out.println("Pop stack = "+num_stack.peek());
		System.out.println("Pop stack = "+num_stack.peek());
		
		
		
		
		//System.out.println("Peek stack = "+num_stack.peek());
		//System.out.println("Peek stack = "+num_stack.peek());
		//System.out.println("Pop stack = "+num_stack.pop());
		//System.out.println("Peek stack = "+num_stack.peek());
		//System.out.println("Pop stack = "+num_stack.pop());
		//System.out.println("Peek stack = "+num_stack.peek()); //-1 = empty list
		
		
	}

}
