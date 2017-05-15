package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args)
	{
		ExecutorService exec=Executors.newFixedThreadPool(30);
		final Semaphore se=new Semaphore(10);
		for(int i=0;i<30;i++)
		{
			exec.execute(new Runnable(){
				
				public void run()
				{
					while(true){
					try {
						se.acquire();
						System.out.println(Thread.currentThread()+"可用线程数"+se.availablePermits());
						Thread.sleep(1000);
						se.release();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}
			});
		
		}
		exec.shutdown();
	}
	

	
}
