package offer;
/**
 * 题目一:写一个函数,输入 n,求斐波那契数列的第 n 项。
 * */
public class No9 {
	//递归方法，效率不高  耗资源   复杂度是以n的指数增长的
	public static long FBNQ(long n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n>1)
			return FBNQ(n-1)+FBNQ(n-2);
		return -1;
	}
	//实用非递归方法 复杂度为n
	public static long Fibonacci(int n)
	{
		int[] res={0,1};
		if(n<2)
			return res[n];
		
		long fibNumOne=0;
		long fibNumTwo=1;
		long fibRes=0;
		for(int i=2;i<=n;i++)
		{
			fibRes=fibNumOne+fibNumTwo;
			
			fibNumOne=fibNumTwo;
			fibNumTwo=fibRes;
		}
				return fibRes;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Fibonacci(20));
		System.out.println(FBNQ(20));
	}

}
