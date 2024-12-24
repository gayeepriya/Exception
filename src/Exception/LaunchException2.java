package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
class LaunchException2 
{
public static void main(String[] args)
{
	try 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Division Operation");
		System.out.println("Enter the numerator:");
		int num=sc.nextInt();//critical statement
		System.out.println("enter the denominator:");
		int deno=sc.nextInt();//critical statement
		int res=num/deno;
		System.out.println(res);
		System.out.println("Array Operation");
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the position number:");
		int pos=sc.nextInt();
		System.out.println("Enter the value to be added:");
		int val=sc.nextInt();
		arr[pos]=val;
		System.out.println("Data Added");
	}
	//specific catch
	catch(InputMismatchException e1)
			{
		System.out.println("input is not valid");
			}
	catch(ArithmeticException e2)
			{
		System.out.println("Arithmetic Exception occured");
			}
	catch(NegativeArraySizeException e3)
	{
		System.out.println("array size cannot be negative");	
	} 
	catch(ArrayIndexOutOfBoundsException e4)
	{
		System.out.println("specified index is out of range");
	}
	//generic catch
	catch(Exception e)
	{
		System.out.println("exception handled in generic method");
	}
}
}


