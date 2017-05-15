package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class CyclicBarrierTest {

	public static void main(String[] args) {
	
		final CyclicBarrier c=new CyclicBarrier(5,new test());
		ExecutorService exec=Executors.newCachedThreadPool();
		for( int i=0;i<5;i++){
		exec.execute(new Runnable(){

			@Override
			public void run() {
				try {
					c.await();
					System.out.println("1");
				} catch (InterruptedException | BrokenBarrierException e) {
					
				}
				
				
			}
			
		});
	//	exec.execute(new test());
		}
	}

}
class test implements Runnable{

//	CyclicBarrier c;
//	public test(CyclicBarrier c)
//	{
//		this.c=c;
//	}
	@Override
	public void run() {
	
	
			System.out.println("test");
		
	}

	
}

















