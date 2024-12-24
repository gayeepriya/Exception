package Exception;
	import java.util.Scanner;
	class LaunchException1{
		public static void main(String[] args) 
		{
			try
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numerator:");
			int num=sc.nextInt();
			System.out.println("enter the denominator:");
			int deno=sc.nextInt();
			int res=num/deno;
			System.out.println(res);
		}
	     catch(Exception e)
		   {
		   
			   System.out.println("Exception handled");
		   }
			finally
		    {
			   System.out.println("Inside Finally Block");
		   }
	
	}
	}


