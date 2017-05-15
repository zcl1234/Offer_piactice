package concurrent;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueBlock {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> list=new LinkedBlockingQueue<>();
		new Thread(new taketask(list)).start();
	//	for(int i=0;i<100;i++)
		//{
			new Thread(new puttask(list,1)).start();
		//}
	}

}
class taketask implements Runnable
{
	LinkedBlockingQueue<Integer> takel=new LinkedBlockingQueue<>();
	public  taketask(LinkedBlockingQueue<Integer> list)
	{
		takel=list;
	}
	
	public void run()
	{
		try {
			while(true){
			System.out.println(takel.take());
			Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class puttask implements Runnable
{
	LinkedBlockingQueue<Integer> putl=new LinkedBlockingQueue<>();
	int i;
	public puttask(LinkedBlockingQueue<Integer> list,int i)
	{
		putl=list;
		this.i=i;
	}
	public void run()
	{
		try {
			while(true){
			putl.put(i++);
			Thread.sleep(1000000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}