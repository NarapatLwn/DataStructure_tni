
public class TrainLinkedList {

	public static void main(String[] args) {
		
		 LinkedList greenline = new  LinkedList ();
		 
		//ex1,2,3 and 4
		 greenline.insert("mo-chit");
		 greenline.insert("Ari");
		 greenline.insert("Sanam-Pao");
		 System.out.println("All stations: "+ greenline.traversal());
		
		 //ex5,6
		 greenline.insert(2,"Rachakru");
		 System.out.println("All stations: "+ greenline.traversal());
		
		 //ex7
		 System.out.println("total Station = "+greenline.length());
		
		 //ex8
		 System.out.println("First station: "+greenline.get(0));
		
		 //ex9,10
		 greenline.set(0, "Mo-chit(Central ladprao)");
			System.out.println("All stations: "+greenline.traversal());
		
		//ex11,12
			greenline.remove(2);
			System.out.println("All stations: "+greenline.traversal());	
		
		//ex13,14
			greenline.removeLastElement();;
			System.out.println("All stations: "+greenline.traversal());
			
		//ex15
			greenline.clear();
			
		//ex16
			System.out.println("Total stations: "+greenline.length());
			
		//ex17
			 System.out.println("All stations: "+ greenline.traversal());
	}

}
