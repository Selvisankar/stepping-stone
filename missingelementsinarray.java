package assignments;

import java.util.Arrays;

public class missingelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,5,6,7,8,9,10};
Arrays.sort(arr);
for(int i=1;i<=arr.length;i++)
{
	
if(i!=arr[i-1]) {
	System.out.print(i);
break;
}
}
	}

}
