

/**
 * This is the parent class which creates object of Calc class and does the implementation
 * @author a.asfaw
 *
 */
public class MainClass 
{
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		obj.num1 = 2;
		obj.num2 = 10;
		obj.perform(); // the value of variable "result" will be changed from 0 to the sum of num1 and num 2
		System.out.println(obj.result);
	}
}

/**
 * This is a class with memeber variables and method
 * @author a.asfaw
 *
 */
class Calc
{
	int num1;
	int num2;
	int result;
	
	public void perform()
	{	
		result = num1 + num2;
	}
}
