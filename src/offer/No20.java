package offer;
/**
 * 题目:输入一个矩阵,按照从外向里以顺时针的顺序依次打印出每一个数字。
 * */
public class No20 {

	public static void PrintCricle(int[][] matrix,int startX,int startY,int endX,int endY)
	{
		if(startX==endX)
		{
		 for(int i=startY;i<=endY;i++)
		 {
			 System.out.println(matrix[startX][i]);
		 }
		 return;
		}
		if(startY==endY)
		{
			for(int i=startX;i<=endX;i++)
			{
				System.out.println(matrix[i][endY]);
			}
			return;
		}
		for(int i=startY;i<endY;i++)
		{
			System.out.println(matrix[startX][i]);
		}
		for(int i=startX;i<endX;i++)
		{
			System.out.println(matrix[i][endY]);
		}
		for(int i=endY;i>startY;i--)
		{
			System.out.println(matrix[endX][i]);
		}
		for(int i=endX;i>startX;i--)
		{
			System.out.println(matrix[i][startY]);
		}
		
		
	}
	
	
	
	public static void printMatrix(int[][] matrix)
	{
		if(matrix==null)
			return;
		int startX=0,startY=0,endX=matrix.length-1,endY=matrix[0].length-1;
		while(startX<=endX&&startY<=endY)
		{
			PrintCricle(matrix, startX, startY, endX, endY);
			startX++;
			startY++;
			endX--;
			endY--;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[][] matrix={
				{1},
				{4},
				{10}
			//	{7,8,9},
			//	{10,11,12}
		};
		
		printMatrix(matrix);

	}

}
