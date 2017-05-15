package offer;
//题目：输入一个字符串，打印出该字符串中字符的所有排列。
public class No28 {

	private static void arrange(char[] input,int index)
	{
		if(index==input.length-1)
		{
			System.out.println(String.valueOf(input)+" ");
		}
		for(int i=index;i<input.length;i++)
		{
			if(input[i]!=input[index]){
			char temp=input[index];
			input[index]=input[i];
			input[i]=temp;
			
			
					
			arrange(input,index+1);
			 temp=input[index];
			input[index]=input[i];
			input[i]=temp;
			}
			
		}
	}
	
	public static void arrange(String str)
	{
		char[] input=str.toCharArray();
		int index=0;
		arrange(input,index);
	}
	
	public static void main(String[] args)
	{	
		String str="abc";
		arrange(str);
		//permutation(str);
	}
	
}
