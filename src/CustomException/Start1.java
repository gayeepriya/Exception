package CustomException;


	public class Start1{
		public static void main(String[] args)
		{
			try {
				throw new YourException("Before Exception");
			}
			catch(YourException ex)
			{
				System.out.println("Exception found");
				System.out.println(ex.getMessage());
		}
		}

}

