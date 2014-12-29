package threads;

//The thread class for printing number from 1 to n for a given n
class PrintNum extends Thread
{
	private int lastNum;

	//Construct a thread for print 1, 2, ... i
	public PrintNum( int lastNum )
	{
		this.lastNum = lastNum;
	}
	
	//Tell the thread how to run
	public void run()
	{
		for ( int i = 1; i <= lastNum; ++i )
		{
			System.out.print( " " + i );
		}
	}
}