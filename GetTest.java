import java.util.ArrayList;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Adrian");
		arr.add("Budi");
		arr.add("Chandra");
		arr.add("Daniel");
		arr.add(null);
		arr.add("Amelia");
		System.out.println(arr);
		
		String s = arr.get(1);
		System.out.println("Index No. 2: " + s);
	}

}
