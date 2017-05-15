package SecondEdition;

/**
 * Created by zhangchenlin on 17/5/5.
 * 逆时针打印矩阵
 */
public class No29 {

    private static void PrintMatrix(int[][] matrix,int startX,int startY,int endX,int endY)
    {
        if(startX==endX)
        {
            for(int i=startY;i<=endY;i++)
            {
                System.out.print(matrix[startX][i]+" ");
            }
            return;
        }
        if(startY==endY)
        {
            for(int i=startX;i<=endX;i++)
            {
                System.out.print(matrix[i][startY]+" ");
            }
            return ;
        }
        for(int i=startX;i<endX;i++)
        {
            System.out.print(matrix[i][startY]+" ");
        }
        for(int i=startY;i<endY;i++)
        {
            System.out.print(matrix[endX][i]+" ");
        }
        for(int i=endX;i>startX;i--)
        {
            System.out.print(matrix[i][endY]+" ");
        }
        for(int i=endY;i>startY;i--)
        {
            System.out.print(matrix[startX][i]+" ");
        }

    }


    public static void PrintMatrix(int[][] matrix)
    {
        int startX=0,startY=0,endX=matrix.length-1,endY=matrix[0].length-1;

        while(startX<=endX&&startY<=endY)
        {
            PrintMatrix(matrix,startX,startY,endX,endY);
            startX++;
            startY++;
            endX--;
            endY--;
        }

    }

        public static  void main(String[] args)
        {
            int[][] matrix={{1,2,3,4},
                    {5,6,7,8},
                   // {9},
                    //{13,14,15,16}
                    };
            PrintMatrix(matrix);
        }


}
