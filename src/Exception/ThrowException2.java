package Exception;

import java.util.Scanner;

class ThrowException2{
		public static void main(String[] args) 
		{
				try {
					ShowException();
					}
					catch(ArithmeticException e)
					{
						System.out.println("Exception from different functions:");
					}
					}
					 static void ShowException() {
						try {
							
							Scanner sc=new Scanner(System.in);
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
						catch( ArithmeticException e) {
							throw e;
						}
					}
					
						
						
						
				
			




			}




