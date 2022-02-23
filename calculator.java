package assignments;

public class calculator {
public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	
}
public int sub(int num1, int num2) {
	
	return num1-num2;
		
}
public double multiple(double num1,double num2) {
	
	return num1*num2;
}
public float divide(float num1,float num2) {
	return num1/num2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculator obj=new calculator();
obj.add();
obj.sub();
obj.multiple();
obj.divide();


	}

}
