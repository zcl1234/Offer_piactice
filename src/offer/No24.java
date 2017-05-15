package offer;
/**
 * 题目:输入一个整数数组,判断该数组是不是某二叉搜索树的后序遍历的结果。 是则返回true,否则返回false。
 * */
import java.util.Arrays;

public class No24 {

	public static boolean ifReverse(int[] array,int length)
	{
		if(array==null||length<0)
			return false;
		
		int root=array[length-1];
		
		int i=0;
		for(;i<length-1;i++)
		{
			if(array[i]>root)
				break;
		}
		int j=i;
		for(;j<length-1;j++)
		{
			if(array[j]<root)
				return false;
		}
		
		boolean left=true;
		if(i>0)
		left=ifReverse(Arrays.copyOfRange(array, 0, i), i);
		
		boolean right=true;
		if(j<length-1)
		{
			right=ifReverse(Arrays.copyOfRange(array, i, length), length-i-1);
		}
		
		
		return (right&&left);
	}
	
	
	public static void main(String[] args)
	{
		int[] array={7,4,6,5};
		System.out.println(ifReverse(array, array.length));
	}
	
	
	
	
}
