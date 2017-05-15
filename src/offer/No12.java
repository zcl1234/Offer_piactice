package offer;
/**
 * 题目:输入数字 n,按顺序打印出从 1 到最大的 n 位进制数。比如输入 3,则打 印出 1、2、3 一直到 999.
 * */
public class No12 {

	
	private static  void PrintNumber(char[] number)
	{
		boolean isBegining0=true;
		for(int i=0;i<number.length;i++)
		{
			if(isBegining0&&number[i]!='0')
			   isBegining0=false;
			if(!isBegining0)
			{
				System.out.print(number[i]);
			}
		}
	}
	
	private static boolean IncrementString(char[] number)
	{
		boolean isOverFlow=false;
		int nTakeOver=0;
		int len=number.length;
		
		for(int i=len-1;i>=0;i--)
		{
			
			int num=number[i]+nTakeOver;
			if(i==len-1)
			{
				num++;
			}
			if(num>=10)
			{
				if(i==0)
				{
					isOverFlow=true;
				}else
				{
					num-=10;
					nTakeOver=1;
					number[i]=(char)num;
				}
			}
			else
			{
				number[i]=(char)num;
				break;
			}
		}
			
		
		return isOverFlow;
	}
	
	
	public static void Print1ToMaxOfNDigits(int n) throws Exception
	{
		if(n<=0)
			throw new Exception("无效的输入");
		
		char[] number=new char[n];
		for(int i=0;i<n-1;i++)
			number[i]='0';
		
		while(!IncrementString(number))
		{
			
			PrintNumber(number);
		}
			System.out.println();
	}
	
	public static void Print1ToMaxOfNDigitsRecursively(char[] number,int length,int index)
	{
		if(index==length)
		{
			PrintNumber(number);
			return;
		}
		for(int i=0;i<10;i++)
		{
			number[index+1]=(char)i;
			Print1ToMaxOfNDigitsRecursively(number,length,index+1);
		}
	}
	
	public static void Print1ToMaxOfNDigits_2(int n)
	{
		 char[] number = new char[n + 1];  
		    number[n] = '\0';  
		  
		    for (int i = 0; i < 10; i++)  
		    {  
		        number[0] = (char)i;//整数转为字符串  
		  
		        Print1ToMaxOfNDigitsRecursively(number, n, 0);  
		    }  
		  
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
	char[] a={'9'};
	int num=Integer.parseInt(new String(a));
	System.out.println(num);
	
		
	}
}
