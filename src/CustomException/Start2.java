package CustomException;

public class Start2 {

		public static void main(String[] args)
		{
			try {
				throw new SimpleException("New Exception");
			}
			catch(SimpleException ex)
			{
				System.out.println("Exception Caught");
				System.out.println(ex.getMessage());
		}
		}


}
