package assignments;

public class primenumber {

public static void main(String[] args) {
int number=11;
boolean flag=false;
for (int i = 2; i<=number/2;i++) 
{
if(number%i==0)
{
flag=true;
break;
}
}
if (!flag)
System.out.println(number +" it is prime number");	
else
System.out.println(number +"  not a prime number");
}
}
		



	

