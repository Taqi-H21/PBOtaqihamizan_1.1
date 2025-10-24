import java.util.ArrayList;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add("Rahma");
		arr.add("Budi");
		arr.add(20);
		arr.add("Cindy");
		arr.add(null);
		System.out.println(arr);
		
		arr.set(4, "Bella");
		System.out.println(arr);
		
		arr.set(2, "Anna");
		System.out.print(arr);
	}

}
