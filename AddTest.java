import java.util.ArrayList;

public class AddTest {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("Rahma");
		arr.add("Budi");
		arr.add(20);
		arr.add("Cindy");
		arr.add(null);
		System.out.println(arr);
		
		ArrayList arr1 = new ArrayList();
		arr.add("Rahma");
		arr.add("Budi");
		arr.add("Cindy");
		System.out.println(arr1);
		
		arr.addAll(arr1);
		System.out.println(arr);
		/*arr1.addAll(2, arr);
		System.out.println(arr1);*/
		
	}

}
