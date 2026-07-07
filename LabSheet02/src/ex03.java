
public class ex03 {

	public static void main(String[] args) {
		
		numArrayController nums = new numArrayController();
		nums.display("Display an initail dataset: ");
		
		int[] copy_nums = new int[nums.getSize()+1];
		for (int i=0;i<nums.getSize();i++) {
			copy_nums[i] = nums.getNumArray()[i];
		}
		nums.setnumber(copy_nums);
		nums.display("\n\nAfter add 1 element size: ");
		
		nums.getNumArray()[nums.getSize()-1]=15;
		
		nums.display("\n\nAfter add 15");
		
	}

}
