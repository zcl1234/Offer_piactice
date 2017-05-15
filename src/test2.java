/**
 * Created by zhangchenlin on 17/5/6.
 */
public class test2 extends test {


       public static void test(Integer b)
        {
           for(int i=0;i<10;i++)
           {
               b++;
           }
        }

        public static Integer a=1;



        public static void main(String[] args)
        {
            test(a);
            System.out.print(a);
        }
}
