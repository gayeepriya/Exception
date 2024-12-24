package Exception;

import java.util.Scanner;

class ThrowException {

	public static void main(String[] args) 
	{
		try {
			ShowException();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception from different function:");
			}
			}
			 static void ShowException() {
				try {
					
					Scanner sc=new Scanner(System.in);
					System.out.println("Division Operation");
					System.out.println("Enter the numerator:");
					int num=sc.nextInt();//critical statement
					System.out.println("enter the denominator:");
					int deno=sc.nextInt();//critical statement
					int res=num/deno;
					System.out.println(res);
				}
				catch(ArithmeticException e) {
					throw e;
				}
			}
			
				
				
				
		
	}


