package assignments;



public class fibonacciseries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum=0;
		
		System.out.println(firstNum);
	for (int i = 0; i < range; i++) {
		sum=firstNum + secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
	}
	
		
		
		// TODO Auto-generated method stub

	}

}
