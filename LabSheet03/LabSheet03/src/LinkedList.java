
public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;

	}

	public String traversal() {
		Node current_node = head;
		String result = "[";
		boolean first_node = true;

		while (current_node != null) {
			if (first_node == false)
				result += ",";
			result += current_node.data + "";
			current_node = current_node.next;
			first_node = false;
		}
		result += "]";
		return result;
	}

	public void insert(int position, Object value) {
		Node new_node = new Node(value);

		if (head == null) { // ¡Ã³Õà»ç¹ÅÔÊµìà»ÅèÒ
			head = new_node;
		} else if (position == 0) {
			new_node.next = head;
			head = new_node;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position - 1) {
				current_node = current_node.next;
				current_position++;
			}
			new_node.next = current_node.next;
			current_node.next = new_node;
		}

	}

	public void insert(Object value) { 
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else {
			Node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}

	}
		//การลบตัวแรก
	public void remove(int position) {
		if (position == 0) {
			Node current_node = head;
			head = current_node.next;
		//ถ้าไม่ใช่การลบข้อมูลตัวแรก
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node.next.next != null && current_position < position - 1) {
				current_node = current_node.next;
				current_position++;
			}
			if (current_node.next != null) {
				current_node.next = current_node.next.next;
			}
		}
	}
		//ลบข้อมูลตัวสุดท้าย
	public void removeLastElement() {
		if (head != null) {
			if (head.next == null) {
				head = null;
			} else {
				Node current_node = head;
				while (current_node.next.next != null) {
					current_node = current_node.next;
				}
				current_node.next = null;
			}
		}
	}//Ex 8 
	public int length() {
		Node current_node = head;
		int count = 0;
		while(current_node!=null){
			count++;
			current_node = current_node.next;
		}
		return count ;
	} //Ex 9
	public Object get(int position) {
		Node current_node = head;
		int current_position = 0;
		while (current_node!=null&& current_position<position) {
			current_node = current_node.next;
			current_position++;
		}
		return current_node.data ;
	} //Ex 10
	public void set(int position,Object value) {
		Node current_node = head;
		int current_position = 0;
		while (current_node!=null&& current_position<position) {
			current_node = current_node.next;
			current_position++;
		}
		 current_node.data = value;
	} //Ex 11
	public void clear() {
		head = null;
	}

}
