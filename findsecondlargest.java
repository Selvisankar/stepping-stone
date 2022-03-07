package assignments;

import java.util.Arrays;

public class findsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int length=data.length;
		System.out.println("second largest number is:"+data[length-2]);
	}

}
