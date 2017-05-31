package SecondEdition;

/**
 *
 * Created by zhangchenlin on 17/5/21.
 */
public class sort {

    /**
     * 选择排序
     * @param a
     */
    public static void select_sort(int[] a)
    {
        if(a.length==0||a==null)
            return;
        int N=a.length;

        for(int i=0;i<N;i++)
        {
            int min=a[i];
            for(int j=i+1;j<N;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

    }

    /**
     * 插入排序
     * @param a
     */
    public static void Insert_sort(int[] a)
    {
        if(a.length==0||a==null)
            return;
        int N=a.length;
        for(int i=1;i<N;i++)
        {
            for(int j=i;j>0&&a[j]<a[j-1];j--)
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }



    /**
     * 希尔排序
     * @param a
     */
    public static void sort(int[] a)
    {
        if((a.length==0)||(a==null))
            return;
        int N=a.length;
        int h=1;
        while(h<N/4) h=4*h+1;
        while(h>=1)
        {
            for(int i=h;i<N;i++) {
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
            h=h/4;
        }
    }

    /*******************归并排序***********************/

    private static int[] aux;
    public static void Merge_sort(int[] a)
    {
        aux=new int[a.length];
        Merge_sort(a,0,a.length-1);
    }


    private static void Merge_sort(int[] a,int lo,int hi)
    {
        if(lo>=hi) return;
        int mid=lo+(hi-lo)/2;

        Merge_sort(a,lo,mid);
        Merge_sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    private static void merge(int[] a,int lo,int mid,int hi)
    {
        int i=lo,j=mid+1;
        for(int k=lo;k<=hi;k++)
        {
            aux[k]=a[k];
        }
        for(int k=lo;k<=hi;k++)
        {
            if(i>mid)     a[k]=aux[j++];
            else if(j>hi) a[k]=aux[i++];
            else if(aux[j]<aux[i]) a[k]=aux[j++];
            else          a[k]=aux[i++];
        }

    }

    /****************快速排序***********************/



    public static void sort_quick(int[] a)
    {
        sort(a,0,a.length-1);
    }



    private static void sort(int[] a,int lo,int hi)
    {
        if(lo>=hi) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }


    private static int partition(int[] a,int lo,int hi)
    {
        int i=lo,j=hi+1;
        int start=a[lo];
        while(true)
        {
            while(a[++i]<=start)
                if(i==hi)
                    break;
            while(a[--j]>=start)
                if(j==lo)
                    break;
            if(i>=j)
                break;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        int temp=a[lo];
        a[lo]=a[j];
        a[j]=temp;
        return j;
    }






    public static void main(String[] args)
    {
        int[] a={2,4,1,3,2,5,2,5,1,3,9,10};
        //sort(a);
      //  select_sort(a);
       // Insert_sort(a);
      //  Merge_sort(a);
     //   int[] b={3,2,2,4};
      //  merge(b,0,1,3);
        sort_quick(a);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
