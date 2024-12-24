package CustomException;


	public class Start{
		public static void main(String[] args)
		{
			try {
				throw new MyException("New Exception");
			}
			catch(MyException ex)
			{
				System.out.println("Exception Caught");
				System.out.println(ex.getMessage());
		}
		}

}
