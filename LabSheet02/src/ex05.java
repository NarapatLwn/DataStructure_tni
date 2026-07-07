
public class ex05 {

	public static void main(String[] args) {
		//ลบข้อมูลตัวสุดท้ายของอาร์เรย์ออก
		
		numArrayController nums = new numArrayController();
		nums.display("Display an initail dataset: ");
		
		int[] copy_nums = new int[nums.getSize()-1];{
		
			for (int i=0;i<copy_nums.length;i++) {
		copy_nums[i] = nums.getNumArray()[i];
		}
		nums.setnumber(copy_nums);
		nums.display("\n\nAfter deleted the element:");
		

		}
	}

}
