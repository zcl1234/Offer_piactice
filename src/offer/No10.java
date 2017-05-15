package offer;

public class No10 {
    // 第一种解法   循环的次数取决于标志数的位数，比如flag为int 32位，那么就循环32 次
	public static int NumOfOne(int n)
	{
		
		int flag=1;
		int count=0;
		while(flag!=0)
		{
			if((n&flag)!=0)
				count++;
			flag=flag<<1;
		}
		return count;
	}
	//第二种解法  循环次数取决于n有几个1   
	//原理：当一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0。
	public static int NumOfOne2(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=(n-1)&n;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(NumOfOne(8));
		System.out.println(NumOfOne2(9));
		
	}
	
}
