package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {

	public static void main(String[] args) {
	final	ReentrantLock lock=new ReentrantLock();
		final Condition condition=lock.newCondition();

		ExecutorService exec=Executors.newCachedThreadPool();
		
		exec.execute(new Runnable(){
			public void run()
			{
				try {
					lock.lock();
					System.out.println("线程一获取到锁。。。");
					System.out.println("正在等待被唤醒");
					condition.await();
					System.out.println("我被唤醒了");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally
				{
					lock.unlock();
					System.out.println("线程一释放了锁");
				}
			}
			
		});
		exec.execute(new Runnable(){
			public void run()
			{
				try {
					lock.lock();
					System.out.println("线程三获取到锁。。。");
					System.out.println("正在等待被唤醒");
					condition.await();
					System.out.println("线程三被唤醒了");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally
				{
					lock.unlock();
					System.out.println("线程三释放了锁");
				}
			}
			
		});
		exec.execute(new Runnable(){
			public void run()
			{
				try {
					lock.lock();
					System.out.println("线程二获取到锁。。。");
					condition.signalAll();
					System.out.println("我发出了唤醒信号");
				}finally
				{
					lock.unlock();
					System.out.println("线程二释放了锁");
				}
			}
			
		});
		exec.shutdown();
	}

}
