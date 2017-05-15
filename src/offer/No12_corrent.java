package offer;
/**
 * 题目:输入数字 n,按顺序打印出从 1 到最大的 n 位进制数。比如输入 3,则打 印出 1、2、3 一直到 999.
 * */
public class No12_corrent {

	public static boolean Increment(int[] number)
	{
		int len=number.length;
		int Ontoken=0;
		boolean isOverFlow=false;
		
		for(int i=len-1;i>=0;i--)
		{
			int num=number[i]+Ontoken;
			if(i==len-1)
				num++;
			if(num>=10)
			{
				if(i==0){
					isOverFlow=true;
				}else {
					num-=10;
					Ontoken=1;
					number[i]=num;
				}
		   }else {
			   number[i]=num;
		       break;
		   }
		}
		return isOverFlow;
	}
	
	public static void PrintNum(int[] number)
	{
		boolean isBegining0=true;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]!=0&&isBegining0==true)
				isBegining0=false;
			if(!isBegining0)
				System.out.print(number[i]);
		}
		System.out.println();
	}
	
	public static void Print1ToMaxOfNDigits(int n)
	{
		if(n<=0)
			System.out.println(" 输入变量错误");
		int[] number=new int[n];
		for(int i=0;i<n;i++)
			number[i]=0;
		while(!Increment(number))
		    PrintNum(number);
	}
/**********************************************************************/
	
	//递归方法：
	private static void Print1ToMaxOfNDigitsRecursively(int[] number ,int length,int index)
	{	//递归的结束条件
		if(index==length)
		{
			PrintNum(number);
			return;
		}
		for(int i=0;i<10;i++)
		{
			number[index]=i;
			Print1ToMaxOfNDigitsRecursively(number, length, index+1);
		}
	}
	public static void Print1ToMaxOfNDigits_2(int n)
	{
		if(n<=0)
			System.out.println("输入参数错误");
		int[] number=new int[n];
		for(int i=0;i<10;i++){
			number[0]=i;
			Print1ToMaxOfNDigitsRecursively(number, n, 0);
		
		}
	}
	
	
	
	public static void main(String[] args)
	{
		//Print1ToMaxOfNDigits(3);
		Print1ToMaxOfNDigits_2(3);
	}
	
}
