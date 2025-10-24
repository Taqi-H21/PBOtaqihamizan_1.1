import java.util.ArrayList;

public class RemoveTest {

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
		
		arr.remove("Daniel");
		arr.remove(3);
		System.out.println(arr);		
	}

}
