package cloudvandana;
import java.util.*;

public class ShufflingArray {

	public static void main(String[] args) {
		Integer[] array= {1,2,3,4,5,6};
		List<Integer> list = Arrays.asList(array);
		Collections.shuffle(list);
		list.toArray(array);
		System.out.println(Arrays.toString(array));
		
	}

}
