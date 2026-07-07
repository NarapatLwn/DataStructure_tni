
public class ex04 {

	public static void main(String[] args) {
		//ลบข้อมูลตัวแรกออก
		numArrayController nums = new numArrayController();
		nums.display("Display an initail dataset: ");
		
		int[] copy_nums = new int[nums.getSize()-1];{
		
			for (int i=0;i<copy_nums.length;i++) {
		copy_nums[i] = nums.getNumArray()[i+1];
		}
		nums.setnumber(copy_nums);
		nums.display("\n\nAfter deleted the element:");
		}

	}

}

