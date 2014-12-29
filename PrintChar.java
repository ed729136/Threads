package threads;

//The thread class for printing a specified character a specified number of times
class PrintChar extends Thread
{
	private char charToPrint; // The character to print
	private int times; // The times to repeat
	
	//Construct a thread with specified character and number of times to print the character
	public PrintChar( char charToPrint, int times )
	{
		this.charToPrint = charToPrint;
		this.times = times;
	}

	//Override the run() method to tell the system what the thread will do
	public void run()
	{
		for ( int i = 0; i < times; ++i )
		{
			System.out.print( charToPrint );
		}
	}
}