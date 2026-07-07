import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 int ld = 9 ;
		 int sld = 9;
		 int bsl = 1;
		 int day = 7 ;
		 
		 ArrayList<Integer>numbers = new ArrayList<>();
		 int [] initial_numbers= { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		 
		 for (int num:initial_numbers) {
			 numbers.add(num);	 
		 }
		 System.out.print("Enter number to add: ");
		 int numadd = scan.nextInt();
		 numbers.add(numadd);
		 
		 System.out.print("enter number to insert at index"+ ld+": ");
		 int ninsert = scan.nextInt(); 
		 numbers.remove(sld+1);
		 numbers.add(ld,ninsert);
		 numbers.set(bsl,day);
		 
		 System.out.print("\n last number: ");
		 System.out.print(numbers);
		 
			scan.close();	

	}

}
