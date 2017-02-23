//anonymous class inside argument

class ThreadDemo // class
{
	public static void main(String[] args) // main method
	{
		new Thread( new Runnable() {
															public void run()
													{
																for (int i=0;i<5 ;i++ )
																{
																	System.out.println("argument");
																}// end for loop
													}// end method run
														}).start(); // end of argument
			for (int i=0;i<5 ;i++ )
			{ // open for
				System.out.println("Main thread");
			}// end main for
	} // end main method
} // end class