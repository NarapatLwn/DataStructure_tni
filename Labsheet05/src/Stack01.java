
public class Stack01 {

	public static void main(String[] args) {
		StackArrayBased stack = new StackArrayBased(5);
		int[] carriage = {1,2,3,4,5};

		for (int i=0;i<carriage.length;i++) {
			System.out.println("Siding onto dead-end track: car "+carriage[i]);
			stack.push(carriage[i]);
		}
	System.out.println();
	System.out.print("Stack -> ");
	stack.printStack();
	System.out.println();
	
	while (!stack.isEmpty()) {
		System.out.println("Exiting a dead-end: car "+stack.pop());
	}
	System.out.println();
	
	System.out.print("Stack -> "); 
	stack.printStack();
	
	 }
	

}
