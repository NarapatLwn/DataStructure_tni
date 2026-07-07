import java.util.ArrayList;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
		System.out.println("Lenght ="+numlist.size());
		numlist.add(11);
		numlist.add(12);
		numlist.add(13);
		numlist.add(14);
		numlist.add(15);
		
		System.out.println("Lenght ="+numlist.size());
		System.out.println(numlist);
		
		System.out.print("\nEnter index to update: ");
		int index_update = scan.nextInt();

		System.out.print("\nEnter element to update: ");
		int element_update = scan.nextInt();
		
		numlist.set(index_update,element_update);
		System.out.println(numlist);
		
		//ตำแหน่งที่ต้องการลบ
		System.out.print("Enter index to remove");
		int index_remove = scan.nextInt();
		
		numlist.remove(index_remove);
		System.out.print(numlist);
		
		//ข้อมูลที่ต้องการลบ
		System.out.print("Enter element to remove");
		int element_remove = scan.nextInt();
		
		numlist.remove(Integer.valueOf(element_remove));
		System.out.print(numlist);
	}

}
