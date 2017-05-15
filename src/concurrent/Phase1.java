package concurrent;

import java.util.concurrent.Phaser;

public class Phase1 {

	public static void main(String[] args) {
		Phaser phaser =new Phaser(5);
		for(int i=0;i<5;i++)
		{
			Task task=new Task(phaser);
			Thread thread=new Thread(task,"task"+i);
			thread.start();
		}

	}

}
class Task implements Runnable
{
	private Phaser phaser;
	
	public Task(Phaser phaser)
	{
		this.phaser=phaser;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"执行任务完成，等待其它任务完成。");
		
		phaser.arriveAndAwaitAdvance();
		//phaser.awaitAdvance(phaser.getPhase());
		System.out.println(Thread.currentThread().getName()+"go on task...");
	}
}