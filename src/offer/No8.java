package offer;

public class No8 {

	
	public static int findmin(int[] array)
	{
		if(array.length==0)
		{
			System.out.println("数组长度不能为0");
			return -1;
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>array[i+1])
				return array[i+1];
		}
		return array[0];
	}
	
	//效率较高的解法
	public static int findmin2(int[] array)
	{
		if(array.length==0)
		{
			System.out.println("数组长度不能为0");
			return -1;
		}
		int len=array.length;
		if(array[0]<array[len-1])
			return array[0];
		
		int i=0,j=len-1;
		while(i<j)
		{
			int mid=(i+j)/2;
			if(i+1==j)
			{
				return array[j];
			}
			if(array[i]<=array[mid])
				i=mid;
			else if(array[j]>=array[mid])
				j=mid;
			else if(array[i]==array[mid]&&array[i]==array[j])
			{
				for(int k=i;k<j+1;k++)
					if(array[k]>array[k+1])
						return array[k+1];
			}
				
		}
		
		
		
		
		return -1;
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
	     	int[] a={3,4,5,1,2};
	     	System.out.println(findmin2(a));
	}
	
	
}
