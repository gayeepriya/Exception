package Exception;

import java.util.Scanner;
class LaunchException{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
				System.out.println("enter the numerator:");
					int num=sc.nextInt();
		System.out.println("enter the denominator:");
		int deno=sc.nextInt();
		int res=num/deno;
		System.out.println(res);
	}


}

