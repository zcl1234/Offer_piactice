package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {

	public static void main(String[] args) {
		ForkJoinPool pool=new ForkJoinPool();
		ForkJoinTask<Integer> task=pool.submit(new Calculator(1, 100));
		try {
			long result=task.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Calculator extends RecursiveTask<Integer>
{
	private static final int THRESHOLD=10;
	private int start;
	private int end;
	public Calculator(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	@Override
	//判断是否应该分组
	protected Integer compute() {
		int sum=0;
		if((end-start)<THRESHOLD){
			for(int i=start;i<=end;i++)
				sum+=i;
		}else
		{
			int mid=(start+end)>>>1;
			Calculator left=new Calculator(start, mid);
			Calculator right=new Calculator(mid+1, end);
			//执行子任务
			left.fork();
			right.fork();
			//合并子任务
			sum=left.join()+right.join();
		}
		
		return sum;
	}
	
}