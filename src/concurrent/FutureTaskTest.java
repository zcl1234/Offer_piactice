package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<FutureTask<Integer>> list=new ArrayList<>();
		ExecutorService exec=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
			FutureTask<Integer> ft=new FutureTask<>(new ComputeTask(i, ""+i));
			list.add(ft);
			exec.execute(ft);
		}
		System.out.println("所有任务提交完毕,主线程开始干其他事情");
		
		Integer totalRInteger=0;
		for(FutureTask<Integer> ft:list)
		{
			try {
				totalRInteger=totalRInteger+ft.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		exec.shutdown();
		System.out.println("计算结果是："+totalRInteger);
	}

}
class ComputeTask implements Callable<Integer>
{
	private Integer result;
	private String taskName;
	public ComputeTask(Integer i,String taskName)
	{
		this.result=i;
		this.taskName=taskName;
		System.out.println("生成字线程任务"+i);
	}
	public String getTaskName()
	{
		return this.taskName;
	}
	@Override
	public Integer call() throws Exception {
		
		for(int i=0;i<100;i++)
		{
			result+=i;
		}
		Thread.sleep(5000);
		System.out.println("子线程计算任务："+taskName+"任务完成");
		return result;
	}
	
}