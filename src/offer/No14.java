package offer;
/**
 * 题目:输入一个整数数组,
 * 实现一个函数来调整该函数数组中数字的顺序,使得 所有奇数位于数组的前半部分,所有偶数数组位于数组的后半部分。
 * */
public class No14 {

	public static void ReserveArray(int[] array)
	{
		if(array==null||array.length==0)
		{
			return;
		}
		int len=array.length;
		int begin=0;
		int end=len-1;
		while(begin<end)
		{
			if((array[begin]&1)==0&(array[end]&1)!=0)
			{
				changePosition(array, begin, end);
			}
			while(array[begin]%2!=0&&begin<end)
				begin++;
			while(array[end]%2==0&&begin<end)
				end--;
		}
	}
	private static void changePosition(int[] array,int i,int j)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,9,8,3,4,2};
		ReserveArray(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}

}
