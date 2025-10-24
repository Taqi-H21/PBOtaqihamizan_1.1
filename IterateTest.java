import java.util.ArrayList;

public class IterateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Object");
		arr.add("Programming");
		arr.add(1, "Oriented");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(1) + " ");
		}
		System.out.println();
		for (String str : arr)
			System.out.println(str + " ");
	}

}
