package assignments;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=123;
		int add=0;
		int num=0;
		while(sum%10>0)
		{
			num=sum%10;
			System.out.print(num+" ");
			add=add+num;
			sum=sum/10;
			
		}
		
		System.out.println("="+add);
	}

}
