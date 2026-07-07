
public class ex01 {

	public static void main(String[] args) {
		
		int [] num = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length ="+ num.length);
		
		System.out.println("First element = "+ num[0]);
		
		System.out.println("middle element = "+ num[num.length/2]);
		
		//ถ้าจะแสดงทั้งหมดต้องใช้loop
		
		for (int i=0;i<num.length;i++) {
			if (i!=0) {
				System.out.print(",");
			}
			System.out.print(num[i]);
		}

	}

}
