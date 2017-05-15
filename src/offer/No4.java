package offer;
/**
 * 题目:请实现一个函数,把字符串中的每个空格替换成“%20”
 * */
public class No4 {

    public static String Takeplace(String s)
    {
    	String res=new String();
       String[] ss=s.split(" ");
       for(int i=0;i<ss.length;i++)
       {
    	   String a;
    	   a=ss[i]+"%20";
    	   res+=a;
    	 }
       return res;
    }
	public static void main(String[] args)
	{
	    String s="we are happy.";
	       System.out.println(Takeplace(s));
	}
}
