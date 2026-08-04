
public class QueueTest {

	public static void main(String[] args) {
		
		//QueueArrayBased queue = new QueueArrayBased();
		QueueLinkedList queue = new QueueLinkedList();
		//input data
		queue.enqueue(10);
		queue.enqueue(11);
		
		System.out.println(queue.peek()); //first element 
		System.out.println(queue.dequeue()); //���10�͡�ҡ������ź����͡
		System.out.println(queue.peek());
	}

}