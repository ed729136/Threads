package threads;

import java.util.concurrent.*;

//Class to generate threads by extending the Thread class
public class TestThread 
{
	//Main method
	public static void main( String[] args ) throws InterruptedException, ExecutionException
	{
		int numberOfThreads = Thread.activeCount();
		ExecutorService pool = Executors.newFixedThreadPool( numberOfThreads );
		
		//Create threads
		pool.submit( new PrintChar( 'a', 60 ) ).get();
		pool.submit(new PrintChar( 'b', 60 ) ).get();
		pool.submit(new PrintNum( 60 ) ).get();
	}
}