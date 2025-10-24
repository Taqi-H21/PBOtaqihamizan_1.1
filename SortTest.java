import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(3);
		arr.add(5);
		arr.add(1);
		arr.add(2);
		System.out.println("\nBefore Sorting:");
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println("\nAfter Sorting:");
		System.out.println(arr);
	}

}
